<template>
    <br>
    <h1 id="titulo">Peliculas Favoritas</h1>
    <div id="container">
        <div id="peliculas" v-for="pel in datos">
            <img :src="pel.poster"/>
            <ul>
                <li>{{pel.title}}</li>
                <li>{{pel.year}}</li>
            </ul>
            <input type="button" @click="anadlike(pel.id,pel.like)" value="Like"/>
            <label>{{pel.like}}</label>
            <input id="dis" type="button" @click="anaddislike(pel.id,pel.dislike)" value="Dislike"/>
            <label>{{pel.dislike}}</label>
            <br>
            <input type="button" @click="eliminar(pel.id)" value="Eliminar">
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
            anadlike(id,like) {
                console.log(id)
                like++;
                const newlike = {
                    like: like
                }
                fetch(`http://peliculas.a18marcastru.alumnes.inspedralbes.cat/api.php/records/favoritas/${id}`, {
                    method: 'PUT',
                    headers: {
                    'Content-type': 'application/json; charset=UTF-8' // Indicates the content 
                    },
                    body: JSON.stringify(newlike) // We send data in JSON format
                }).then(res => res.json())
                .then((data) => {
                    this.actualizarDatos();
                });
            },
            anaddislike(id,dislike) {
                console.log(id)
                dislike++;
                const newdislike = {
                    dislike: dislike
                }
                fetch(`http://peliculas.a18marcastru.alumnes.inspedralbes.cat/api.php/records/favoritas/${id}`, {
                    method: 'PUT',
                    headers: {
                    'Content-type': 'application/json; charset=UTF-8' // Indicates the content 
                    },
                    body: JSON.stringify(newdislike) // We send data in JSON format
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
    label {
        color: white;
    }
    li {
        color: white;
    }
    #titulo {
        text-align: center;
    }
</style>