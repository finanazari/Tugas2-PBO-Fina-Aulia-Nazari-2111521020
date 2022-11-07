public class Mahasiswa extends Elemen{
    private int sks;
    public int jamsibuk;
    

    public Mahasiswa (String nama, int sks){
        super(nama); //downcasting
        jamsibuk = sks*3;
    }
    public void mailCheck(){
        System.out.println (getnama() + " adalah seorang mahasiswa dengan jam sibuk " + getJamSibuk()+ " " );
    }
 
    public int getJamSibuk(){ //polymorphism
     return jamsibuk;
    }


}
