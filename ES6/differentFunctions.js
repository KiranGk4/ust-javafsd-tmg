// Sample function
function add(n1, n2)
{
    var sum = n1 + n2;
    console.log("The sum of the values entered: "+sum);
}
add(12,13);

// Default function
function show1(num1, num2=200)
{
    console.log("\nnum1 = "+num1);
    console.log("num2 = "+num2);
}
show1(100)

function show(a,...args)
{
    console.log("\n"+a+" "+args);
}
show(50,60,70,80,90,100);