var app   = require('express')();
var cors = require('cors');
var http = require('http').Server(app);
var mysql = require('mysql');
var path    = require("path");
var bodyParser = require("body-parser");
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

	


/*app.get('/data', cors(),function(req,res,next){


	connection.query("SELECT Name,Price,VolumeWeight,composition ,Allergens from food where type like ? ",function(err, rows, fields){
		
		if(rows.length != 0){
			
			
			res.send(rows);
		}else{
			
			res.send(rows);
		}
	});
});*/

app.post('/type',cors(),function(req,res){
	var type = req.body.type;
	
	connection.query("SELECT Name,Price,VolumeWeight,composition ,Allergens from food where type like ? ",[type],function(err, rows, fields){
	
      
	res.send(rows);
	console.log(rows);
			
		
	});
});


app.post('/users', function (req, res) {
    connection.query('INSERT INTO users SET ?', req.body, 
        function (err, result) {
            if (err) throw err;
            res.send('User added to database with ID: ' + result.insertId);
        }
    );
});

	
http.listen(8080,function(){
	console.log("Connected & Listen to port 8080");
});