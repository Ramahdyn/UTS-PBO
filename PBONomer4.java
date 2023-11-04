import java.util.Scanner;

class hitungLingkaran {
    private double jariJari;

    public hitungLingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

public class PBONomer4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nMasukkan jari-jari lingkaran : ");
        double jariJari = input.nextDouble();

        hitungLingkaran Hiling = new hitungLingkaran(jariJari);

        System.out.println("\nLuas : " + Hiling.hitungLuas());
        System.out.println("Keliling : " + Hiling.hitungKeliling());

        input.close();
    }
}
