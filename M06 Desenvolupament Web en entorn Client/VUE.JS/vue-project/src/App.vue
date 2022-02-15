<script>
  import Gato from './components/Gato.vue';
  import Admin from './components/Administrador.vue';

  export default {
    beforeMount(){
      console.log('Iniciando aplicacion.');
      let gatosIniciales = localStorage.getItem("gatos");
      if(gatosIniciales == null) {
        console.log("No hay gatos");
        this.gatos = [
          { name: "Michifu", content: "Mi gato Michifu", image: "./public/img/cat.jpg", nclicks: 0 },
          { name: "Minino", content: "Mi gato Minino", image: "./public/img/cat2.jpg", nclicks: 0 },
          { name: "Garfield", content: "Mi gato Garfield", image: "./public/img/cat3.jpg", nclicks: 0 },
          { name: "Roberto", content: "Mi gato Roberto", image: "./public/img/cat4.jpg", nclicks: 0 }
        ]
      }
      else {
        console.log("Ya hay gatos");
        this.gatos = JSON.parse(gatosIniciales);
      }
    },
    components: {
      Gato,
      Admin
    },
    data() {
      return {
        catActive: 0,
        gatos: ''
      }
    },
    methods: {
      cambioGatos: function(index){
        this.catActive = index;
      },
      guardarInfo: function() {
        localStorage.setItem("gatos",JSON.stringify(this.gatos));
      }
    },
  }
</script>

<template>
<div>
  <header>
    <br>
    <img alt="Vue logo" class="logo" src="./assets/logo.svg" width="125" height="125" />
  </header>
  <main>
    <Admin :gato="gatos[catActive]"/>
    <button class="btn btn-success" @click="guardarInfo">Guardar informacion</button>
    <ul>
      <br>
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
  </main>
</div>
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
