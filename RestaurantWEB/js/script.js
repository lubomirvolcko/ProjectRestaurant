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
  $('#mainFoodMenu').show("slow");
  $('#foodBtn').show("slow");
});

/* drink menu */
$('#drinks').click(function() {
  $('#drinks').hide();
  $('#menucko').hide();
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
  $('#mainFoodMenu').hide();
  $('#foodBtn').hide();
});

/* back btn drinks */
$('.back-bttn').click(function() {
  $('#drinks').show();
  $('#menucko').show();
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
$("#shoppingcart").html("<thead>"+"<tr>"+"<th scope=\"col\">"+"Name of Product"+"</th>"+"<th scope=\"col\">"+"Price"+ "<th scope=\"col\">"+"Quantity"+"</th>"+"</th>"+"</tr>"+"</thead>");

$("#tableFood").attr("<table class=table table-striped table-dark");
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
           $("#tableFood").append("<thead>"+"<tr>"+"<th scope=\"col\">"+"Food name"+"</th>"+"<th scope=\"col\">"+"Allergens"+ "<th scope=\"col\">"+"Volume Weight"+"</th>"+"</th>"+"<th scope=\"col\">"+"Composition"+"</th>"+"<th scope=\"col\">"+"Price"+"</th>"+"</tr>"+"</thead>");
          for( i = 0;i<response.length;i++){
          console.log(JSON.parse(JSON.stringify(response[i].Name)));
        
          $("#tableFood").append("<tr ><td id=tab"+tdidname+">"+response[i].Name+"</td><td>"+response[i].Allergens+"</td>"+"<td>"+response[i].VolumeWeight+mlg+"</td>"+"<td>"+response[i].composition+"</td>"+"<td id=tdidprice"+tdidprice+">"+response[i].Price+"€"+"</td>"+"<td>"+"<button type=\"button\" class=\"btn btn-warning btn-sm\" id=\"btnW"+a+"\">"+"<img src=\"img/cartin.png\">"+" Shopping Cart"+"</button>"+"</td>"+"</tr>");
          a++;
          tdidname++;
          tdidprice++;


          

      
    }
    a=0;
    tdidname=0;
    tdidprice=0;


    $("#btnW0").click(function(){
     
      var price
      var test = "ahoj";
      var test2 = "cau";


    nameArray.push($('#tab0').text());
    console.log(nameArray[0]);
 
    priceArray.push($('#tdidprice0').text());
    for(var p=0;p<nameArray.length;p++)
    {
   $("#shoppingcart").append("<tr><td>"+nameArray[p]+"</td><td>"+priceArray[p]+"</td></tr>");
    }
    console.log(price);

    }); 

        $("#btnW1").click(function(){

    var nameofproduct= $('#tab1').text();
    console.log(nameofproduct);
  
    var price= $('#tdidprice1').text();
    console.log(price);

    }); 

            $("#btnW2").click(function(){

    var nameofproduct= $('#tab2').text();
    console.log(nameofproduct);
  
    var price= $('#tdidprice2').text();
    console.log(price);

    }); 

                $("#btnW3").click(function(){

    var nameofproduct= $('#tab3').text();
    console.log(nameofproduct);
  
    var price= $('#tdidprice3').text();
    console.log(price);

    }); 






  }
} );}

    $("#btnShop").click(function(){

var stringName = JSON.stringify(nameArray);


var stringPrice = JSON.stringify(priceArray);

var parsedPrice = JSON.parse(stringPrice);

var parseName = JSON.parse(stringName);

for(var g = 0;g<parseName.length;g++)
{
$.post({

        traditional: true,
        url: 'http://localhost:8080/try',
        contentType: 'application/json',
        data: JSON.stringify({"parseName": parseName[g]}),
        dataType: 'json',
        success: console.log("SUCCESS")
} );
}
});

         
     

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
          
        
          $("#tableDrinks").append("<tr><td>"+response[i].Name+"</td><td>"+response[i].composition+"</td>"+"<td>"+response[i].volume+"ml"+"</td>"+"<td>"+response[i].price+"€"+"</td>"+"</td>"+"<td>"+"<button type=\"button\" class=\"btn btn-warning btn-sm\">"+"<img src=\"img/cartin.png\">"+" Shopping Cart"+"</button>"+"</td>"+"</tr>");


          
     
          

      
    } }
} );}





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

$.post({


        traditional: true,
        url: 'http://localhost:8080/send',
        contentType: 'application/json',
        data: JSON.stringify({"namereservation": namereservation, "surnamereservation": surnamereservation,"emailreservation":emailreservation,"phonereservation":phonereservation}),
        dataType: 'json',
        success: console.log(namereservation+" "+surnamereservation+" "+emailreservation+" "+phonereservation)
} );
} );




$("#er").click(function(){
   


$.get({

        traditional: true,
        url: 'http://localhost:8080/reviews',
        contentType: 'application/json',
       
        dataType: 'json',
        success: function(response){ 
          console.log(response[0].reviewStar);
           $("#star").val(response[0].reviewStar);
      
          }
} );
});



})(jQuery); // End of use strict
