package Modul5.posttestt;

public class Main {
    public static void main(String[] args) {

        Barang barangs = new Barang("ID019", "Handphone");

        System.out.println("== Gudang Elektronik ==");

        barangs.setHargaSatuan(-5000000); 
        barangs.setHargaSatuan(0);        
        barangs.kurangStok(10);          
        barangs.tambahStok(-10); 

        System.out.println("=== Data yang Benar ===");
        barangs.setKategoriBarang("Elektronik");
        barangs.setHargaSatuan(5000000);
        barangs.tambahStok(10);
        barangs.kurangStok(999); 
        barangs.kurangStok(3);
        barangs.detailBarang();
    }
}
