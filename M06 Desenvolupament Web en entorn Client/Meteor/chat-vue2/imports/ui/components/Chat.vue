<template>
  <div>
    <h2>Chat</h2>
    <form class="info-link-add">
      <input type="text" v-model="content" name="mensaje" placeholder="Mensaje" required>
      <input type="submit" name="submit" @click="submit($event)" value="Add new link">
    </form>
    <p :key=index v-for="(message,index) in messages">{{message.content}}</p>
  </div>
</template>

<script>
import Messages from '../../api/collections/Messages.js'

export default {
  data() {
    return {
      content: "",
    }
  },
  meteor: {
    $subscribe: {
      'messages': [],
    },
    messages () {
      return Messages.find({}, {sort: {createdAt: -1 }})
    },
  },
  methods: {
    submit(event) {
      event.preventDefault()
      Meteor.call('createMessages', this.content, (error) => {
        console.log(this.content)
        if (error) {
          alert(error.error)
          console.log("peta!")
        } else {
          this.content = ''
        }
      })
    }
  },
}
</script>

<style scoped>
  p {
    font-family: Arial, Helvetica, sans-serif;
    border: 1px solid black;
    padding: 5px;
  }
</style>
