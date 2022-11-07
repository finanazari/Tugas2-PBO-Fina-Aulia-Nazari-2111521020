public class Asdos extends Mahasiswa{
    private int JamNgasdos;
    
    public Asdos(String nama, int sks, int JamNgasdos) {
        super(nama, sks); //downcasting
        jamsibuk = jamsibuk + JamNgasdos ;
        
    }
 
    public int getJamSibuk(){ //polymorphism
        return jamsibuk;
    }

    public void mailCheck(){
        System.out.println(getnama() + " adalah seorang asdos dengan jam sibuk " + getJamSibuk() );
    }
}
