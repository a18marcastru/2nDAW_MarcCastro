<template>
  <div>
    <h2>Mensajes</h2>
    <FormInput/>
    
    <input type="text" v-model="content" name="title" placeholder="mensaje">
    <button @click="enviarMens()">Enviar</button>
  </div>
</template>

<script>
import Messages from './Messages.vue'

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
      return Messages.find({},{sort: { createdAt: -1} })
    },
  },
  methods: {
    enviarMensaje() {
      Meteor.call('createMessages', this.content, (error) => {
        if (error) {
          alert(error.error)
        } else {
          this.content = "";
        }
      })
    }
  },
}
</script>

<style scoped>
  ul {
    font-family: monospace;
  }
</style>