import java.util.Scanner;

public class studentdetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter College Name: ");
        String collegename = sc.nextLine();

        System.out.print("Enter Stream: ");
        String stream = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int studentid = sc.nextInt();

       sc.nextLine();

        System.out.print("Enter Student Name: ");
        String studentname = sc.nextLine();

        int numberOfSubjects = 6;
        int sumOfMarks = 0;

        for(int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter Marks for Subject " + (i + 1) + ": ");
            int mark = sc.nextInt();
            sumOfMarks += mark;
        }


        double percentage = sumOfMarks / (double)numberOfSubjects;

        System.out.println("\n--- Student Report Card ---");
        System.out.println("College Name : " + collegename);
        System.out.println("Stream       : " + stream);
        System.out.println("Student ID   : " + studentid);
        System.out.println("Student Name : " + studentname);
        System.out.printf("Percentage   : %.2f%%\n", percentage); // Formats to 2 decimal places
    }
}