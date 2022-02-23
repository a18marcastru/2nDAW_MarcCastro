<template>
  <div>
    <h2>Chat!</h2>
    <input type="text" v-model="usuario" name="title" placeholder="Usuario" required>
    <input type="text" v-model="content" name="title" placeholder="Mensaje" required>
    <input type="submit" name="submit" @click="enviarMensaje($event)" value="ENVIAR">

          <Mens :infoMsg="msg" 
          :key="index" 
          v-for="(msg,index) in messages"/>


  </div>
</template>

<script>
import Messages from '../../api/collections/Messages'
import Mens from './Message.vue'

export default {
  data() {
    return {
      content: "",
      usuario:""
    }
  },
  components: {
    Mens,
  },
  meteor: {
    $subscribe: {
      'messages': [],
    },
    messages () {
      return Messages.find({},{sort: {createdAt: -1}})
    },
  },
  methods: {
    enviarMensaje() {
    
      Meteor.call('createMessage', this.content, this.usuario, (error) => {
        if (error) {
          alert(error.error)
        } else {
          this.content = '',
          this.usuario = ''
        }
      });
    }
  },
}
</script>

<style scoped>

</style>
