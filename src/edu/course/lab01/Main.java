package edu.course.lab01;

public class Main {
    public static void main(String[] args){
        if (args.length == 0){
            print();
            return;
        }
        String command = args[0];
        switch (command){
            case "fizzbuzz":
                if (args.length == 1){
                    FizzBuzz.run();
                }else {
                    print();
                }
                break;
            case "reverse":
                if (args.length == 2){
                    System.out.println(TextTasks.reverse(args[1]));
                }else{
                    print();
                }
                break;
            case "palundrome":
                if (args.length == 2){
                    System.out.println(TextTasks.isPalindrome(args[1]));
                }
                else{
                    print();
                }
                break;
            case "quadratic":
                if (args.length == 4){
                    QuadraticEquation.solve(Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]));
                }else {
                    print();
                }
                break;
            case "series":
                if (args.length == 1){
                    SeriesCalculator.run();
                }else {
                    print();
                }
                break;
            default:
                print();
                break;
        }
    }
    private static void print(){
        System.out.println(" fuzzbuzz");
        System.out.println(" reverse <строка>");
        System.out.println(" quadratic <a>,<b>,<c>");
        System.out.println(" series");
        System.out.println(" palindrome <строка>");

    }
}
