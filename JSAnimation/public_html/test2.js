/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


x = 1;
var a = 5;
var b = 10;
var c = function (a, b, c) {
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
    var x = 10;
};
c(8, 9, 10);
document.write(b);
document.write(x);
document.write("===================");
//==================
var x = 9;
function myFunction() {
    return x * x;
}
document.write(myFunction());
x = 5;
document.write(myFunction());

//==================
document.write("===================");
var foo = 1;
function bar() {
    if (!foo) {
        var foo = 10;
    }
    alert(foo);
}
bar();



//============
document.write("===================");

var add = (function () {
    var counter = 0;
    return function () {
        return counter += 1;
    }
})();

// oR

var count = (function () {
    var counter = 0;
    return {
        add: function () {
            counter += 1;
        },
        reset: function () {
            return counter;
        },
        make_adder: function (adder) {
            counter += adder;
        }
    };
})();

count.add();
document.write(count.reset());


//============


var make_adder = (function (adder) {
    var counter = 0;
    return function () {
        counter += adder;
        console.log(counter);
    };
});

add5 = make_adder(5);
add5();
add5();
add5(); // final counter value is 15 
add7 = make_adder(7);
add7();
add7();
add7(); // final counter value is 21


//============ Revealing Module Pattern


var Employee = (function () {
    var name, age, salary;

    function getSalary() {
        return salary;
    }

    function getName() {
        return name;
    }


    function getAge() {
        return age;
    }

    function setSalary(newSalary) {
        salary = newSalary;
    }

    function setAge(newAge) {
        age = newAge;
    }

    function setName(newName) {
        name = newName;
    }

    function increaseSalary(percentage) {
        salary = (getSalary() * percentage / 100) + getSalary();
    }
    function incrementAge() {
        age = getAge() + 1;
    }
    function getObjectString() {
        return getName() + " " + getAge() + " " + getSalary();
    }
    
    var address;
    function getAddress(){
        return address;
    }
    
    function setAddress(newAddress){
        address = newAddress;
    }
    return {
        setSalary: setSalary,
        setAge: setAge,
        setName: setName,
        increaseSalary: increaseSalary,
        incrementAge: incrementAge,
        getObjectString: getObjectString,
        getAddress: getAddress,
        setAddress: setAddress
    };
})();

// Extension 
var employeExtension = (function(e) {
    e.address;
    var getAddress = function (){
        return address;
    };
    
    setAddress = function (newAddress){
        address = newAddress;
    };
})(Employee);



var e1 = Employee;
e1.setAge(12);
e1.setName("Twelve");
e1.setSalary(1200);
e1.increaseSalary(10);
e1.incrementAge();
e1.incrementAge();
e1.setAddress("Add 1 home");
console.log(e1.getObjectString());
console.log(e1.getAddress());


//============ Anonymous Object Literal Return Pattern

var EmployeeAnonymousObjectLiteralReturnType = (function () {
    var name, age, salary;

    function getSalary() {
        return salary;
    }

    function getName() {
        return name;
    }


    function getAge() {
        return age;
    }


    return {
        setSalary: function (newSalary) {
            salary = newSalary;
        },
        setAge: function (newAge) {
            age = newAge;
        },
        setName: function (newName) {
            name = newName;
        },
        increaseSalary: function (percentage) {
            salary = (getSalary() * percentage / 100) + getSalary();
        },
        incrementAge: function () {
            age = getAge() + 1;
        },

        getObjectString: function () {
            return getName() + " " + getAge() + " " + getSalary();
        }

    };
})();


//====== Locally Scoped Object Literal
var EmployeeLocallyScopeObject = (function () {
    var name, age, salary;
// locally scoped Object
    var myObject = {}; // "private" var
    function getSalary() {
        return salary;
    }

    function getName() {
        return name;
    }


    function getAge() {
        return age;
    }


    myObject.setSalary = function (newSalary) {
        salary = newSalary;
    };

    myObject.setAge = function (newAge) {
        age = newAge;
    };
    myObject.setName = function (newName) {
        name = newName;
    };
    myObject.increaseSalary = function (percentage) {
        salary = (getSalary() * percentage / 100) + getSalary();
    };
    myObject.incrementAge = function () {
        age = getAge() + 1;
    };
    myObject.getObjectString = function () {
        return getName() + " " + getAge() + " " + getSalary();
    };
    return myObject;

})();


var e1 = EmployeeLocallyScopeObject;
e1.setAge(112);
e1.setName("One Twelve");
e1.setSalary(100);
e1.increaseSalary(10);
e1.incrementAge();
console.log(e1.getObjectString());


//====== Stacked Locally Scoped Object Literal
var EmployeeStackedLocallyScopeObject = (function () {
    var name, age, salary;
// locally scoped Object

    function getSalary() {
        return salary;
    }

    function getName() {
        return name;
    }


    function getAge() {
        return age;
    }

    var myObject = {
        setSalary: function (newSalary) {
            salary = newSalary;
        },

        setAge: function (newAge) {
            age = newAge;
        },
        setName: function (newName) {
            name = newName;
        },
        increaseSalary: function (percentage) {
            salary = (getSalary() * percentage / 100) + getSalary();
        },
        incrementAge: function () {
            age = getAge() + 1;
        },
        getObjectString: function () {
            return getName() + " " + getAge() + " " + getSalary();
        }
    }; // "private" var
    return myObject;

})();





