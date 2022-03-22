<script>
  import { RouterLink, RouterView } from "vue-router";
</script>

<template>
  <header>
    <img
      alt="Vue logo"
      class="logo"
      src="@/assets/logo.svg"
      width="125"
      height="125"
    />
    <br>
    <div class="wrapper">
      <nav>
        <button><RouterLink class="btn" to="/">Busqueda</RouterLink></button>
        <button><RouterLink class="btn" to="/fav">Favoritas</RouterLink></button>
      </nav>
    </div>
  </header>

  <RouterView />
</template>

<style>
@import "@/assets/base.css";
.wrapper {
  text-align: center;
}
.btn {
  text-decoration: none;
  color: black;
}
h1 {
  color: white;
}
h2 {
  color: white;
}
img {
  display:block;
  margin-left: auto;
  margin-right: auto;
}
button {
  border: 0px;
  border-radius: 12px;
  padding: 10px;
  margin: 5px;
  background-color: #FFA500;
}
body {
  background-image: url("fondo.jpg");
}
</style>
