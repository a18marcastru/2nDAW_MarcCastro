<script>
  import Gato from './components/Gato.vue';

  export default {
    components: {
      Gato
    },
    data() {
      return {
        catActive: 0,
        gatos: [
          { name: "Michifu", content: "Mi gato Michifu", image: "./public/img/cat.jpg", nclicks: 0 },
          { name: "Minino", content: "Mi gato Minino", image: "./public/img/cat2.jpg", nclicks: 0 },
          { name: "Garfield", content: "Mi gato Garfield", image: "./public/img/cat3.jpg", nclicks: 0 },
          { name: "Roberto", content: "Mi gato Roberto", image: "./public/img/cat4.jpg", nclicks: 0 }
        ]
      }
    }
  }
</script>

<template>
  <header>
    <br>
    <img alt="Vue logo" class="logo" src="./assets/logo.svg" width="125" height="125" />
  </header>
  <main>
    <div id="app">
        <ul>
            <li :class="{active: catActive==index}" @click="cambioGatos(index)" :key=index v-for="(item, index) in gatos">
                {{item.name}}
            </li>
        </ul>

        <div>
          <hr>
          <Gato :infoGato="gatos[catActive]"
          @like="gatos[catActive].nclicks++"
          @dislike="gatos[catActive].nclicks--"/>
        </div>
    </div>
  </main>
</template>

<style>
@import './assets/base.css';
.active {
  color: red;
}
img {
  width: 300px;
}


</style>
