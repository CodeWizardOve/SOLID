// before refactoring

class Shape
{
    public double calculateArea(String shapeType, double param1, double param2)
    {
        double area = 0.0;
        if (shapeType.equalsIgnoreCase("circles"))
        {
            double radius = param1;
            area = 3.14 * radius * radius;
        }

        else if (shapeType.equalsIgnoreCase("rectangle"))
        {
            double width = param1;
            double height = param2;
            area = width * height;

        }
        return area;

    }
}

// After refactoring

abstract class Shape
{
    public abstract double calculateArea();
}

class circle extends Shape
{
    private double radius;
    public void Circle(double radius)
    {
        this.radius = radius;
    } 
    @Override
    public double calculateArea()
   {
      return  3.14 * radius * radius;
   }
}


class Rectangle extends Shape
{
     private double width;
     private double height;
     public Rectangle(double width, double height)
     {
        this.width = width;
        this.height = height;
     }

     @Override
     public double calculateArea()
     {
        return width * height;
     }
}

