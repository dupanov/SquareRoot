/**
 * Приближенное вычисление корня рядом
 * Created by Вадик on 29.10.2015.
 */
public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(9));
    }


    public static double squareRoot(double a){
        double x=6;
        double epsilon = 1;
        double x1;
        while (epsilon > 0.000001){
            x1=(x+a/x)/2;
            epsilon=Math.abs(x-x1);
            x=x1;
        }
        return x;
    }
}
