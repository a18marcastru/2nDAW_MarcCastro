<template>
    <div>
        <h1>Buscar peliculas</h1>
        <input v-model="nombre" type="text" id="nombre">
        <button class="btn btn-primary" @click="enviarNombre()">Buscar</button>
    </div>

    <div id="container">
        <div id="peliculas" v-for="pel in datos">
            <img :src="pel.Poster"/>
            <ul>
                <li>{{pel.Title}}</li>
                <li>{{pel.Year}}</li>
            </ul>
            <input type="checkbox" @click="favorito()">Pelicula Favorita
        </div>
    </div>
</template>

<script>
export default {
  data() {
    return {
      nombre: "",
      datos: []
    }
  },
  components: {
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
            console.log(data.Search);
            this.datos = data.Search;
        });
    },
    favorito() {
        
    }
  },
}
</script>

<style>
    #container {
        display: grid;
        grid-template-columns: auto auto;
    }
    #peliculas {
        margin-right: 5px;
        border: 5px solid red;
        margin-bottom: 5px;
    }
</style>