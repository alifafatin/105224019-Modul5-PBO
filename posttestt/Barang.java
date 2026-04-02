package Modul5.posttestt;

public class Barang {
//class Barang
    private String idBarang;
    private String namaBarangs;
    private int stok;
    private double hargaSatuan;
    private String kategoriBarang;

//constructor
   public Barang(String idBarang, String namaBarangs) {
    this.idBarang = idBarang;
    this.namaBarangs = namaBarangs;
    this.stok = 0;
    this.hargaSatuan = 0;
    this.kategoriBarang = "Belum Dikategorikan";
}

//getter 
    public String getIdBarang(){
        return idBarang;
    }

    public String getNamaBarangs() {
        return namaBarangs;
    }

    public String getKategoriBarang() {
        return kategoriBarang;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public int getStok() {
        return stok;
    }

//setter
    public void setIdBarang(String idBarang){
        this.idBarang = idBarang;
    }

    public void setNamaBarangs(String namaBarangs) {
        this.namaBarangs = namaBarangs;
    }

    public void setKategoriBarang(String kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }

    public void setHargaSatuan(double hargaSatuan) {
    if (hargaSatuan > 0){
        this.hargaSatuan = hargaSatuan;
       } else {
        System.out.println("Harga satuan tidak boleh diset kurang dari atau sama dengan nol");
       } 
    }

    public void setStok(int stok) {
       if (stok >= 0){
        this.stok = stok;
       } else {
        System.out.println("Stok tidak mungkin negatif");
       }
    }

    public void tambahStok (int jumlahStok){
        if (jumlahStok > 0){
            this.stok += jumlahStok;
            System.out.println("Stok berhasil ditambahkan! "+ jumlahStok + "Stok sekarang");
        } else {
            System.out.println("Jumlah stok yang ditambahkan harus lebih dari nol");
        }
    }

    public void kurangStok (int jumlahStok){
        if (jumlahStok > 0) {
            if (this.stok >= jumlahStok){
                this.stok -= jumlahStok;
                System.out.println("Stok berhasil dikurangi! " + jumlahStok + " Stok sekarang");
            } else {
                System.out.println("eror: Stok digudang tidak cukup");
            }
        } else {
            System.out.println("jumlah stok yang dikurangi harus lebih dari nol");
        }
    }

    public void detailBarang(){
        System.out.println("=== detail barang ===");
        System.out.println("ID barang: " + idBarang);
        System.out.println("Nama barang: " + namaBarangs);
        System.out.println("Kategori barang: " + kategoriBarang);
        System.out.println("Harga satuan: " + hargaSatuan);
        System.out.println("Stok: " + stok);
        System.out.println("=============================");
    }
}
