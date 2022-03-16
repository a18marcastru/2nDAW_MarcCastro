<!-- FavoritasPeliculas.vue -->
<script>
export default {
    props: ['infoPeliFav'],
    components: {
        },
        methods: {
            buscar() {
                fetch(`http://peliculas.a18marcastru.alumnes.inspedralbes.cat/api.php/records/favoritas`)
                .then(res => res.json())
                .then((data) => {
                    this.datos = data.records;
                    console.log(data);
                });
            }
        },
    
    }
</script>

<template>
    <div id="peliculas">
            <img :src="infoPeliFav.poster"/>
            <ul>
                <li>{{infoPeliFav.title}}</li>
                <li>{{infoPeliFav.year}}</li>
            </ul>
        </div>
</template>

<style>
    #peliculas {
        margin-right: 5px;
        border: 5px solid red;
        margin-bottom: 5px;
    }
</style>