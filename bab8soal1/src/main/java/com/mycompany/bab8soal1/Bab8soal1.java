import java.util.Scanner; // Import the Scanner class

public class Bab8soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request initial and final values from the user
        System.out.print("Nilai Awal ?: ");
        int nilaiAwal = scanner.nextInt();

        System.out.print("Nilai Akhir ?: ");
        int nilaiAkhir = scanner.nextInt();

        // Validate input
        if (nilaiAwal > nilaiAkhir) {
            System.out.println("Nilai akhir harus lebih besar atau sama dengan nilai awal.");
        } else {
            // Loop to display numbers with an increment of 5
            int nomor = 1;  // Initialize the ordinal number
            for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
                System.out.println(nomor + ". " + i);
                nomor++;  // Increment the ordinal number
            }
        }

        // Close the scanner to release resources
        scanner.close();
    }
}

