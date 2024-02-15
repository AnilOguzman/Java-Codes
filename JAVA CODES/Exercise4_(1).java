import java.util.Scanner;

public class Exercise4 {
    
public static final int ID_LENGTH = 11;

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(
                "1. The ID should only consist of 11 digits\n" +
                "2. The last digit of ID must be positive\n" +
                "3. The first digit of the sum of the first 10 digits must match the 11th digit" +
                "Input a valid ID");
        String id = input.nextLine();

        if (is_Valid_ID_2(id)) {
            System.out.println("ID is valid: " + id);
        } else {
            System.out.println("Not a valid ID: " + id);
        }

    }

    public static boolean is_Valid_ID_1(String id) {



        int last_digit = Character.getNumericValue(id.charAt(id.length()-1));

        if (last_digit %2 == 1)
            return false;
            
        int sum = 0;
        
        for (int i = 0; i < id.length()-1; i++) {

            int ch = (int) id.charAt(i);

            sum += ch;
        }
        
        if (sum%10 != last_digit)
            return false;


        return true;
    }
    
    public static boolean is_Valid_ID_2(String id) {
        int last_digit = Character.getNumericValue(id.charAt(id.length()-1));
        
        if (first_condition(id) && second_condition(last_digit) && third_condition(id, last_digit))
            return true;
        else
            return false;
    }
    
    public static boolean first_condition(String id){
        if (id.length() != ID_LENGTH) 
            return false;
        return true;
    }

    public static boolean second_condition(int last_digit){
        if (last_digit %2 == 1)
            return false;
        return true;
    }
    
    public static boolean third_condition(String id, int last_digit){
        int sum = 0;
        
        for (int i = 0; i < id.length()-1; i++) {

            int ch = (int) id.charAt(i);

            sum += ch;
        }
        
        if (sum%10 != last_digit)
            return false;

        return true;
    }

}