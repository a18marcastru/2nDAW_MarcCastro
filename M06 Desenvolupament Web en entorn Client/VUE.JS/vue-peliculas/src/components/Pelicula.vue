<!-- Pelicula.vue -->
<script>
export default {
    data() {
        return {
            anadir: false,
        }
    },
    props: ['infoPeli'],  
    methods:{
        favorito() {
            this.anadir = true;
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
        },
    },
}
</script>

<template>
    <div id="peliculas">
        <img :src="infoPeli.Poster"/>
        <h1>{{infoPeli.Title}}</h1>
        <h2>{{infoPeli.Year}}</h2>
        <h2>{{infoPeli.Type}}</h2>
        <button v-if="!anadir" type="button" @click="favorito()">Añadir</button>
        <p v-if="anadir" for="">Ya esta añadido!</p>
    </div>
</template>