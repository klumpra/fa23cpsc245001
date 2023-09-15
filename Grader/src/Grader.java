import java.util.Scanner;
public class Grader {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade1, grade2, grade3;
		System.out.print("Enter three grades separated by spaces: ");
		grade1 = sc.nextInt();
		grade2 = sc.nextInt();
		grade3 = sc.nextInt();
		int total = grade1 + grade2 + grade3;
		double avg = total/3.0;
		String letterGrade;
		if (avg >= 90) {
			letterGrade = "A";
		} else if (avg >= 80) {
			letterGrade = "B";
		} else if (avg >= 70) {
			letterGrade = "C";
		} else if (avg >= 60) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		System.out.printf("Your average was %.2f, and that is a grade of %s.\n",
				 avg,letterGrade);
	}
}
