class Petani extends Penduduk {
    public Petani(String nama, int pendapatan) {
        super(nama, pendapatan);
        pajak(pendapatan, 0.03);
        bayar(pendapatan);
    }

    private void pajak(int pendapatan, double rate) {
        this.pendapatan -= (int) (pendapatan * rate);
    }

    public void bayar(int pendapatan) {
    }

    public String toString() {
        return "Petani " + nama + " membayar pajak sebesar " + pendapatan;
    }
}