public class ClassA {
    public static void main(String[] args) {
        Car c1=new Car() {
            public void drive() {
                System.out.println("Driving BMW");
            }
        };
        c1.drive();
        //Anonymous class into lambda expression----(parameters->Expression
        Car c2=()->{
                System.out.println("Driving TATA");
                System.out.println("Driving car");
            };
        c2.drive();
        Multiplication m=(a,b)-> a*b;
        System.out.println(m.multiply(6,8));

        Audi A=new Audi();
       A.drive();
    }
}
class Audi implements Car{
    @Override
    public void drive() {
   System.out.println("driving Audi");
    }
}
@FunctionalInterface
interface Car{
    public void drive();
}
@FunctionalInterface
interface Multiplication{
    int multiply(int a,int b);
}