<template>
    <div>
        <p>{{message.content}}</p>
        <small>{{message.createdAt}}</small>
    </div>
</template>

<script>
export default {
    props: ['message']
}
</script>

<style scoped>

</style>