public class Dosen extends Elemen{
    private int JumlahHariKerja;

    public Dosen (String nama, int JumlahHariKerja){
        super(nama); //downcasting
        jamsibuk = JumlahHariKerja * 8;
        
    } 
    public void mailCheck(){
        System.out.println(getnama() + " adalah seorang dosen dengan jam sibuk " + getJamSibuk() );
    }

    public int getJamSibuk(){ //polymorphism
        return jamsibuk;
    }
    
}
