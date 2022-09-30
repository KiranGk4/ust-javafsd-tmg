class ClassCar
{
    engine:string;
    constructor(engine:string)
    {
        this.engine = engine;
    }

    disp():void{
        console.log("Function displays Engine is: "+this.engine)
    }
}

var obj1 = new ClassCar("xyz");
console.log("Reading attribute value Engine as: "+obj1.engine)
obj1.disp();