public class Penumpang extends Person implements TopUp {
    private boolean hamil;
    private int saldo;

    public Penumpang(int id, String nama, int umur, boolean hamil) {
        super(id, nama, umur);
        this.hamil = hamil;
        this.saldo = 10000;   // saldo awal
    }

    public boolean getHamil() { return hamil; }
    public int getSaldo() { return saldo; }

    @Override
    public void tambahSaldo(int jumlah) {
        if (jumlah > 0) saldo += jumlah;
    }

    public boolean isPrioritas() {
        return umur > 60 || umur < 10 || hamil;
    }

    public void bayar(int ongkos) throws MyException {
        if (saldo < ongkos) throw new MyException("Saldo tidak cukup!");
        saldo -= ongkos;
    }

    public Jenis getJenis() {
        return isPrioritas() ? Jenis.PRIORITAS : Jenis.BIASA;
    }
}
