const express = require('express')
const app = express()
const port = 3000



var express = require('express');  
var path = require('path');  
var favicon = require('serve-favicon');  
var logger = require('morgan');  
var cookieParser = require('cookie-parser');  
var bodyParser = require('body-parser');
var http = require("http");
var https = require("https");
var fs = require('fs');

// define the environement variable
var env = process.env.NODE_ENV

var routes = require('./routes/index');  
var users = require('./routes/users');
var is = require('./routes/is');
var word = require('./routes/word');
var excel = require('./routes/excel');
// var slides = require('./routes/slides');

var HTTPport = process.env.PORThttp || 80;
var HTTPSport = process.env.PORThttps || 443;

var passport = require('passport');
var LocalStrategy = require('passport-local').Strategy;
var mongoose = require('mongoose');
var flash = require('connect-flash');
var session = require('express-session');

var configDB = require('./config/database.js');
mongoose.connect(configDB.url);






app.get('/', (req, res) => res.send('Whadddupppp motherfuckaaaaaaa!'))

app.listen(port, () => console.log(`Example app listening on port ${port}!`))