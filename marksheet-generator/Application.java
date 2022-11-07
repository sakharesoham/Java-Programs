import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to the Marksheet");
        Scanner scan = new Scanner(System.in);
        int count = 0, GTotal = 0;
        String firstName, fatherName, rollNo;
        System.out.println("Enter First Name of the Student");
        firstName = scan.nextLine();

        System.out.println("Enter Father's Name");
        fatherName = scan.nextLine();

        System.out.println("Enter the Roll No of the Student");
        rollNo = scan.nextLine();

        String[] subject = new String[]{"Mathematics", "Human Value", "Physics", "Computer Programming", "Electrical and Electronics", "Mechanical Engnineering"};
        String[] subCode = new String[]{"MA-102", "HU-103", "PY-101", "CS-103", "EE-101", "ME-101"};

        int[] midMarks = new int[6];
        int[] semMarks = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter Mid Sem Marks for " + subject[i]);
            midMarks[i] = scan.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter Final Sem Marks for " + subject[i]);
            semMarks[i] = scan.nextInt();
        }

        System.out.println("\t\t\t\t\tYour Result");
        System.out.println("\t\t College:\t" + " MMM's College of Engineering, Pune");
        System.out.printf("\n\t\tName:   " + firstName);
        System.out.printf("\t\tFather's Name:\t" + fatherName);
        System.out.printf("\t\tEnter Roll Number:\t" + rollNo);
        System.out.print("\n\t\t" + "SubCode" + "\t\tMarks" + "\tMarks2" + "\tTotal\n");

        for (int i = 0; i < 6; i++) {
            if ((midMarks[i]) + (semMarks[i]) >= 40) {
                System.out.println("\t\t " + subCode[i] + "\t\t " + midMarks[i] + "\t\t" + semMarks[i] + "\t\t" + ((midMarks[i]) + (semMarks[i])));
            } else {
                System.out.println("\t\t " + subCode[i] + "\t\t " + midMarks[i] + "\t\t" + semMarks[i] + "\t\t" + ((midMarks[i]) + (semMarks[i])) + "*");
                count++;
            }
            GTotal = (GTotal + (midMarks[i]) + (semMarks[i]));
        }
        if (count > 0) {
            System.out.println("\n\t\tGrand Total:" + GTotal + "\tResult:\tFAIL");
        } else {
            System.out.println("\n\t\tGrand Total:" + GTotal + "\tResult:\tPASS");
        }

    }
}
