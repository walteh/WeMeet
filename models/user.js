var mongoose = require('mongoose');  
var bcrypt   = require('bcrypt-nodejs');

var userSchema = mongoose.Schema({  
    _id: String,
    username: String
});

userSchema.methods.generateHash = function(password) {
  return bcrypt.hashSync(password, bcrypt.genSaltSync(8), null);
};
userSchema.methods.validPassword = function(password) {  
  return bcrypt.compareSync(password, this.local.password);
};
module.exports = mongoose.model('User', userSchema);



// var userSchema = mongoose.Schema({  
//     _id: String,
//     slackid: String,
//     token: String,
//     email: String,
//     name: String,
//     platform: String,
//     isActive: String,
//     activationCode: String,
//     pawsid: String,
//     image_1024: String,
//     displayName: String,
//     section: String,
//     isAdmin: String,
//     treatment: String,
//     accessType: String,
//     slackDomain: String,
// });


