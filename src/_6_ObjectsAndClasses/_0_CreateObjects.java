package _6_ObjectsAndClasses;

import java.util.Scanner;

public class _0_CreateObjects {
    static class Circle {
        double radius;
//дефиниране на конструктор, т.е когато създаваме нов член на този клас
        // new Circle( radius : стойност)
        Circle(double radius){
            this.radius = radius;
        }
        //този конструктор създава Circle със нулева стойност по подразбиране
       /* Circle(){
            this(0);
        }*/
        double getRadius(){
            return this.radius;
        }
        void setRadius(double radius){
            this.radius = radius;
        }
        double getArea() {
            return radius * radius * Math.PI;
        }
        void scale(double factor){
            radius *=factor;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Circle x = new Circle(5);
            x.radius = 5;
            x.setRadius(7);
            double area = x.radius * x.radius * Math.PI;
            System.out.println(area);

            Circle y = new Circle(10);
            y.radius = 10;
            y.scale(2);
            System.out.println(y.getArea());
        }
    }
}
