<template>
    <div id="mensajes">
        <p>{{infoMsg.content}}<br>{{infoMsg.usuario}}<br>{{infoMsg.createdAt}}</p>
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
    }
    #mensajes {
        padding: 5px;
        background-color: grey;
    }
</style>