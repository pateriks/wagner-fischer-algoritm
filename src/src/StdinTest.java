import java.util.Scanner;

//StdinTest takes two lines of String input and calls any function
//and print the result from the call
public class StdinTest {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String in1 = stdin.nextLine().trim();
        String in2 = stdin.nextLine().trim();
        //call function and print the result
        try {
            System.out.print(WFA.editD(in1, in2));
        } catch (Exception e) {
            System.out.println("Some exception occurred se err output for more information");
            System.err.println(e);
        }
    }
}
