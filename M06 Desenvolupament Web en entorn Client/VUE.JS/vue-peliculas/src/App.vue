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

    <div class="wrapper">
      <nav>
        <RouterLink id="bus" to="/">Busqueda</RouterLink>
        <RouterLink id="favo" to="/fav">Peliculas favoritas</RouterLink>
      </nav>
    </div>
  </header>

  <RouterView />
</template>

<style>
@import "@/assets/base.css";
#bus {
  border: 2px solid white;
  background-color: white;
  color: black;
  margin-right: 5px;
  margin-left: 5px;
  text-decoration: none;
}
#favo {
  border: 2px solid white;
  background-color: white;
  color: black;
  margin-right: 5px;
  margin-left: 5px;
  text-decoration: none;
}
</style>
