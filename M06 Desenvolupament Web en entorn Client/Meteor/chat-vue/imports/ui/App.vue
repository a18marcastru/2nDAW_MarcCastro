<template>
  <div>
    <h1>Chat</h1>
    <Chat/>
  </div>
</template>

<script>
import Chat from "./components/Chat.vue"

export default {
  components: {
    Chat
  },
}
</script>

<style>
  body {
    font-family: sans-serif;
    padding: 10px;
  }
</style>
