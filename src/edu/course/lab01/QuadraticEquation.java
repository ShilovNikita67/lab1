package edu.course.lab01;

public class QuadraticEquation {
    public static void solve(double a, double b, double c){
        if (a == 0){
            System.out.println("Ошибка");
            return;
        }
        double discriminant = b*b-4*a*c;
        if (discriminant > 0){
            double sqrtD = Math.sqrt(discriminant);
            System.out.println("x1=" + (-b + sqrtD)/(2*a)+ ", x2="+ (-b - sqrtD)/(2*a));
        }
        else if (discriminant == 0){
            System.out.println("x="+ (-b/(2*a)));
        }
        else{
            System.out.println("Корней нет");
        }
    }

}
