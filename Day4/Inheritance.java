class Shape{
    int area;
    Shape(int length,int breadth){
        this.area=length*breadth;
        System.out.println(length+" "+breadth);
    } 

    int diameter;
    Shape(int radius){
        this.diameter=2*radius;
        System.out.println(radius);
    }
}

class Rectangle extends Shape{
    Rectangle(int length,int breadth){
        super(length,breadth);
        System.out.println(super.area);
    }
}

class Circle extends Shape{
    Circle(int radius){
        super(radius);
        System.out.println(super.diameter);
    }
}

class Inheritance {
    public static void main(String args[]){
        Rectangle r=new Rectangle(34,56);
        Circle c=new Circle(20);
    }
}
