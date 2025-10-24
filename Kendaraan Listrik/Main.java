import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<KendaraanListrik> daftar = new ArrayList<>();
        DecimalFormat df = new DecimalFormat(".####");


        daftar.add(new MobilListrik(80.0, 20.0, 10.0));
        daftar.add(new MotorListrik(30.0, 10.0, 5.0)); 
        daftar.add(new MobilListrik(60.0, 45.0, 12.0)); 
        daftar.add(new MotorListrik(25.0, 20.0, 4.0)); 

        double totalWaktu = 0.0;
        double totalEnergi = 0.0;

        for (KendaraanListrik k : daftar) {
            double waktu = k.hitungWaktuPengisian();
            double energi = 0.0;

            if (k instanceof KonsumsiEnergi konsumsiEnergi) {
                energi = konsumsiEnergi.hitungEnergiDibutuhkan();
            }

            totalWaktu += waktu;
            totalEnergi += energi;

            System.out.println(k.getJenis() + " -> waktu: " + df.format(waktu) + " jam, energi: " + df.format(energi) + " kWh");

        }

        System.out.println();
        System.out.println("Total waktu pengisian seluruh kendaraan: " + df.format(totalWaktu) + " jam");
        System.out.println("Total energi dibutuhkan: " + df.format(totalEnergi) + " kWh");

    }
}
