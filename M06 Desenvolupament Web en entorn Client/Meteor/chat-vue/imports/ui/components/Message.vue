<template>
    <div id="mensajes">
        <p>Mensaje: {{infoMsg.content}}<br><small>Usuario: {{infoMsg.usuario}}</small><br><br>{{horaUltima}}</p>
    </div>
</template>
<script>
export default {
    props: ['infoMsg'],
    computed: {
        horaUltima() {
            return moment(this.infoMsg.createdAt).fromNow();
        }
    }
}
</script>
<style scoped>
    p {
        font-family: Arial, Helvetica, sans-serif;
        border: 1px solid black;
        padding: 5px;
        margin: 10px;
        color: white;
    }
    #mensajes {
        margin-top: 10px;
        padding: 5px;
        background-color: grey;
    }
</style>