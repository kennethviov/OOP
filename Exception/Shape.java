class Shape {
    public double area() {
        return 0;
    }
}

class Square extends Shape{
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double area() {
        return side * side;
    }
}

class Circle extends Shape{
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }
}