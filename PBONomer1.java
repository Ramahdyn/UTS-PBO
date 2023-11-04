import java.util.Scanner;

class Telepon {
    private int jam;
    private int menit;
    private int detik;

    public Telepon(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public int biayatotal() {
        int totalDetik = (jam * 3600) + (menit * 60) + detik;
        int biaya = (totalDetik / 5) * 150;
        return biaya;
    }
}

public class PBONomer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jamawal, menitawal, detikawal, jamakhir, menitakhir, detikakhir;

        while (true) {
            System.out.print("Masukkan waktu awal percakapan (jam): ");
            jamawal = input.nextInt();
            if (jamawal < 0 || jamawal > 23) {
                System.out.println("Jam harus berada dalam rentang 0-23");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Masukkan waktu awal percakapan (menit): ");
            menitawal = input.nextInt();
            if (menitawal < 0 || menitawal > 59) {
                System.out.println("Menit harus berada dalam rentang 0-59");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Masukkan waktu awal percakapan (detik): ");
            detikawal = input.nextInt();
            if (detikawal < 0 || detikawal > 59) {
                System.out.println("Detik harus berada dalam rentang 0-59");
            } else {
                break;
            }
        }
        System.out.println("========================================");

        while (true) {
            System.out.print("Masukkan waktu akhir percakapan (jam): ");
            jamakhir = input.nextInt();
            if (jamakhir < 0 || jamakhir > 23) {
                System.out.println("Jam harus berada dalam rentang 0-23");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Masukkan waktu akhir percakapan (menit): ");
            menitakhir = input.nextInt();
            if (menitakhir < 0 || menitakhir > 59) {
                System.out.println("Menit harus berada dalam rentang 0-59");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Masukkan waktu akhir percakapan (detik): ");
            detikakhir = input.nextInt();
            if (detikakhir < 0 || detikakhir > 59) {
                System.out.println("Detik harus berada dalam rentang 0-59");
            } else {
                break;
            }
        }
        System.out.println("========================================");

        Telepon percakapan = new Telepon(jamakhir - jamawal, menitakhir - menitawal, detikakhir - detikawal);
        int biayaTelepon = percakapan.biayatotal();

        int totalDetik = (jamakhir - jamawal) * 3600 + (menitakhir - menitawal) * 60 + detikakhir - detikawal;
        int totalJam = totalDetik / 3600;
        int sisaDetik = totalDetik % 3600;
        int totalMenit = sisaDetik / 60;
        int sisaDetikTerakhir = sisaDetik % 60;

        System.out
                .println("Waktu awal pukul =  " + jamawal + ":" + menitawal + ":" + detikawal);
        System.out.println(
                "Waktu akhir pukul = " + jamakhir + ":" + menitakhir + ":" + detikakhir);
        System.out.println("Total waktu percakapan: " + totalJam + " jam " + totalMenit + " menit " + sisaDetikTerakhir
                + " detik");
        System.out.println("Biaya percakapan telepon sebesar Rp." + biayaTelepon);

        input.close();
    }
}
