var app   = require('express')();
var cors = require('cors');
var http = require('http').Server(app);
var mysql = require('mysql');
var bodyParser = require("body-parser");
var connection = mysql.createConnection({
		host     : 'localhost',
		user     : 'root',
		password : '',
		database : 'restaurant',
	});



app.use(bodyParser.urlencoded({ extended: false })); 
app.use(bodyParser.json());

	


app.get('/data', cors(),function(req,res,next){

	
	connection.query("SELECT name from drink",function(err, rows, fields){
		if(rows.length != 0){
			
			res.send(rows);
		}else{
			
			res.send(rows);
		}
	});
});

app.post('/login',cors(),function(req,res){
	var firstname = req.body.firstname;
	
	connection.query("SELECT * from users WHERE firstname like ?" ,[firstname],function(err, rows, fields){
		if(rows.length != 0){
      
    res.send(rows);
			
		}
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