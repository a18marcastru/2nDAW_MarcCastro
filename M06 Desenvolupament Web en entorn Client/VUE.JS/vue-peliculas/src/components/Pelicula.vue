<!-- Pelicula.vue -->
<script>
export default {
  props: ['infoPeli'],  
  methods:{
    favorito() {
        console.log(this.infoPeli.Title)

        const datosEnvio = new FormData();
        datosEnvio.append('imdbID', this.infoPeli.imdbID);
        datosEnvio.append('title', this.infoPeli.Title);
        datosEnvio.append('poster', this.infoPeli.Poster);
        datosEnvio.append('year', this.infoPeli.Year);
        datosEnvio.append('type', this.infoPeli.Type);
        fetch('http://peliculas.a18marcastru.alumnes.inspedralbes.cat/api.php/records/favoritas', {
            method: 'POST',
            body: datosEnvio
        }).then(function (res) {
            return res.json();
        }).then(function (data) {
            console.log(data);
        });
    }
  }
}
</script>

<template>
    <div id="peliculas">
       <img :src="infoPeli.Poster"/>
            <ul>
                <li>{{infoPeli.Title}}</li>
                <li>{{infoPeli.Year}}</li>
            </ul>
            <input type="button" @click="favorito()" value="Añadir">
    </div>
</template>

<style>
    #peliculas {
        margin-right: 5px;
        border: 5px solid red;
        margin-bottom: 5px;
    }
</style>