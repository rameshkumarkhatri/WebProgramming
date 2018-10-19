/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


x = 1;
var a = 5;
var b = 10;
var c = function (a, b, c) {
    var x = 10;
    document.write(x);
    document.write(a);
    var f = function (a, b, c) {
        b = a;
        document.write(b);
        b = c;
        var x = 5;
    }
    f(a, b, c);
    document.write(b);
}
c(8, 9, 10);
document.write(b);
document.write(x);


var v = { name : "fred" , major:"music" , 
    fn : function(m, n) {
        if(m < n){
            return m;
        }else if(m > n){
            return n;
        }else {
            return m*m*n*n;
        }   
    }
};


document.write("\n"+v.fn(2,2));


function Employee(name, salary, position){
    this.name = name;
    this.salary = salary;
    this.position = position;
}

var em1 = new Employee("Bhoori", 1200, "HR Assistant");
var em2 = new Employee("Ani", 1000, "Jr. Developer");
var em2 = new Employee("Man", 8999, "CEO");

document.write("\n"+em1.name+"  "+em1.salary+"  "+em1.position);
document.write("\n"+em2.name+"  "+em2.salary+"  "+em2.position);
document.write("\n"+em3.name+"  "+em3.salary+"  "+em3.position);
