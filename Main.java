interface Measurable 
{
    public double Area();
    public double Perimeter();
}

class Square implements Measurable
{
    private double side;
    public Square(double side) 
    {
        this.side = side;
    }
    public double Area()
    {
        return side * side;
    }
    public double Perimeter()
    {
        return 4 * side;
    }
}

class Circle implements Measurable
{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double Area()
    {
        return Math.PI * radius;
    }

    public double Perimeter()
    {
        return 2 * Math.PI * radius;
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        Measurable circ = new Circle(10);
        assert circ.Area() == 100 * Math.PI;
        assert circ.Perimeter() == 20 * Math.PI;
        Measurable square = new Square(10);
        assert square.Area() == 100;
        assert square.Perimeter() == 40;
    }
}