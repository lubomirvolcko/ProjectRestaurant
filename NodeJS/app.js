var app   = require('express')();
var cors = require('cors');
var http = require('http').Server(app);
var mysql = require('mysql');
var path    = require("path");
var bodyParser = require("body-parser");
const nodemailer = require('nodemailer');
var connection = mysql.createConnection({
		host     : 'localhost',
		user     : 'root',
		password : '',
		database : 'restaurant',
	});



app.use(bodyParser.urlencoded({ extended: false })); 
app.use(bodyParser.json());
app.use(function(req, res, next) {
	res.header("Access-Control-Allow-Origin", "*");
	res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
	next();
  });

	



app.post('/type',cors(),function(req,res){
	var type = req.body.type;
	
	connection.query("SELECT Name,Price,VolumeWeight,composition ,Allergens from food where type like ? ",[type],function(err, rows, fields){
	
      
	res.send(rows);
	console.log(rows);
			
		
	});
});


app.post('/drink',cors(),function(req,res){
	var type = req.body.type;
	
	connection.query("SELECT Name,composition,price,volume from drink where type like ? ",[type],function(err, rows, fields){
	
      
	res.send(rows);
	console.log(rows);
			
		
	});
});

app.post('/review',cors(),function(req,res){
	var name = req.body.name;
	var review = req.body.review;
	var reviewstar= req.body.reviewstar;

	var values =[req.body.name,req.body.review,req.body.reviewstar];
	console.log(review);
	console.log(name);
	console.log(reviewstar);
	console.log(values);


	connection.query("INSERT into reviews(name,review,reviewstar) values (?) ",[values],function(err, rows, fields){
	
      
	res.send(rows);

			
		
	});
});


app.post('/send', (req, res) => {
	var namereservation = req.body.namereservation;
	var surnamereservation = req.body.surnamereservation;
	var emailreservation = req.body.emailreservation;
	var phonereservation = req.body.phonereservation;
	var datereservation = req.body.datereservation;
	var timereservation = req.body.timereservation;

	var valuesreservation =[req.body.namereservation,req.body.surnamereservation,req.body.emailreservation,req.body.phonereservation,req.body.datereservation,req.body.timereservation];

	
	console.log(valuesreservation);
	console.log(timereservation);
	console.log(datereservation);
	console.log(phonereservation);
	console.log(emailreservation);
	console.log(surnamereservation);
	console.log(namereservation);

	connection.query("INSERT into reservation(Name,surname,email,phone,date,time) values (?) ",[valuesreservation],function(err, rows, fields){

		res.send(rows);

			
		
	});

	const output = `
	  <p>Reservation</p>
	  <h3>Reservation</h3>
	  <ul>  
		<li>Name: ${req.body.namereservation}</li>
		<li>Surname: ${req.body.surnamereservation}</li>
		<li>Email: ${req.body.emailreservation}</li>
		<li>Phone: ${req.body.phonereservation}</li>
	  </ul>
	`;
  
	// create reusable transporter object using the default SMTP transport
	let transporter = nodemailer.createTransport({
	  host: 'smtp.gmail.com',
	  port: 465,
	  secure: true, // true for 465, false for other ports
	  auth: {
		  user: 'slavomir.cesla@akademiasovy.sk', // generated ethereal user
		  pass: 'Kosice2018'  // generated ethereal password
	  },
	  tls:{
		rejectUnauthorized:false
	  }
	});
  
	// setup email data with unicode symbols
	let mailOptions = {
		from: 'lubomir.volcko@akademiasovy.sk', // sender address
		to: 'slavomir.cesla@akademiasovy.sk', // list of receivers
		subject: 'Reservation', // Subject line
		text: 'Reservation', // plain text body
		html: output // html body
	};
  
	// send mail with defined transport object
	transporter.sendMail(mailOptions, (error, info) => {
		if (error) {
			return console.log(error);
		}
		console.log('Message sent: %s', info.messageId);   
		console.log('Preview URL: %s', nodemailer.getTestMessageUrl(info));
  
		res.render('contact', {msg:'Email has been sent'});
	});
	});
	

	
	
	app.listen(8080,function(){
	console.log("Connected & Listen to port 8080");
});