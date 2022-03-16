<template>
    <h1>Peliculas Favoritas</h1>
    <div>
        <div id="peliculas" v-for="pel in datos">
            <img :src="pel.poster"/>
            <ul>
                <li>{{pel.title}}</li>
                <li>{{pel.year}}</li>
            </ul>
        </div>
    </div>
</template>

<script>
    export default {
        data() {
            return {
            datos: []
            }
        },
        components: {
        },
        methods: {
        },
        mounted() {
            fetch(`http://peliculas.a18marcastru.alumnes.inspedralbes.cat/api.php/records/favoritas`)
                .then(res => res.json())
                .then((data) => {
                    this.datos = data.records;
                    console.log(data);
                });
        }
    }
</script>