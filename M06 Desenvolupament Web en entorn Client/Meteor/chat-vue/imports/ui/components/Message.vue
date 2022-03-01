<template>
    <div id="mensajes">
        <p>{{infoMsg.content}}<br><small>{{infoMsg.usuario}}</small><br><br>{{infoMsg.createdAt}}</p>
    </div>
</template>
<script>
export default {
    props: ['infoMsg']
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