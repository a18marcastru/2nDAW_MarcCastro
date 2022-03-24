<script>
export default {
  props: ['infoLlibres'],
}
</script>

<template>
  <div class="container">
    <div class="libros">
      <h1>{{infoLlibres.title}}</h1>
      <img :src="infoLlibres.cover" width="500" height="500"/>
      <h2>{{infoLlibres.author}}</h2>
      <p>{{infoLlibres.summary}}</p>
      <p>Likes: {{infoLlibres.likes}}</p>
      <p>Dislikes: {{infoLlibres.dislikes}}</p>
    </div>
  </div>
</template>

<style scoped>
  .libros {
    margin: 5px;
    text-align: center;
  }
</style>
