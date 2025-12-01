public abstract class Person {
    protected int id;
    protected String nama;
    protected int umur;

    public Person(int id, String nama, int umur) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
    }

    public int getID() { return id; }
    public String getNama() { return nama; }
    public int getUmur() { return umur; }
}
