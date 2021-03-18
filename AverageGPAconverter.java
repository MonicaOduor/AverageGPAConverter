import java.util.Scanner;

public class AverageGPAconverter {
    public static void main(String[] args){
        System.out.println("How many courses do you have this semester?");

        Scanner scan = new Scanner(System.in);
        scan.close();
        int x =scan.nextInt();
        //store the answer of how many courses one has
        

        double[] noOfCourses = new double[x]; 
        //array, the length is the answer given above, x

        double sum = 0;
        //sum total of all courses

        for (int i = 0; i < noOfCourses.length; i++){
            System.out.println("Enter your average for the course"  + (i+1) + ":");
            //print out average for each course from 1 

            noOfCourses[i] = scan.nextDouble();
            //stores value of input of each course average

        }

        for(int y = 0; y<noOfCourses.length; y++){
            sum = sum + noOfCourses[y];
        }
        //calculate the sum of all courses

        double average = sum / noOfCourses.length;

        if(average >= 70){
            System.out.println("You have grade A");
        } else if(average >= 60){
            System.out.println("You have grade B");
        } else if(average >= 50){
            System.out.println("You have grade C");
        } else if(average >= 40){
            System.out.println("You have grade D");
        } else if (average < 40){
            System.out.println("You have failed");
        }
        System.out.println("Your average is " + average);
    } 
}
