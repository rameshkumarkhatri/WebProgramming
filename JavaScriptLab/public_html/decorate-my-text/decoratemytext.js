/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function showAlert() {
    alert("Hello, world!");
}

function textDecorationClick() {
    "use strict";
    setInterval(function() {
    var textArea = document.getElementById("textArea");
    textArea.style.fontSize = (parseInt($("#textArea").css("fontSize"))+2)+"pt" ;
    },
    500);

}

function blingFunction() {
    var weight = "normal";
    var color = "black";
    var txtDecoration = "";
    if (document.getElementById("cbBling").checked)
    {
        weight = "bold";
        color = "green";
        txtDecoration = "underline";
        document.body.style.backgroundImage = "url(http://www.cs.washington.edu/education/courses/190m/CurrentQtr/labs/6/hundred-dollar-bill.jpg)";
    }else {
        document.body.style.backgroundColor = "white";
    }
//if($("cbBling").attr("checked"))
//        weight = "bold";
    var textArea = document.getElementById("textArea");
    textArea.style.fontWeight = weight;
    textArea.style.color = color;
    textArea.style.textDecoration = txtDecoration;
    
}


window.onload = function () {
    
}

function igpayAtinlayClick() {
    var sentence = document.getElementById("textArea").value;
    var sentenceArray = sentence.split(" ");
    for(let a = 0; a<sentenceArray.length; a++){
        var element = sentenceArray[a];
        if(isVowel(element)) {
            sentenceArray[a] = element+"ay";
        }else {
            sentenceArray[a] = element.substr(1, element.length)+"ay";
        }
    }
   document.getElementById("textArea").value = function(){
       return sentenceArray.join(" ");
   }();
//    alert(sentence);
//    console.log(sentence);
}

function btnMalkovitch() {
     var sentence = document.getElementById("textArea").value;
    var sentenceArray = sentence.split(" ");
    for(let a = 0; a<sentenceArray.length; a++){
        var element = sentenceArray[a];
        if(element.length >= 5)
            sentenceArray[a] = "Malkovitch";
        
    }
   document.getElementById("textArea").value = function(){
       return sentenceArray.join(" ");
   }();
}

function isVowel(x) {

    var result;

    result = x == "A" || x == "E" || x == "I" || x == "O" || x == "U";
    return result;
}