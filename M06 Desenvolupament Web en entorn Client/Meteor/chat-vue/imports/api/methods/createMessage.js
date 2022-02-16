import { Meteor } from 'meteor/meteor';
import { check } from 'meteor/check';
import Messages from '../collections/Messages.js';

Meteor.methods ({
    'createMessage'(content) {
        check(content, String);

        return Messages.insert({
            content,
            createdAt: new Date()
        });
    },
});