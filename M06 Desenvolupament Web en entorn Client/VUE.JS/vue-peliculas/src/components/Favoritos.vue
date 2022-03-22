<!-- Favoritos.vue -->
<template>
    <br>
    <h1 id="titulo">Peliculas favoritas</h1>
    <div id="container">
        <div id="peliculas" v-for="pel in datos">
            <img :src="pel.poster"/>
            <h1>{{pel.title}}</h1>
            <h2>{{pel.year}}</h2>
            <h2>{{pel.type}}</h2>
            <button @click="anlike(pel.id,pel.like)">Like</button>
            <p>{{pel.like}}</p>
            <button id="dis" @click="andislike(pel.id,pel.dislike)">Dislike</button>
            <p>{{pel.dislike}}</p>
            <br>
            <button @click="eliminar(pel.id)">Eliminar</button>
        </div>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                like: '',
                dislike: '',
                datos: []
            }
        },
        components: {
        },
        methods: {
            eliminar(id) {
                console.log(id);
                fetch(`http://peliculas.a18marcastru.alumnes.inspedralbes.cat/api.php/records/favoritas/${id}`,{
                    method: 'DELETE'
                }).then(res => res.json())
                .then((data) => {
                    this.actualizarDatos();
                });
            },
            anlike(id,like) {
                console.log(id)
                like++;
                const newlike = {
                    like: like
                }
                fetch(`http://peliculas.a18marcastru.alumnes.inspedralbes.cat/api.php/records/favoritas/${id}`, {
                    method: 'PUT',
                    headers: {
                    'Content-type': 'application/json; charset=UTF-8' 
                    },
                    body: JSON.stringify(newlike)
                }).then(res => res.json())
                .then((data) => {
                    this.actualizarDatos();
                });
            },
            andislike(id,dislike) {
                console.log(id)
                dislike++;
                const newdislike = {
                    dislike: dislike
                }
                fetch(`http://peliculas.a18marcastru.alumnes.inspedralbes.cat/api.php/records/favoritas/${id}`, {
                    method: 'PUT',
                    headers: {
                    'Content-type': 'application/json; charset=UTF-8'
                    },
                    body: JSON.stringify(newdislike)
                }).then(res => res.json())
                .then((data) => {
                    this.actualizarDatos();
                });
            },
             actualizarDatos() {
                fetch(`http://peliculas.a18marcastru.alumnes.inspedralbes.cat/api.php/records/favoritas`)
                .then(res => res.json())
                .then((data) => {
                    this.datos = data.records;
                    console.log(data);
                });
            }
        },
        mounted() {
            this.actualizarDatos();
        },
       
    }
</script>

<style>
    #dis {
        margin-left: 5px;
    }
    p {
        color: white;
    }
    li {
        color: white;
    }
    #titulo {
        text-align: center;
    }
</style>