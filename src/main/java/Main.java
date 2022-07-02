import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int userInput = input.nextInt();
        int sum = 0;
        for(int i = 0; i <= userInput; i++){
        sum = sum + i;}
        System.out.println((sum));
    }

    }
//        int sum = (userInput)*(userInput+1)/2;

