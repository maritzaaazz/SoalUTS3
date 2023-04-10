class PandaiBesi extends Penduduk {
    public PandaiBesi(String nama, int pendapatan) {
        super(nama, pendapatan);
        pajak(pendapatan, 0.06);
        bayar(pendapatan);
    }

    private void pajak(int pendapatan, double rate) {
        this.pendapatan -= (int) (pendapatan * rate);
    }

    public void bayar(int pendapatan) {
    }

    public String toString() {
        return "Pandai Besi " + nama + " membayar pajak sebesar " + pendapatan;
    }
}