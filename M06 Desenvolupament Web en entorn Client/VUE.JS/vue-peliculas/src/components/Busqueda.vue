<!-- Busqueda.vue -->
<template>
<br>
    <div id="vista">
        <h1>Buscar peliculas</h1>
        <input v-model="nombre" type="text" id="nombre" size="40">
        <br><br>
        <button class="btn btn-primary" @click="enviarNombre()">Buscar</button>
    </div>
    <br>
    <div id="container">
        <Pelicula  :infoPeli="pel"
        v-for="pel in datos">
        </Pelicula>
    </div>
</template>

<script>
import Pelicula from './Pelicula.vue';
export default {
  data() {
    return {
      nombre: "",
      datos: []
    }
  },
  components: {
      Pelicula
  },
  methods: {
    enviarNombre() {
        fetch(`https://www.omdbapi.com/?apikey=35bd8c4e&s=${this.nombre}`)
        .then(res => res.json())
        .then((data) => {
            this.datos = data.Search;
            console.log(this.datos);
        });
    }
  },
}
</script>

<style>
    #container {
      display: grid;
      grid-template-columns: auto auto auto;
    }
    #peliculas {
      text-align: center;
      margin-bottom: 20px;
    }
    #vista {
      text-align: center;
    }
</style>