import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int [] marks=new int[6];
    static int maxMark=0;

    //this is the method to calculate the average of the marks in the array
    //question 03
    static void average(int sum) {
        double ave;
        ave=sum/marks.length;
        System.out.println("Average marks: "+ave);
    }

    //question 04
    //the method find the maximum number
    static void maximumMark(int mark) {
        if (mark > maxMark) {
            maxMark = mark;
        }
    }

    //question 05
    //the method to find the minimum mark
    static int minimumMark(int []marks){
        int minMark=marks[0];

        for(int i=0;i<marks.length;i++){
            if (marks[i] < minMark ){
                minMark = marks[i];
            }
        }
        return minMark;
    }

    //question 06
    //sorting the array marks in ascending order
    static int []sortedArray(int[] marks){
        Arrays.sort(marks);
        return marks;
    }


    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        //question 01
        for(int i=0;i<6;i++){
            System.out.print("Please enter your marks here : ");
            int mark = scan.nextInt();
            marks[i]=mark;
        }

        System.out.println(Arrays.toString(marks));

        //question 02

        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;

        for(int i=0;i<6;i++) {
            if (marks[i] < 40) {
                count1++;
            } else if (marks[i] < 50) {
                count2++;
            } else if (marks[i] < 60) {
                count3++;
            } else if (marks[i]<70) {
                count4++;
            } else{
                count5++;
            }
        }
        System.out.println("Fail : "+count1);
        System.out.println("Pass : "+count2);
        System.out.println("2:2 : "+count3);
        System.out.println("2:1 : "+count4);
        System.out.println("First : "+count5);

        //question 03
        int total=0;
        for(int i=0;i<6;i++){
            total+=marks[i];
        }
        average(total);

        //question 04
        for(int i=0;i<6;i++){
            maximumMark(marks[i]);
        }
        System.out.println("Maximum mark : "+maxMark);

        //question 05
        int minMark = minimumMark(marks);
        System.out.println("Minimum mark : "+minMark);

        //question 06
        int []sortArray=sortedArray(marks);
        System.out.println("Sorted array : "+ Arrays.toString(sortArray));
    }
}

