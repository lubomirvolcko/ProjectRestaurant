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

$("#formName").keyup(function(){
  var username = $("#formName").val();
       if(username.trim().length < 4){
                $("#nameErr").show();
            }
            else if(username.trim().length > 4){
                $("#nameErr").hide();
            }
        });

  $("#orderAddress").keyup(function(){
            var username = $("#orderAddress").val();
            if(username.trim().length < 5){
                $("#adressErr").show();
            }
            else if(username.trim().length > 5){
                $("#adressErr").hide();
            }
        });

  jQuery('#formNumber').keyup(function () { 
    this.value = this.value.replace(/[^+0-9\.]/g,'');
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

 var row;
var deletename;
var buttonId;
var total = 0;


$("#shoppingcart").html("<thead>"+"<tr>"+"<th scope=\"col\">"+"Name of Product"+"</th>"+"<th scope=\"col\">"+"Price(€)"+ "<th scope=\"col\">"+"Delete item"+"</th>"+"</th>"+"</tr>"+"</thead>");

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
          
           $("#tableDrinks").append("<thead>"+"<tr>"+"<th scope=\"col\">"+"Drink name"+"</th>"+"<th scope=\"col\">"+"Composition"+ "<th scope=\"col\">"+"Volume Weight"+"</th>"+"</th>"+"<th scope=\"col\">"+"Price(€)"+"</th>"+"</tr>"+"</thead>");
          for( i = 0;i<response.length;i++){  
          
        
          $("#tableDrinks").append("<tr ><td id=tab"+tdidname+">"+response[i].Name+"</td><td>"+response[i].composition+"</td>"+"<td>"+response[i].volume+"ml"+"</td>"+"<td id=tdidprice"+tdidprice+">"+response[i].price+"</td>"+"<td>"+"<button type=\"button\" class=\"btn btn-warning btn-sm\" id=\"btnW"+a+"\">"+"<img src=\"img/cartin.png\">"+" Shopping Cart"+"</button>"+"</td>"+"</tr>");

          a++;
          tdidname++;
          tdidprice++;

  }

a=0;
tdidname=0;
tdidprice=0;
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


  }





} );}







    $("#tableFood,#tableDrinks").on("click","button#btnW0",function(){


    nameArray.push($('#tab0').text());
 
    priceArray.push($('#tdidprice0').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   }); 





     $("#tableFood,#tableDrinks").on("click","button#btnW1",function(){


    nameArray.push($('#tab1').text());
 
    priceArray.push($('#tdidprice1').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   }); 

        $("#tableFood,#tableDrinks").on("click","button#btnW2",function(){


    nameArray.push($('#tab2').text());
 
    priceArray.push($('#tdidprice2').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   });

      $("#tableFood,#tableDrinks").on("click","button#btnW3",function(){


    nameArray.push($('#tab3').text());
 
    priceArray.push($('#tdidprice3').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   });  


         $("#tableFood,#tableDrinks").on("click","button#btnW4",function(){


    nameArray.push($('#tab4').text());
 
    priceArray.push($('#tdidprice4').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   }); 



           $("#tableFood,#tableDrinks").on("click","button#btnW5",function(){


    nameArray.push($('#tab5').text());
 
    priceArray.push($('#tdidprice5').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   }); 
         


           $("#tableFood,#tableDrinks").on("click","button#btnW6",function(){


    nameArray.push($('#tab6').text());
 
    priceArray.push($('#tdidprice6').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   }); 
         




           $("#tableFood,#tableDrinks").on("click","button#btnW7",function(){


    nameArray.push($('#tab7').text());
 
    priceArray.push($('#tdidprice7').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   }); 
         




           $("#tableFood,#tableDrinks").on("click","button#btnW8",function(){


    nameArray.push($('#tab8').text());
 
    priceArray.push($('#tdidprice8').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   }); 
         




           $("#tableFood,#tableDrinks").on("click","button#btnW9",function(){


    nameArray.push($('#tab9').text());
 
    priceArray.push($('#tdidprice9').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   }); 
         




           $("#tableFood,#tableDrinks").on("click","button#btnW10",function(){


    nameArray.push($('#tab10').text());
 
    priceArray.push($('#tdidprice10').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   }); 
         



           $("#tableFood,#tableDrinks").on("click","button#btnW11",function(){


    nameArray.push($('#tab11').text());
 
    priceArray.push($('#tdidprice11').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   }); 
         





           $("#tableFood,#tableDrinks").on("click","button#btnW12",function(){


    nameArray.push($('#tab12').text());
 
    priceArray.push($('#tdidprice12').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   }); 
         




           $("#tableFood,#tableDrinks").on("click","button#btnW13",function(){


    nameArray.push($('#tab13').text());
 
    priceArray.push($('#tdidprice13').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   }); 
         




           $("#tableFood,#tableDrinks").on("click","button#btnW14",function(){


    nameArray.push($('#tab14').text());
 
    priceArray.push($('#tdidprice14').text());
    for(p=p;p<nameArray.length;p++)
    {
  $("#shoppingcart").append("<tr id=\"countTr"+trcount+"\" class=\"classTr\"><td id=\"getName"+getname+"\"class=\"getTdName\">"+nameArray[p]+"</td><td>"+priceArray[p]+"</td><td><button type=\"button\" class=\"btnC btn-danger\" id=\"btnCancel"+btnCancelCout+"\">Delete</button></td></tr>");
    btnCancelCout++;
    getname++;
    trcount++;
    }



        
         
          
          
  


   }); 
         
         
 
for(var t=0;t<1000;t++)
$("#shoppingcart").on("click","button#btnCancel"+[t],function(){


    var tdd = $(this).closest('tr').find('td:nth-child(1)').text();
    var tddd = $(this).closest('tr').find('td:nth-child(2)').text();
    


 var row = $(this).closest('tr').attr('id');
 console.log("ID:"+row);
 var indexName = nameArray.indexOf(tdd);
 var indexPrice = priceArray.indexOf(tddd)
nameArray.splice(indexName,1);
priceArray.splice(indexPrice,1);

var countRow = $('#shoppingcart tr').length;
if(nameArray.length>0)
p=nameArray.length;
else
p=0;
$("#"+row).remove();
console.log("NAMETD"+tdd);



 }); 
$("#btnShop").click(function(){
var countRow = $('#shoppingcart tr').length;
console.log(countRow);
if(countRow<=1){
 $("#shoppingcart").hide();


$("#emptyCart").show();

}
else{

   $("#shoppingcart").show();
  $("#emptyCart").css("display", "none");
}

 }); 



 var finalpriceprint = 0;




for(var t = 0; t<200; t++)
$("#tableFood,#tableDrinks,#shoppingcart").on("click","button.btn,button#btnCancel"+[t],function(){

for (var i = 0; i < priceArray.length; i++) {
    finalpriceprint =finalpriceprint+ + + priceArray[i] ; 
}


console.log(nameArray[0]);

console.log(finalpriceprint);
$("#finalprice").text("Total: "+finalpriceprint.toFixed(2)+"€" );
if(finalpriceprint==0){
$("#shoppingcart").hide();
$("#emptyCart").show();
}
finalpriceprint = 0;


 });



    $("#makeorder").click(function(){


      var personname = $("#formName").val();
      var address = $("#orderAddress").val();
      var city = $('#getCity').find(":selected").text();
      var phonenumber =  $("#formNumber").val();
      var time = $("#timeres").val();
      console.log(personname);
      console.log(address);
      console.log(city);
      console.log(phonenumber);
      console.log(time);

var stringName = JSON.stringify(nameArray);


var stringPrice = JSON.stringify(priceArray);

var parsePrice = JSON.parse(stringPrice);

var parseName = JSON.parse(stringName);
var maxnumber;
if(personname==""||address==""||phonenumber=="")
  alert("Please fill each field!");
else if(nameArray.length==0)
  alert("You need order something!");

else{
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
        success: console.log("Order was added to databse!")
} );


}


for (var i = 0; i < priceArray.length; i++) {
    total =total+ + + priceArray[i] ; 
}

console.log(total);
console.log(personname)
$.post({

        traditional: true,
        url: 'http://localhost:8080/sendfinalorder',
        contentType: 'application/json',
        data: JSON.stringify({"number": number,"total":total,"personname":personname,"address":address,"city":city,"phonenumber":phonenumber,"time":time}),
        dataType: 'json',
        success: console.log("Succes write final order")
} );


}

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


var q = 0;
var b = 0;
//var c = 0;

$.get({

        traditional: true,
        url: 'http://localhost:8080/reviews',
        contentType: 'application/json',
       
        dataType: 'json',
        success: function(response){ 
         for(var i = 0; i < response.length;i++){
          $("#firstInp").append("<div class=\"form-group\"><input type=\"text\"id=\"name"+q+"\"class=\"form-control\" readonly></div>");
          $("#name"+q).val(response[i].name);
          $("#firstInp").append("<div class=\"form-group\"><textarea id=\"review"+b+"\" class=\"form-control\" rows=\"5\" readonly></textarea></div>");
          $("#review"+b).val(response[i].review);
        // $('#star').append('<option value=1>1</option><option value=2></option><option value=3></option><option value=4><option value=5></option></option>').selectmenu('refresh');

         // $("#stars"+c).val(response[i].reviewStar);
          q++;
          b++;
         // c++;
          // $("#stars").val( response[i].reviewStar); 
         } //for

          }
} );





})(jQuery); // End of use strict






