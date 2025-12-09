import java.util.Scanner;

public class TestBus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bus bus = new Bus();
        int id = 1;

        while (true) {
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            String p = in.nextLine();


            if (p.equals("1")) {
                System.out.print("Nama: ");
                String nama = in.nextLine();

                System.out.print("Umur: ");
                int umur = Integer.parseInt(in.nextLine());

                System.out.print("Hamil (y/n): ");
                String h = in.nextLine();
                boolean hamil = h.equalsIgnoreCase("y");

                Penumpang pn = new Penumpang(id++, nama, umur, hamil);
