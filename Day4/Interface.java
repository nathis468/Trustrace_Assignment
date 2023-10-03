interface Calculator{
    public void add(int num1,int num2);
    public void add(float num1,float num2);
    public void add(double num1,double num2);
    public void subtract(int num1,int num2);
    public void subtract(float num1,float num2);
    public void subtract(double num1,double num2);
    public void multiply(int num1,int num2);
    public void multiply(float num1,float num2);
    public void multiply(double num1,double num2);
    public void divide(int num1,int num2);
    public void divide(float num1,float num2);
    public void divide(double num1,double num2);
}

abstract class Add implements Calculator{
    public void add(float num1,float num2){
        System.out.println("Addition of 2 integer values : "+num1+num2);
    }
    public void add(int num1,int num2){
        System.out.println("Addition of 2 float values : "+num1+num2);
    } 
    public void add(double num1,double num2){
        System.out.println("Addition of 2 double values : "+num1+num2);
    }
}

abstract class Sub extends Add{
    public void subtract(int num1,int num2){
        System.out.println("Subtraction of 2 integer values : "+(num1-num2));
    }
    public void subtract(float num1,float num2){
        System.out.println("Subtraction of 2 float values : "+(num1-num2));
    }
    public void subtract(double num1,double num2){
        System.out.println("Subtraction of 2 double values : "+(num1-num2));
    }
}

abstract class Mul extends Sub{
    public void multiply(int num1,int num2){
        System.out.println("Multiplication of 2 integer values : "+(num1*num2));
    }
    public void multiply(float num1,float num2){
        System.out.println("Multiplication of 2 float values : "+(num1*num2));
    }
    public void multiply(double num1,double num2){
        System.out.println("Multiplication of 2 integer values : "+(num1*num2));
    }
}

class Div extends Mul{
    public void divide(int num1,int num2){
        System.out.println(num1/num2);
    }
    public void divide(float num1,float num2){
        System.out.println(num1/num2);
    }
    public void divide(double num1,double num2){
        System.out.println(num1/num2);
    }
}

class Interface{
    public static void main(String args[]){
        Calculator calc=new Div();
        calc.add(34,23);
        calc.add(34f,23f);
        calc.add(34.43,23.65);
        calc.subtract(34,23);
        calc.subtract(34f,23f);
        calc.subtract(34.43,23.65);
        calc.multiply(34,23);
        calc.multiply(34f,23f);
        calc.divide(34,23);
        calc.divide(34f,23f);
        calc.divide(34.43,23.65);
    }
}