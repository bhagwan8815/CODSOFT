import java.util.*;

public class StudentGradeCalculater {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("enter number of subjects :");
        int subjects = sc.nextInt();
        int totalsub[] = new int[subjects];
        // taking input marks of all subjects into a array;
        for (int i = 0; i < subjects; i++) {
            System.out.println("enter marks of subject :" + (i+1));
            totalsub[i] = sc.nextInt();
        }
        // calculate the total marks of all the subjects
        int total_marks = 0;
        for (int i = 0; i <totalsub.length; i++) {
            total_marks += totalsub[i];
        }
        // calculate average percentage
        float avg_per = total_marks / subjects;
        System.out.println();
   

        System.out.println("*********---YOUR RESULT----************");
        System.out.println("your total marks is : " +total_marks );
        System.out.println("your average percentage is : "+ avg_per);


        // grade calculation
        if (avg_per >= 90) {
            System.out.println("your grade is :=>  A+");
        } else if (avg_per >= 80 && avg_per < 90) {
            System.out.println("your grade is :=> A");
        } else if (avg_per >= 70 && avg_per < 80) {
            System.out.println("your grade is :=> B+");
        } else if (avg_per >= 60 && avg_per < 70) {
            System.out.println("your grade is :=>  B");
        } else if (avg_per >= 50 && avg_per < 60) {
            System.out.println("your grade is :=>  C+");
        } else if (avg_per >= 40 && avg_per < 50) {
            System.out.println("your grade is :=> C");
        } else if (avg_per >= 30 && avg_per < 40) {
            System.out.println("your grade is :=> D");
        } else {
            System.out.println("your grade is :=> E");
        }

    }

}
