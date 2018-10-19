/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function calcTip() {
    
    var totalElem = document.getElementById('total');
    var subtotalElem = document.getElementById('subtotal');
    var tipElem = document.getElementById('tip');    
    var subtotal = subtotalElem.value;
    var tip = (subtotal * tipElem.value)/100;
    var total = parseFloat(subtotal) + parseFloat(tip);
    totalElem.innerHTML = '$' + total;
    
    if(tipElem.value > 50)
        alert("That means service was awesome");
    if(tipElem.value <= 50)
    alert("That means service was OK");
}
