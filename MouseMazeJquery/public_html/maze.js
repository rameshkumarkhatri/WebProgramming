/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//$(document).ready(function () {
//    $("#start").click(function () {
//        $(".boundary").css({background: '#eeeeee'});
//        isStart = 1;
//        $(".boundary").mouseover(function () {
//            if (isStart === 1) {
//                $(".boundary").css({background: 'red'});
//                $(".boundary").off("mouse-over");
//                isStart = 0;
//                alert("Sorry, You lose :[");
//            }
//
//        });
//
//        $("#end").mouseover(function () {
//            if (isStart === 1) {
//                alert("You won :]");
//            }
//            isStart = 0;
//            $(".boundary").off("mouse-over");
//        });
//
//    });
//});


$(document).ready(function () {
    $("#start").click(startClick);
    $("#end").mouseover(mouseOverEnd);
    $(".boundary").mouseover(mouseOverOnBoundry);
    $("#maze").mouseleave(mouseOverOnBoundry);
    
});
var isStart = 0;
var startClick = function () {
    isStart = 1;
        $(".boundary").css({background: '#eeeeee'});
        isStart = 1; 
};

var mouseOverOnBoundry = function () {
            if (isStart === 1) {
                $(".boundary").css({background: '#FAA'});
                $(".boundary").off("mouse-over");
                isStart = 0;
//                alert("Sorry, You lose :[");
                $("#status").text("You lose!");
            }

        };

var mouseOverEnd = function () {
            if (isStart === 1) {
//                alert("You won :]");
                $("#status").text("You won!");
            }
            isStart = 0;
            $(".boundary").off("mouse-over");
            

        };
        
