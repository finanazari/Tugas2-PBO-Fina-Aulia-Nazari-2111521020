public class main {
    public static void main(String[] args) {

        

        Asdos a = new Asdos("Fairuzikun", 24, 1); 
        Elemen b = new Dosen("Raja OP Damanik", 5); //upcasting
        Asdos c = new Asdos("Angel-chan",21, 1);
        Mahasiswa d = new Mahasiswa("Firman", 20);
        Mahasiswa e = new Mahasiswa("need to pass this semester", 23);
        Elemen f = new Dosen("Nivotko", 3); //upcasting

        a.mailCheck();
        b.mailCheck();
        c.mailCheck();
        d.mailCheck();
        e.mailCheck();
        f.mailCheck();

        int totalJamSibuk = a.getJamSibuk()+b.getJamSibuk()+c.getJamSibuk()+d.getJamSibuk()+e.getJamSibuk()+f.getJamSibuk();
        System.out.println("Total jam sibuk elemen Fasilkom adalah "+ totalJamSibuk);

    }
}
