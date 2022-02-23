import { Meteor } from 'meteor/meteor';
import { check } from 'meteor/check';
import Messages from '../collections/Messages.js';

Meteor.methods({
  'createMessage'(content, usuario) {
    
    check(content, String);
    check(usuario, String);

    return Messages.insert({
      content,
      usuario,
      createdAt: new Date(),
    });
  },
});
