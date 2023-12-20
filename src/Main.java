import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int [] marks=new int[6];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<6;i++){
            System.out.print("Please enter your marks here : ");
            int mark = scan.nextInt();
            marks[i]=mark;
        }
        System.out.println(Arrays.toString(marks));
    }
}

