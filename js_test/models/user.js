var mongoose = require('mongoose');  
var bcrypt   = require('bcrypt-nodejs');

var UserSchema = new mongoose.Schema({
  email: {
    type: String,
    unique: true,
    required: true,
    trim: true
  },
  username: {
    type: String,
    unique: true,
    required: true,
    trim: true
  },
  password: {
    type: String,
    required: true,
  },
  passwordConf: {
    type: String,
    required: true,
  }
});
var User = mongoose.model('User', UserSchema);
module.exports = User;




// if (req.body.email &&
//   req.body.username &&
//   req.body.password &&
//   req.body.passwordConf) {
//   var userData = {
//     email: req.body.email,
//     username: req.body.username,
//     password: req.body.password,
//     passwordConf: req.body.passwordConf,
//   }
//   //use schema.create to insert data into the db
//   User.create(userData, function (err, user) {
//     if (err) {
//       return next(err)
//     } else {
//       return res.redirect('/profile');
//     }
//   });
// }

// userSchema.methods.generateHash = function(password) {
//   return bcrypt.hashSync(password, bcrypt.genSaltSync(8), null);
// };
// userSchema.methods.validPassword = function(password) {  
//   return bcrypt.compareSync(password, this.local.password);
// };
// module.exports = mongoose.model('User', userSchema);



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


