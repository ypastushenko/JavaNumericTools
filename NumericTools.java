import java.util.Random;

/**
 * Created by Yuriy on 05/04/2017.
 */
class NumericTools {
    static double round(double value, int scale) {
        return Math.round(value * Math.pow(10, scale)) / Math.pow(10, scale);
    }
    static int nextInt(){
        return new Random().nextInt();
    }
    static int nextInt(int upperBound){
        return new Random().nextInt(upperBound);
    }
    static int nextInt(int lowerBound, int upperBound){
        return new Random().nextInt(upperBound - lowerBound) + lowerBound;
    }
    static int getLengthOfNumber(int number){
        String s = Integer.toString(number);
        return s.length();
    }
    static boolean doubleEquals(double left, double right, double eps) {
        return (Math.abs(left - right) <= eps);
}
