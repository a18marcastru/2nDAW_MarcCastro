<template>
  <div>
    <h2>Encuesta! 🗳️</h2>

    <Encuesta/>

    <h2>Chat! ✉️</h2>
    <div id="anoni">
      <label>Anonimo</label>
      <input type="checkbox" v-model="anonimo"/>
    </div>
    <div v-if="!anonimo">
      <input class="mens" type="text" v-model="usuario" name="title" placeholder="Usuario" size="40" required>
    </div>
    <br>
    <input class="mens" type="text" v-model="content" name="title" placeholder="Mensaje" size="40" required>
    <br>
    <input class="mens" type="submit" name="submit" @click="enviarMensaje()" value="ENVIAR">
              
        <Mens :infoMsg="msg" 
        :key="index" 
        v-for="(msg,index) in messages"/>
        
  </div>
</template>

<script>
import Messages from '../../api/collections/Messages'
import Mens from './Message.vue'
import Encuesta from './Encuesta.vue'

export default {
  data() {
    return {
      content: "",
      usuario: "Anonimo",
      anonimo: true
    }
  },
  components: {
    Mens,
    Encuesta
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
  h2 {
    border: 1px solid black;
    padding: 10px;
    text-align: center;
    color: white;
    background-color: purple;
  }
  .mens {
    display: block;
    margin-left: auto;
    margin-right: auto;
  }
  #anoni {
    color: white;
    margin-right: 50%;
    margin-left: 50%;
  }
</style>
