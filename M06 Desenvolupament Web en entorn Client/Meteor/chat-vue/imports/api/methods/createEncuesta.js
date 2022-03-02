import { Meteor } from 'meteor/meteor';
import { check } from 'meteor/check';
import Encuesta from '../collections/Encuesta.js';

Meteor.methods({
  'createEncuesta'(opcion) {
    return Encuesta.update(
        {"id": opcion},
        {$inc: {"votos": 1}});
  },
});
