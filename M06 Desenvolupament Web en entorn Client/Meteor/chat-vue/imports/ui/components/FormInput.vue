<template>
    <div>
        <input type="text">
        <button type="button" class="btn btn-primary" @click="increment">Enviar</button>
    </div>
</template>
<script>
export default {
    data() {
        return {
            counter: 0,
        }
    },
}
</script>
<style scoped>
    p {
        font-family: serif;
    }
    div {
        background: red;
    }
</style>