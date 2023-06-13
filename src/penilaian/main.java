package penilaian;


public class main {
    public static void main(String[] args) {
        NilaiAkhir argo = new NilaiAkhir("Argo Ade Prasetyo","2110010472",80,75,85);
        
        
        System.out.println("Nama Mahasiswa: "+argo.getNama());
        System.out.println("NPM Mahasiswa: "+argo.getNpm());
        System.out.println("Nilai Akhir: "+argo.hitungNilaiAkhir());
    }
}
