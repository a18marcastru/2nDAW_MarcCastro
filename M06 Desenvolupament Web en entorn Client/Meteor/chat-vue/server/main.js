import '../imports/api/fixtures'
import '../imports/api/methods'
import '../imports/api/publications'

import Encuesta from '../imports/api/collections/Encuesta';

Meteor.startup(() => {
    console.log("Intento insertar");
    if(Encuesta.find().count() === 0) {
        console.log("Insertando");
        Encuesta.insert({"id":1,"votos":0});
        Encuesta.insert({"id":2,"votos":0});
        Encuesta.insert({"id":3,"votos":0});
        Encuesta.insert({"id":4,"votos":0});
    }
});