class SBA5Q3
{
    li:string;
    constructor(a:string)
    {
        this.li = a;
    }
    disp(arr:string[]):void{
        var n = 0;
       for(var i=0;i<arr.length;i++)
       {
            if(this.li == arr[i])
            {
                n = 1;
                break;
            }
            
       }
       if(n == 1)
        {
            console.log(this.li+" is in the array.\n");
        }
        else{
            console.log(this.li+" is not in the array.\n");
        }
    }
}
var arr_val = new Array('Hi','Hello','Hey');
console.log("Given element is in the array or not: ");
var obj2 = new SBA5Q3('Hi');
obj2.disp(arr_val);
var obj3 = new SBA5Q3('Hy');
obj3.disp(arr_val);