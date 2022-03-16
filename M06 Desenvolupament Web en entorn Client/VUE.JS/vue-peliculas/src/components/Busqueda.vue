<template>
    <div>
        <h1>Buscar peliculas</h1>
        <input v-model="nombre" type="text" id="nombre">
        <button class="btn btn-primary" @click="enviarNombre()">Buscar</button>
    </div>

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
        // var e = this
        // fetch(`https://www.omdbapi.com/?apikey=35bd8c4e&s=${e.nombre}`)
        // .then(function(res){
        //     return res.json();
        // })
        // .then(function(data) {
        //     console.log(data.Search);
        //     e.datos = data.Search;
        // });
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
        grid-template-columns: auto auto;
    }
</style>