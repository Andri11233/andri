import java.util.Scanner; // Import Scanner class

public class Bab6soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        // Request input from the user
        System.out.print("NIM ? : ");
        int NIM = input.nextInt();
        input.nextLine();  // Clear the buffer

        System.out.print("NAMA ? : ");
        String Nama = input.nextLine();

        System.out.print("NILAI ? : ");
        int Nilai = input.nextInt();

        // Determine the grade based on the value
        char grade;
        if (Nilai >= 85) {
            grade = 'A';
        } else if (Nilai >= 70) {
            grade = 'B';
        } else if (Nilai >= 55) {
            grade = 'C';
        } else if (Nilai >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Display the results
        System.out.println("\nOutput:");
        System.out.println("NIM : " + NIM);
        System.out.println("NAMA : " + Nama);
        System.out.println("NILAI : " + Nilai);
        System.out.println("GRADE : " + grade);

        input.close(); // Close the Scanner object
    }
}
