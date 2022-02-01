import java.util.Random;
import java.util.Scanner;
/**
 * modify the input number based on odd/even.
 *
 * @author Ting Liu
 * @version 1.0
 */
public class numberProcessor
{
    public int[] process(int number) {
        int[] output = new int[5];
        for (int i = 0; i < 5; i++) {
            if (number % 2 == 0) {
                output[i] = number / 2;
            } else {
                output[i] = number * 2;
            }
            number++;
        }
        return output;
    }
    
    public static boolean isNum(String str){
        if(str.length() == 0){
            return false;
        }
        
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    
    public static void main(String args[]) {
        numberProcessor np = new numberProcessor();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String val;
        //val = r.nextInt(20);
        //val = r.nextInt(21) + 10;
        do {
            System.out.print("Enter a value: ");
            val = sc.next();
        } while(isNum(val) == false);
        
        int[] results = np.process(Integer.parseInt(val));
        for (int i = 0; i < results.length; i++) {
            System.out.println("#: " + results[i]);
        }
    }
    
}
