import { Meteor } from 'meteor/meteor';
import { check } from 'meteor/check';
import Messages from '../collections/Messages.js';

Meteor.methods ({
  'createMessages'(content) {
    console.log("hola")
    check(content, String);
    
    return Messages.insert({
      content,
      createdAt: new Date()
    });
  },
});