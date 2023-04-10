class Ksatria extends Penduduk {
    public Ksatria(String nama, int pendapatan){
        super(nama, pendapatan);
        pajak(pendapatan, 0.18);
        bayar(pendapatan);
    }

    private void pajak(int pendapatan, double rate){
        this.pendapatan -= (int) (pendapatan * rate);
    }

    public void bayar(int pendapatan){
    }

    public String toString() {
        return "Ksatria " + nama + " membayar pajak sebesar " + pendapatan;
    }
}