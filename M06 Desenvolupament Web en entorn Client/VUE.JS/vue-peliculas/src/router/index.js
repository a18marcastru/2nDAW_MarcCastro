import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";
import AboutView from "../views/AboutView.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "Busqueda",
      component: HomeView,
    },
    {
      path: "/fav",
      name: "Peliculas favoritas",
      component: AboutView,
    },
  ],
});

export default router;
