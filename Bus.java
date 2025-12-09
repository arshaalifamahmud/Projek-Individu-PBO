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
    public boolean naik(Penumpang p) {
        if (total() >= 40) return false;

        if (p.getSaldo() < ONGKOS) {
            System.out.println("Saldo tidak cukup.");
            return false;
        }

        try {
            if (p.isPrioritas()) {
                if (tambah(prioritas, p)) { p.bayar(ONGKOS); totalPendapatan += ONGKOS; return true; }
                if (tambah(biasa, p)) { p.bayar(ONGKOS); totalPendapatan += ONGKOS; return true; }
                if (tambah(berdiri, p)) { p.bayar(ONGKOS); totalPendapatan += ONGKOS; return true; }
            } else {
                if (tambah(biasa, p)) { p.bayar(ONGKOS); totalPendapatan += ONGKOS; return true; }
                if (tambah(berdiri, p)) { p.bayar(ONGKOS); totalPendapatan += ONGKOS; return true; }
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
            return false;
        }

        return false;
    }
     private boolean hapus(Penumpang[] arr, String nama) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getNama().equalsIgnoreCase(nama)) {
                arr[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean turun(String nama) {
        if (hapus(biasa, nama)) return true;
        if (hapus(prioritas, nama)) return true;
        if (hapus(berdiri, nama)) return true;
        return false;
    }

    private String list(Penumpang[] arr) {
        String s = "";
        for (Penumpang p : arr) if (p != null) s += p.getNama() + ", ";
        return s.equals("") ? "<kosong>" : s;
    }

    @Override
    public String toString() {
        return "Penumpang Biasa: " + list(biasa) +
               "\nPenumpang Prioritas: " + list(prioritas) +
               "\nPenumpang Berdiri: " + list(berdiri) +
               "\nJumlah: " + total() +
               "\nPendapatan: " + totalPendapatan;
    }
}

