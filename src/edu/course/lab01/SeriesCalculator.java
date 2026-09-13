package edu.course.lab01;

public class SeriesCalculator {
    private static final double threshold = 1e-6;
    public static void run(){
        double sum = 0;
        int n = 2;
        int lastN = 0;
        int count = 0;

        while (true){
            double term = 1.0 / (n*n+n-2);
            if (Math.abs(term)< threshold){
                break;
            }
            sum += term;
            lastN = n;
            count++;
            n++;
        }
        System.out.println("Сумма:"+sum);
        System.out.println("Последний добавленный n:"+ lastN);
        System.out.println("Кол-во добавленных членов:"+ count);
    }
}
