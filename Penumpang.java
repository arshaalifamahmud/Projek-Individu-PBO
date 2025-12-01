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

