<!--Administrador.vue-->
<script>
    export default {
        props:['gato'],
        data() {
            return {
                adminVisi: false
            }
        },
        methods: {
            administrador: function() {
                if(this.adminVisi == true)this.adminVisi = false;
                else this.adminVisi = true;
            }
        }
    }
</script>
<template>
    <div>
    <button class="btn btn-info" @click="administrador()">Admin</button>
    <br>
    <div v-if="adminVisi">
        <br>
        Nombre: <input type="text" v-model="gato.name">
        Clicks: <input type="text" v-model="gato.nclicks">
        Contenido: <input type="text" v-model="gato.content">
    </div>
    <br>
    </div>
</template>
