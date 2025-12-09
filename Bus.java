public class Bus {
    private Penumpang[] biasa = new Penumpang[16];
    private Penumpang[] prioritas = new Penumpang[4];
    private Penumpang[] berdiri = new Penumpang[20];

    public static final int ONGKOS = 2000;
    private int totalPendapatan = 0;

    private int hitung(Penumpang[] arr) {
        int c = 0;
        for (Penumpang p : arr) if (p != null) c++;
        return c;
    }

    public int total() {
        return hitung(biasa) + hitung(prioritas) + hitung(berdiri);
    }

    private boolean tambah(Penumpang[] arr, Penumpang p) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = p;
                return true;
            }
        }
        return false;
    }
