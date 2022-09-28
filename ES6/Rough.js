//1
var num1 = 30;
var num2 = 20;
var res = num1 > num2 ? "Yes 30 is greater than 20" : "No, It's not";
console.log(res);
console.log("-----------------------------")

//2
var $var12 = 200;
function example(){
    var $var12 = 300;
    console.log("Inside example() function = "+$var12);
}
console.log("Outside example() function = "+$var12);
example();
console.log("-----------------------------");


//3
var i;
for(i=1;i<=10;i++)
{
    console.log("2 x "+i+" = ",2*i);
}
console.log("-----------------------------");


//4
var num = 20;
if(num > 10)
{
    if(num % 2 == 0)
    {
        console.log(num + " is greater than 10 and even number.");
    }
    else   
        console.log(num+" is greater than 10 and odd number.");
}
else
    console.log(num+" is smaller than 10");
console.log("After nested if statement.");