public class MobilListrik extends KendaraanListrik implements KonsumsiEnergi {

    public MobilListrik(double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        super(kapasitasBaterai, dayaSaatIni, kecepatanPengisian);
    }
    @Override
    public double hitungWaktuPengisian() {
        double energi = energiDibutuhkan();
        double waktuDasar = energi / kecepatanPengisian;
        return waktuDasar * 1.1; 
    }

    @Override
    public double hitungEnergiDibutuhkan() {
        return energiDibutuhkan();
    }

    @Override
    public String getJenis() {
        return "Mobil Listrik";
    }
}
