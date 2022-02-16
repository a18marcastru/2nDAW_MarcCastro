<template>
    <div class="mensaje">
        Aqui va el Login
        <input type="checkbox"  >
    </div>
</template>

<script>
export default {
    data() {
        return {
            anonimo: true,
            usuario: ''
        }
    }
}
</script>

<style scoped>
    .mensaje {
        border: 1px black solid;
        padding: 10px;
        margin: 5px;
    }
</style>