var str = "Apples are round and apples are juicy.";
console.log("(1,2): "+str.substring(1,2));
console.log("(0,10): "+str.substring(0,10));
console.log("(5): "+str.substring(5));

var names:string[] = new Array("Mary","Tom","Jack","Jill");
for(var i =0;i<names.length;i++)
{
    console.log(names[i]);
}

var arr_names:number[] = new Array(4);
for(var i=0;i<arr_names.length;i++){
    arr_names[i] = i*2;
    console.log(arr_names[i]);
}