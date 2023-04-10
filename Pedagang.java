class Pedagang extends Penduduk {
    public Pedagang(String nama, int pendapatan) {
        super(nama, pendapatan);
        pajak(pendapatan, 0.12);
        bayar(pendapatan);
    }

    private void pajak(int pendapatan, double rate) {
        this.pendapatan -= (int) (pendapatan * rate);
    }

    public void bayar(int pendapatan) {
    }

    public String toString() {
        return "Pedagang " + nama + " membayar pajak sebesar " + pendapatan;
    }
}