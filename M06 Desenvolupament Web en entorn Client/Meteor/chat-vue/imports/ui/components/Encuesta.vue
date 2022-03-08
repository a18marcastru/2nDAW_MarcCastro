<template>
<div>
    <div :key="index" v-for="(opcion, index) in encuesta">
        <button class="btn btn-primary" @click="incrementar(opcion.id)">Voto {{opcion.id}}</button><small>{{opcion.votos}}</small>
    </div>
 </div>
</template>

<script>
    import Encuesta from '../../api/collections/Encuesta'

    export default {
        data() {
            return {
            }
        },
        components: {
        },
        meteor: {
            $subscribe: {
            'encuesta': [],
            },
            encuesta() {
                return Encuesta.find();
            }
        },
        methods: {
            incrementar(opcion) {
            Meteor.call('createEncuesta', opcion, (error) => {
                if (error) {
                alert(error.error)
                } else {
                }
            });
            }
        },
    }
</script>

<style>
    small {
        color: white;
        margin-left: 5px;
    }
</style>