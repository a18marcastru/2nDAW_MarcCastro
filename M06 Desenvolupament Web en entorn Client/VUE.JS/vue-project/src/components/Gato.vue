<!-- Gato.vue -->
<script>
export default {
  props: ['infoGato'],
  emits: ['like','dislike']
}
</script>

<template>
    <div>
        <h1>Hola somos gatos componente</h1>
        <br>
        <h3>{{infoGato.content}}</h3>
        <h3>{{infoGato.nclicks}}{{infoGato.nclicks != 1 ? " clicks" : " click"}}</h3>
        <button class="btn btn-primary" @click="$emit('like')">Like</button>
        <button class="btn btn-danger" @click="$emit('dislike')">Dislike</button>
        <br>
        <img :src="infoGato.image" alt=""/>
    </div>
</template>