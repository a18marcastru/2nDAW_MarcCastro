import { Meteor } from 'meteor/meteor';
import Encuesta from '../collections/Encuesta.js';

Meteor.publish('encuesta', function () {
  return Encuesta.find();
});
