import java.util.Scanner;

public class Exercise1 {
    
    public static double smallest_Math(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    }
    
    public static double smallest(double x, double y, double z)
    {
        if(x<=y && x<=z){
            return x;
        }
        else if(y<=x && y<=z){
            return y;
        }
        else{
            return z;
        }
    }
    

    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The smallest value is " + smallest_Math(x, y, z)+"\n" );
    }
    

}