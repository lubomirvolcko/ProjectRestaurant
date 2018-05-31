(function($) {
  "use strict"; // Start of use strict

  // Smooth scrolling using jQuery easing
  $('a.js-scroll-trigger[href*="#"]:not([href="#"])').click(function() {
    if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') && location.hostname == this.hostname) {
      var target = $(this.hash);
      target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
      if (target.length) {
        $('html, body').animate({
          scrollTop: (target.offset().top - 54)
        }, 1000, "easeInOutExpo");
        return false;
      }
    }
  });

  // Closes responsive menu when a scroll trigger link is clicked
  $('.js-scroll-trigger').click(function() {
    $('.navbar-collapse').collapse('hide');
  });

  // Activate scrollspy to add active class to navbar items on scroll
  $('body').scrollspy({
    target: '#mainNav',
    offset: 54
  });

  $("a[href='#top']").click(function() {
     $("html, body").animate({ scrollTop: 0 }, "slow");
     return false;
  });

  $("a[href='#down']").click(function() {
    var n = $(document).height();
    $('html, body').animate({ scrollTop: n }, "slow");
    return false;
  });
 
 /* add review */
   $('#addReview').click(function() {
      $('#rating').toggle("slow");
      $('#post-review-box').toggle("slow");
   });

   $('#cancelBtn').click(function() {
   $('#rating').hide();
   $('#post-review-box').hide("slow");
});

/* food menu */
$('#menucko').click(function() {
  $('#drinks').hide();
  $('#menucko').hide();
  $('#alergens').hide();
  $('#mainFoodMenu').show("slow");
  $('#foodBtn').show("slow");
});

/* drink menu */
$('#drinks').click(function() {
  $('#drinks').hide();
  $('#menucko').hide();
  $('#alergens').hide();
  $('#mainDrinksMenu').show("slow");
  $('#backDrinks').show();
});
  
  /* after click on food category */
$('#appetizer').click(function() {
  $('#appetizer').hide();
  $('#soup').hide();
  $('#mainDish').hide();
  $('#salad').hide();
  $('#desert').hide();
  $('#foodBtn').hide()
  $('#tableFood').show("slow");
  $('#backToMenu').show();
  $('#backToDrinks').show();
});

$('#soup').click(function() {
  $('#appetizer').hide();
  $('#soup').hide();
  $('#mainDish').hide();
  $('#salad').hide();
  $('#desert').hide();
  $('#foodBtn').hide()
  $('#tableFood').show("slow");
  $('#backToMenu').show();
  $('#backToDrinks').show();
});

$('#mainDish').click(function() {
  $('#appetizer').hide();
  $('#soup').hide();
  $('#mainDish').hide();
  $('#salad').hide();
  $('#desert').hide();
  $('#foodBtn').hide()
  $('#tableFood').show("slow");
  $('#backToMenu').show();
  $('#backToDrinks').show();
});

$('#salad').click(function() {
  $('#appetizer').hide();
  $('#soup').hide();
  $('#mainDish').hide();
  $('#salad').hide();
  $('#desert').hide();
  $('#foodBtn').hide()
  $('#tableFood').show("slow");
  $('#backToMenu').show();
  $('#backToDrinks').show();
});

$('#desert').click(function() {
  $('#appetizer').hide();
  $('#soup').hide();
  $('#mainDish').hide();
  $('#salad').hide();
  $('#desert').hide();
  $('#foodBtn').hide()
  $('#tableFood').show("slow");
  $('#backToMenu').show();
  $('#backToDrinks').show();
});

/* after click on drink menu category */
$('#smoothies').click(function() {
  $('#hotDrinks').hide();
  $('#iceDrinks').hide();
  $('#cocktails').hide();
  $('#beer').hide();
  $('#wine').hide();
  $('#sprites').hide();
  $('#smoothies').hide();
  $('#backDrinks').hide();
  $('#tableDrinks').show("slow");
  $('#buttonBack').show();
});

$('#hotDrinks').click(function() {
  $('#hotDrinks').hide();
  $('#iceDrinks').hide();
  $('#cocktails').hide();
  $('#beer').hide();
  $('#wine').hide();
  $('#sprites').hide();
  $('#smoothies').hide();
  $('#tableDrinks').show("slow");
  $('#backDrinks').hide();
  $('#buttonBack').show();
});

$('#iceDrinks').click(function() {
  $('#hotDrinks').hide();
  $('#iceDrinks').hide();
  $('#cocktails').hide();
  $('#beer').hide();
  $('#wine').hide();
  $('#sprites').hide();
  $('#smoothies').hide();
  $('#tableDrinks').show("slow");
  $('#backDrinks').hide();
  $('#buttonBack').show();
});

$('#cocktails').click(function() {
  $('#hotDrinks').hide();
  $('#iceDrinks').hide();
  $('#cocktails').hide();
  $('#beer').hide();
  $('#wine').hide();
  $('#sprites').hide();
  $('#smoothies').hide();
  $('#tableDrinks').show("slow");
  $('#backDrinks').hide();
  $('#buttonBack').show();
});

$('#beer').click(function() {
  $('#hotDrinks').hide();
  $('#iceDrinks').hide();
  $('#cocktails').hide();
  $('#beer').hide();
  $('#wine').hide();
  $('#sprites').hide();
  $('#smoothies').hide();
  $('#tableDrinks').show("slow");
  $('#backDrinks').hide();
  $('#buttonBack').show();
});

$('#wine').click(function() {
  $('#hotDrinks').hide();
  $('#iceDrinks').hide();
  $('#cocktails').hide();
  $('#beer').hide();
  $('#wine').hide();
  $('#sprites').hide();
  $('#smoothies').hide();
  $('#tableDrinks').show("slow");
  $('#backDrinks').hide();
  $('#buttonBack').show();
});

$('#sprites').click(function() {
  $('#hotDrinks').hide();
  $('#iceDrinks').hide();
  $('#cocktails').hide();
  $('#beer').hide();
  $('#wine').hide();
  $('#sprites').hide();
  $('#smoothies').hide();
  $('#tableDrinks').show("slow");
  $('#backDrinks').hide();
  $('#buttonBack').show();
});

/* back btn food */
$('.back-btn').click(function() {
  $('#drinks').show();
  $('#menucko').show();
  $('#alergens').show();
  $('#mainFoodMenu').hide();
  $('#foodBtn').hide();
});

/* back btn drinks */
$('.back-bttn').click(function() {
  $('#drinks').show();
  $('#menucko').show();
  $('#alergens').show();
  $('#drinkMenu').hide();
});

/* back btn drinks */
$('#backDrinks').click(function() {
  $('#drinks').show();
  $('#menucko').show();
  $('#backDrinks').hide();
  $('#mainDrinksMenu').hide();
});

$('#buttonBack').click(function() {
  $('#buttonBack').hide();
  $('#tableDrinks').hide();
  $('#backDrinks').show();
  $('#hotDrinks').show();
  $('#iceDrinks').show();
  $('#cocktails').show();
  $('#beer').show();
  $('#wine').show();
  $('#sprites').show();
  $('#smoothies').show();
});

/* back to menu */
$('#backToMenu').click(function() {
  $('#backToDrinks').hide();
  $('#backToMenu').hide();
  $('#tableFood').hide();
  $('#appetizer').show();
  $('#soup').show();
  $('#mainDish').show();
  $('#salad').show();
  $('#desert').show();
  $('#foodBtn').show();
});

 $("#nameInReview").keyup(function(){
            var username = $("#nameInReview").val();
            if(username.trim().length < 4){
                $("#errorusr").show();
            }
            else if(username.trim().length > 4){
                $("#errorusr").hide();
            }
        });

 $("#new-review").keyup(function(){
            var review = $("#new-review").val();
            if(review.trim().length < 30){
                $("#errorrvw").show();
            }
            else if(review.trim().length > 30){
                $("#errorrvw").hide();
            }
        });

   $("#sendreview").click(function(){
        var review = $("#new-review").val();
        var username = $("#nameInReview").val();
    if(username.trim().length < 4 || review.trim().length < 30){
    alert("Username or review is too short!");
    }
  });

$('#new-review').keyup(function () {
  var max = 500;
  var len = $(this).val().length;
  if (len >= max) {
    $('#charNum').text(' You have reached the limit!');
  } else {
    var char = max - len;
    $('#charNum').text(char + ' characters left');
  }
});

/*$.get('http://localhost:8080/data',  function(data){
      
var i = 0;

 for( i = 0;i<data.length;i++){
          console.log(JSON.parse(JSON.stringify(data[i].Name)));
          $("#tableFood").append("<tr><td>"+data[i].Name+"</td><td>"+data[i].Price+"</td>"+data[i].Price+"</tr>");

console.log(type);
          
          //console.log(parse);
          
          

      
    }


  
   });*/
   var type;
   var mlg;
       a=0;
    tdidname=0;
    tdidprice=0;
    var p=0;

var btnCancelCout=0;
var getname = 0;
$("#appetizer").click(function(){
     type = $("#appetizer").attr('id');
        $( "#tableFood" ).empty();
     postReq(type);
});
$("#soup").click(function(){
     type = $("#soup").attr('id');
     postReq(type);
     $( "#tableFood" ).empty();
});
$("#mainDish").click(function(){
     type = $("#mainDish").attr('id');
     postReq(type);
      $( "#tableFood" ).empty();
});
$("#salad").click(function(){
     type = $("#salad").attr('id');
     postReq(type);
      $( "#tableFood" ).empty();
});
$("#desert").click(function(){
     type = $("#desert").attr('id');
     postReq(type);
      $( "#tableFood" ).empty();
});

var a = 0;
var tdidname= 0
var tdidprice=0;
 var nameArray = new Array;
 var priceArray = new Array;
$("#shoppingcart").html("<thead>"+"<tr>"+"<th scope=\"col\">"+"Name of Product"+"</th>"+"<th scope=\"col\">"+"Price"+ "<th scope=\"col\">"+"Delete item"+"</th>"+"</th>"+"</tr>"+"</thead>");

$("#tableFood").attr("<table class=table table-striped table-dark");

function getDrinks(type){
$.post({

        traditional: true,
        url: 'http://localhost:8080/drink',
        contentType: 'application/json',
        data: JSON.stringify({"type": type}),
        dataType: 'json',
        success: function(response){ 
          var i;
          
           $("#tableDrinks").append("<thead>"+"<tr>"+"<th scope=\"col\">"+"Drink name"+"</th>"+"<th scope=\"col\">"+"Composition"+ "<th scope=\"col\">"+"Volume Weight"+"</th>"+"</th>"+"<th scope=\"col\">"+"Price"+"</th>"+"</tr>"+"</thead>");
          for( i = 0;i<response.length;i++){  
          
        
          $("#tableDrinks").append("<tr ><td id=tab"+tdidname+">"+response[i].Name+"</td><td>"+response[i].composition+"</td>"+"<td>"+response[i].volume+"ml"+"</td>"+"<td id=tdidprice"+tdidprice+">"+response[i].price+"</td>"+"<td>"+"<button type=\"button\" class=\"btn btn-warning btn-sm\" id=\"btnW"+a+"\">"+"<img src=\"img/cartin.png\">"+" Shopping Cart"+"</button>"+"</td>"+"</tr>");

          a++;
          tdidname++;
          tdidprice++;

 }
a=0;
tdidname=0;
tdidprice=0;
          $("#btnW0").click(function(){




    nameArray.push($('#tab0').text());
 
    priceArray.push($('#tdidprice0').text());
  
    for(p=p;p<nameArray.length;p++)
    {
 $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    }

     $(".btnC,.getTdName,.classTr").mouseover(function(){
          var wtf = $(this).closest('td');
          var tdd=wtf.attr('id');
          console.log(tdd);
          var nameTD=$("#"+tdd).text();
          console.log(nameTD);

            var currentButton = $(this).closest('button');
          var currentButtonId=currentButton.attr('id');
          console.log(currentButtonId);

 $(currentButton).click(function(){
         
       
            


             

var currentRow = $(this).closest('tr');
            var currentRowId=currentRow.attr('id')
            console.log(currentRowId);


   var index = nameArray.indexOf(nameTD);
   for (var i=nameArray.length-1; i>=0; i--) {
    if (nameArray[i] === nameTD) {
        nameArray.splice(i, 1);
    
    }
}
    

$(currentRow).remove();
});
 });


    }); 

  

        $("#btnW1").click(function(){




 nameArray.push($('#tab1').text());
 
    priceArray.push($('#tdidprice1').text());
  
    for(p=p;p<nameArray.length;p++)
    {
   $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC\" id=\"btnCancel"+btnCancelCout+"\">Cancel</button></td></tr>");
    btnCancelCout++;
    getname++;
    }


     $(".btnC,.getTdName,.classTr").mouseover(function(){
          var wtf = $(this).closest('td');
          var tdd=wtf.attr('id');
          console.log(tdd);
          var nameTD=$("#"+tdd).text();
          console.log(nameTD);

            var currentButton = $(this).closest('button');
          var currentButtonId=currentButton.attr('id');
          console.log(currentButtonId);

 $(currentButton).click(function(){
         
       
            


             

var currentRow = $(this).closest('tr');
            var currentRowId=currentRow.attr('id')
            console.log(currentRowId);


   var index = nameArray.indexOf(nameTD);
   for (var i=nameArray.length-1; i>=0; i--) {
    if (nameArray[i] === nameTD) {
        nameArray.splice(i, 1);
    
    }
}
    

$(currentRow).remove();
});
 });


    }); 

            $("#btnW2").click(function(){

 

     nameArray.push($('#tab2').text());
 
    priceArray.push($('#tdidprice2').text());
  
    for(p=p;p<nameArray.length;p++)
    {
 $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC\" id=\"btnCancel"+btnCancelCout+"\">Cancel</button></td></tr>");
    btnCancelCout++;
    getname++;
    }


    }); 

                $("#btnW3").click(function(){

  

     nameArray.push($('#tab3').text());
 
    priceArray.push($('#tdidprice3').text());
  
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC\" id=\"btnCancel"+btnCancelCout+"\">Cancel</button></td></tr>");
    btnCancelCout++;
    getname++;
    }


     $(".btnC,.getTdName,.classTr").mouseover(function(){
          var wtf = $(this).closest('td');
          var tdd=wtf.attr('id');
          console.log(tdd);
          var nameTD=$("#"+tdd).text();
          console.log(nameTD);

            var currentButton = $(this).closest('button');
          var currentButtonId=currentButton.attr('id');
          console.log(currentButtonId);

 $(currentButton).click(function(){
         
       
            


             

var currentRow = $(this).closest('tr');
            var currentRowId=currentRow.attr('id')
            console.log(currentRowId);


   var index = nameArray.indexOf(nameTD);
   for (var i=nameArray.length-1; i>=0; i--) {
    if (nameArray[i] === nameTD) {
        nameArray.splice(i, 1);
    
    }
}
    

$(currentRow).remove();
});
 });
  

    }); 

          
     
          

      
    }
} );}





$("#smoothies").click(function(){
     type = $("#smoothies").attr('id');
     getDrinks(type);
      $( "#tableDrinks" ).empty();
});

$("#hotDrinks").click(function(){
     type = $("#hotDrinks").attr('id');
      getDrinks(type);
      $( "#tableDrinks" ).empty();
});


$("#iceDrinks").click(function(){
     type = $("#iceDrinks").attr('id');
       getDrinks(type);
      $( "#tableDrinks" ).empty();
});

$("#cocktails").click(function(){
     type = $("#cocktails").attr('id');
       getDrinks(type);
      $( "#tableDrinks" ).empty();
});

$("#beer").click(function(){
     type = $("#beer").attr('id');
       getDrinks(type);
      $( "#tableDrinks" ).empty();
});

$("#wine").click(function(){
     type = $("#wine").attr('id');
       getDrinks(type);
      $( "#tableDrinks" ).empty();
});

$("#sprites").click(function(){
     type = $("#sprites").attr('id');
       getDrinks(type);

      $( "#tableDrinks" ).empty();
});
mlg="ml";
var trcount=0;


function postReq(type){
$.post({

        traditional: true,
        url: 'http://localhost:8080/type',
        contentType: 'application/json',
        data: JSON.stringify({"type": type}),
        dataType: 'json',
        success: function(response){ 
          var i;
          if(type=="soup")
            mlg="ml";
          else
            mlg="g";
           $("#tableFood").append("<thead>"+"<tr>"+"<th scope=\"col\">"+"Food name"+"</th>"+"<th scope=\"col\">"+"Allergens"+ "<th scope=\"col\">"+"Volume Weight"+"</th>"+"</th>"+"<th scope=\"col\">"+"Composition"+"</th>"+"<th scope=\"col\">"+"Price(€)"+"</th>"+"</tr>"+"</thead>");
          for( i = 0;i<response.length;i++){
          console.log(JSON.parse(JSON.stringify(response[i].Name)));
        
          $("#tableFood").append("<tr ><td id=tab"+tdidname+">"+response[i].Name+"</td><td>"+response[i].Allergens+"</td>"+"<td>"+response[i].VolumeWeight+mlg+"</td>"+"<td>"+response[i].composition+"</td>"+"<td id=tdidprice"+tdidprice+">"+response[i].Price+"</td>"+"<td>"+"<button type=\"button\" class=\"btn btn-warning btn-sm\" id=\"btnW"+a+"\">"+"<img src=\"img/cartin.png\">"+" Shopping Cart"+"</button>"+"</td>"+"</tr>");
          a++;
          tdidname++;
          tdidprice++;


          

      
    }
   a=0;
          tdidname=0;
          tdidprice=0;

  $("#btnW0").click(function(){


    nameArray.push($('#tab0').text());
 
    priceArray.push($('#tdidprice0').text());
  
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC\" id=\"btnCancel"+btnCancelCout+"\">Cancel</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }

   

 
   $(".btnC,.getTdName,.classTr").mouseover(function(){
          var wtf = $(this).closest('td');
          var tdd=wtf.attr('id');
          console.log(tdd);
          var nameTD=$("#"+tdd).text();
          console.log(nameTD);

            var currentButton = $(this).closest('button');
          var currentButtonId=currentButton.attr('id');
          console.log(currentButtonId);

 $(currentButton).click(function(){
         
       
            


             

var currentRow = $(this).closest('tr');
            var currentRowId=currentRow.attr('id')
            console.log(currentRowId);


   var index = nameArray.indexOf(nameTD);
   for (var i=nameArray.length-1; i>=0; i--) {
    if (nameArray[i] === nameTD) {
        nameArray.splice(i, 1);
    
    }
}
    

$(currentRow).remove();
});
 });
              
      

       
    

    }); 

  


        $("#btnW1").click(function(){




 nameArray.push($('#tab1').text());
 
    priceArray.push($('#tdidprice1').text());
  
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC\" id=\"btnCancel"+btnCancelCout+"\">Cancel</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }

   $(".btnC,.getTdName,.classTr").mouseover(function(){
          var wtf = $(this).closest('td');
          var tdd=wtf.attr('id');
          console.log(tdd);
          var nameTD=$("#"+tdd).text();
          console.log(nameTD);

            var currentButton = $(this).closest('button');
          var currentButtonId=currentButton.attr('id');
          console.log(currentButtonId);

 $(currentButton).click(function(){
         
       
            


             

var currentRow = $(this).closest('tr');
            var currentRowId=currentRow.attr('id')
            console.log(currentRowId);


   var index = nameArray.indexOf(nameTD);
   for (var i=nameArray.length-1; i>=0; i--) {
    if (nameArray[i] === nameTD) {
        nameArray.splice(i, 1);
    
    }
}
    

$(currentRow).remove();
});
 });


    }); 
          
            $("#btnW2").click(function(){

 

     nameArray.push($('#tab2').text());
 
    priceArray.push($('#tdidprice2').text());
  
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC\" id=\"btnCancel"+btnCancelCout+"\">Cancel</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }

   $(".btnC,.getTdName,.classTr").mouseover(function(){
          var wtf = $(this).closest('td');
          var tdd=wtf.attr('id');
          console.log(tdd);
          var nameTD=$("#"+tdd).text();
          console.log(nameTD);

            var currentButton = $(this).closest('button');
          var currentButtonId=currentButton.attr('id');
          console.log(currentButtonId);

 $(currentButton).click(function(){
         
       
            


             

var currentRow = $(this).closest('tr');
            var currentRowId=currentRow.attr('id')
            console.log(currentRowId);


   var index = nameArray.indexOf(nameTD);
   for (var i=nameArray.length-1; i>=0; i--) {
    if (nameArray[i] === nameTD) {
        nameArray.splice(i, 1);
    
    }
}
    

$(currentRow).remove();
});
 });



    }); 
     

                $("#btnW3").click(function(){

  

     nameArray.push($('#tab3').text());
 
    priceArray.push($('#tdidprice3').text());
  
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC\" id=\"btnCancel"+btnCancelCout+"\">Cancel</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }
 
    $(".btnC,.getTdName,.classTr").mouseover(function(){
          var wtf = $(this).closest('td');
          var tdd=wtf.attr('id');
          console.log(tdd);
          var nameTD=$("#"+tdd).text();
          console.log(nameTD);

            var currentButton = $(this).closest('button');
          var currentButtonId=currentButton.attr('id');
          console.log(currentButtonId);

 $(currentButton).click(function(){
         
       
            


             

var currentRow = $(this).closest('tr');
            var currentRowId=currentRow.attr('id')
            console.log(currentRowId);


   var index = nameArray.indexOf(nameTD);
   for (var i=nameArray.length-1; i>=0; i--) {
    if (nameArray[i] === nameTD) {
        nameArray.splice(i, 1);
    
    }
}
    

$(currentRow).remove();
});
 });
          

  
   

        
          
          

 


    }); 
         





  }
} );}




    $("#btnShop").click(function(){

var stringName = JSON.stringify(nameArray);


var stringPrice = JSON.stringify(priceArray);

var parsePrice = JSON.parse(stringPrice);

var parseName = JSON.parse(stringName);
var maxnumber;

$.get({

        traditional: true,
        url: 'http://localhost:8080/lastnumber',
        contentType: 'application/json',
       
        dataType: 'json',
        success: function(response){ 
         
          getNumber(response)

          }

 


} );
function getNumber(response){
  var number= 1;
  var countOfPrice;
  var g=0;
  var e=0;
number = response[0].number;
number++;
for(g = 0;g<parseName.length;g++)
  

{

$.post({

        traditional: true,
        url: 'http://localhost:8080/try',
        contentType: 'application/json',
        data: JSON.stringify({"parseName": parseName[g],"parsePrice": parsePrice[g],"number":number}),
        dataType: 'json',
        success: console.log("AHSDIl")
} );


}


var total = 0;
for (var i = 0; i < priceArray.length; i++) {
    total =total+ + + priceArray[i] ; 
}
console.log(total);

$.post({

        traditional: true,
        url: 'http://localhost:8080/sendfinalorder',
        contentType: 'application/json',
        data: JSON.stringify({"number": number,"total":total}),
        dataType: 'json',
        success: console.log("Succes write final order")
} );


}




});


    





 

$("#sendreview").click(function(){

  var name=$("#nameInReview").val();
  var reviewstar = $('#example-css').val();
  var review = $("#new-review").val();
  console.log(name);
  console.log(reviewstar);
  console.log(review);



$.post({

        traditional: true,
        url: 'http://localhost:8080/review',
        contentType: 'application/json',
        data: JSON.stringify({"review": review,"name":name,"reviewstar":reviewstar}),
        dataType: 'json',
        success: console.log("SUCCESS")
} );
});




$('#send').click(function() {
  var namereservation=$("#namereservation").val();
  var surnamereservation=$("#surnamereservation").val();
  var emailreservation=$("#emailreservation").val();
  var phonereservation=$("#phonereservation").val();
  var datereservation=$("#datereservation").val();
  var timereservation=$("#timereservation").val();



$.post({


        traditional: true,
        url: 'http://localhost:8080/send',
        contentType: 'application/json',
        data: JSON.stringify({"namereservation": namereservation, "surnamereservation": surnamereservation,"emailreservation":emailreservation,"phonereservation":phonereservation,"timereservation":timereservation,"datereservation":datereservation}),
        dataType: 'json',
        success: console.log(namereservation+" "+surnamereservation+" "+emailreservation+" "+phonereservation+" "+timereservation+" "+datereservation)
} );


var namereservationregex = /^[A-ZÁ-Ž]{1,1}[a-zá-ž]{1,15}$/;
var surnamereservationregex= /^[A-ZÁ-Ž]{1,1}[a-zá-ž]{1,15}$/;
var emailreservationregex=  /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

if(namereservation.match(namereservationregex)==null||surnamereservation.match(surnamereservationregex)==null||phonereservation==null||emailreservation.match(emailreservationregex)==null){
alert("Ooopss. Something went wrong. Please try again!");}

else{
  alert("Email was send! Wait for being contacted by Manager/Supervisor!!!");

}
} );


var today= new Date();

var time = today.getHours() + ":" + today.getMinutes()  
var day = ("0" + today.getDate()).slice(-2);
var month = ("0" + (today.getMonth() + 1)).slice(-2);
var today = today.getFullYear()+"-"+(month)+"-"+(day) ;
var today2 = new Date();
var day2 = ("0" + today2.getDate()).slice(-2);
var month2 = ("0" + (today2.getMonth() + 1)).slice(-2);
var today2=today2.getFullYear()+1+"-"+(month2)+"-"+(day2) ;
var today3= new Date();
var time3 = today3.getHours() + ":" + today3.getMinutes()  
var day3 = ("0" + today3.getDate()).slice(-2);
var month3 = ("0" + (today3.getMonth() + 1)).slice(-2);
var today3 = today3.getFullYear()+"-"+(month3)+"-"+(day3) ;


var nulll =" ";

$("#datereservation").attr("min",today);

$("#datereservation").change(function(){

var date = $("#datereservation").val();
console.log(date);

});


$("#sendreview").click(function(){
   
var i;

$.get({

        traditional: true,
        url: 'http://localhost:8080/reviews',
        contentType: 'application/json',
       
        dataType: 'json',
        success: function(response){ 
          /*for (var i = Things.length - 1; i >= 0; i--) {
            Things[i]
          }*/
          console.log(response[0].reviewStar);
           $("#stars").val( response[0].reviewStar);  
           $("#name").val(response[0].name);
           $("#review").val(response[0].review);
          }
} );
});





})(jQuery); // End of use strict






