var mongoose = require('mongoose');  
var bcrypt   = require('bcrypt-nodejs');

var eventSchema = mongoose.Schema({  
    _id: String,
    eventName: String,
    date: Date,
    description: String,
    creator: String,
    invitees: [String],
    comments: [String]
});

userSchema.methods.generateHash = function(password) {
  return bcrypt.hashSync(password, bcrypt.genSaltSync(8), null);
};
userSchema.methods.validPassword = function(password) {  
  return bcrypt.compareSync(password, this.local.password);
};
module.exports = mongoose.model('Event', eventSchema);


