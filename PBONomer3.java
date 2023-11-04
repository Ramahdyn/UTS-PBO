import java.util.Scanner;

public class PBONomer3 {
    private static final int Jumlah_bilangan = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < Jumlah_bilangan; i++) {
            System.out.print("Masukkan bilangan ke " + (i + 1) + " : ");
            int bilangan = scanner.nextInt();
            total += bilangan;
        }

        System.out.println("\nJumlah Dari 10 Bilangan adalah : " + total);
    }
}
