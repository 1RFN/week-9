public abstract class KendaraanListrik {
    protected double kapasitasBaterai;    
    protected double dayaSaatIni;           
    protected double kecepatanPengisian;   

    public KendaraanListrik(double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        this.kapasitasBaterai = kapasitasBaterai;
        this.dayaSaatIni = dayaSaatIni;
        this.kecepatanPengisian = kecepatanPengisian;
    }

    public abstract double hitungWaktuPengisian();
    public abstract String getJenis();

    protected double energiDibutuhkan() {
        return kapasitasBaterai - dayaSaatIni;
    }
}
