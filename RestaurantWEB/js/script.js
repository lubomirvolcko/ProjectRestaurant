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
  $('#deserts').hide();
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
  $('#deserts').hide();
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
  $('#deserts').hide();
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
  $('#deserts').hide();
  $('#foodBtn').hide()
  $('#tableFood').show("slow");
  $('#backToMenu').show();
  $('#backToDrinks').show();
});

$('#deserts').click(function() {
  $('#appetizer').hide();
  $('#soup').hide();
  $('#mainDish').hide();
  $('#salad').hide();
  $('#deserts').hide();
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
  $('#deserts').show();
  $('#foodBtn').show();
});

})(jQuery); // End of use strict
