//Before Refactoring

class Bird
{
    public void fly(){}
}

class Duck extends Bird{}
class Ostrich extends Bird{}


//after Refactoring

class Bird{}
class FlyingBirds extends Bird
{
    public void fly(){}
}

class Duck extends FlyingBirds{}
class Ostrich extends Birds{} 