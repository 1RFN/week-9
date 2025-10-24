public class MotorListrik extends KendaraanListrik implements KonsumsiEnergi {

    public MotorListrik(double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        super(kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }

    @Override
    public double hitungWaktuPengisian() {
        double energi = energiDibutuhkan();
        double waktuDasar = energi / kecepatanPengisian;
        return waktuDasar * 1.05;
    }

    @Override
    public double hitungEnergiDibutuhkan() {
        return energiDibutuhkan();
    }

    @Override
    public String getJenis() {
        return "Motor Listrik";
    }
}
