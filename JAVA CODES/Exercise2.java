import java.util.Scanner;

public class Exercise2 {
    
public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("###Calculator###");
        System.out.println("Operations");
        System.out.println("--------------------");
        System.out.println("Addition: 1 ");
        System.out.println("Subtraction: 2");
        System.out.println("Multiplication : 3");
        System.out.println("Division: 4");
        System.out.println("--------------------");

        System.out.println("Please enter the first number");
        double firstnumber = kb.nextInt();
        
        System.out.println("Please enter the second number");
        double secondnumber = kb.nextInt();
        
        System.out.println("Which operation do you want to do");
        int choice = kb.nextInt();
        
        switch(choice){
            
            case 1:
                System.out.println("Result of addition is " + addition(firstnumber, secondnumber));
                break;
            case 2:
                System.out.println("Result of subtraction is " + subtraction(firstnumber, secondnumber));
                break;                
            case 3:
                System.out.println("Result of multiplication is " + multiplication(firstnumber, secondnumber));
                break;
            case 4:
                System.out.println("Result of division is " + division(firstnumber, secondnumber));
                break;
            default:
                System.out.println("Operation is not valid");
                break;
        }

    }

    public static double addition(double x, double y){
        return x+y;
    }

    public static double subtraction(double x, double y){
        return x-y;
    }

    public static double division(double x, double y){
        return x/y;
    }

    public static double multiplication(double x, double y){
        return x*y;
    }

}