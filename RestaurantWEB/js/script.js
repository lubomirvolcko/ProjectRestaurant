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

/*
   $('#hotDrinks').click(function() {
      $('#hot-drinks').toggle("slow");
   });       // po kliknuti sa zobrazi */

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
  $('.textFood').hide();
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
  $('#hotDrinks').show("slow");
  $('#iceDrinks').show("slow");
  $('#cocktails').show("slow");
  $('#beer').show("slow");
  $('#wine').show("slow");
  $('#sprites').show("slow");
  $('#smoothies').show("slow");
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
           $("#tableFood").append("<thead>"+"<tr>"+"<th scope=\"col\">"+"Food name"+"</th>"+"<th scope=\"col\">"+"Price"+ "<th scope=\"col\">"+"Volume Weight"+"</th>"+"</th>"+"<th scope=\"col\">"+"Composition"+"</th>"+"<th scope=\"col\">"+"Allergens"+"</th>"+"</tr>"+"</thead>");
          for( i = 0;i<response.length;i++){
          console.log(JSON.parse(JSON.stringify(response[i].Name)));

          $("#tableFood").append("<tr><td>"+response[i].Name+"</td><td>"+response[i].Price+"€"+"</td>"+response[i].Price+"<td>"+response[i].VolumeWeight+"</td>"+"<td>"+response[i].composition+"</td>"+"<td>"+response[i].Allergens+"</td>"+"<td>"+"<button type=\"button\" class=\"btn btn-default btn-sm\">"+"<img src=\"img/cartin.png\">"+" Shopping Cart"+"</button>"+"</td>"+"</tr>");


          
     
          

      
    } }
} );}



})(jQuery); // End of use strict
