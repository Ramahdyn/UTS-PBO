import java.util.Scanner;

class HitungBMI {
    private double beratBadan;
    private double tinggiBadan;

    public HitungBMI(double beratBadan, double tinggiBadan) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    public double hitungBMI() {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    public String tentukanStatus() {
        double bmi = hitungBMI();
        if (bmi >= 18.5 && bmi <= 22.9) {
            return "Berat badan ideal";
        } else if (bmi > 22.9) {
            return "Overweight";
        } else {
            return "Underweight";
        }
    }
}

public class PBONomer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg) : ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan tinggi badan (cm) : ");
        double tinggiBadancm = input.nextDouble();
        double tinggiBadanM = tinggiBadancm / 100.0;

        System.out.println("========================================");

        HitungBMI hitungBMI = new HitungBMI(beratBadan, tinggiBadanM);
        double bmi = hitungBMI.hitungBMI();
        String status = hitungBMI.tentukanStatus();

        System.out.println("BMI Anda adalah: " + bmi);
        System.out.println("Status berat badan Anda: " + status);

    }
}
