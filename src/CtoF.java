import java.util.Scanner;

public class CtoF {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double tempF = 0;
        boolean doneA = false;
        String trash = "";
        System.out.print("Enter Fahrenheit : ");
        do {
            if (in.hasNextDouble()) {
                tempF = in.nextDouble();
                System.out.println((tempF - 32) * 5/9);
                doneA = true;
            } else {
                trash = in.nextLine();
                System.out.print("Enter Fahrenheit : ");
            }
        }
        while (!doneA);
    }

}