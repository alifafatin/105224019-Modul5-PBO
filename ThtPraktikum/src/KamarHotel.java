public class KamarHotel {
   //atribut krusial 
   private String nomorKamar;
   private String tipeKamar;
   private int kapasitasMaksimal;
   private double hargaPerMalam;
   private boolean isTersedia;

// Constructor pertama digunakan untuk pendaftaran kilat yang hanya menerima
//parameter nomorKamar, tipeKamar, dan kapasitasMaksimal
// lalu sistem akan otomatis mengatur
//harga menjadi 0 dan status isTersedia menjadi true. 
public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal){
   this.nomorKamar = nomorKamar;
   this.tipeKamar = tipeKamar;
   this.kapasitasMaksimal = kapasitasMaksimal;
   this.hargaPerMalam = 0;
   this.isTersedia = true;
 }

//Constructor kedua melayani pendaftaran
//lengkap dengan menerima keempat parameter utama (nomor, tipe, kapasitas, dan harga), dengan
//status ketersediaan yang juga langsung diatur true secara bawaan.

public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam){
   this.nomorKamar = nomorKamar;
   this.tipeKamar = tipeKamar;
   this.kapasitasMaksimal = kapasitasMaksimal;
   this.hargaPerMalam = hargaPerMalam;
   this.isTersedia = true;
 }

 //getter untuk setiap atribut
 public String getNomorKamar() {
        return nomorKamar;
    }

 public String getTipeKamar() {
        return tipeKamar;
    }

 public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

 public double getHargaPerMalam() {
        return hargaPerMalam;
    }

 public boolean isTersedia() {
        return isTersedia;
    }

 //setter yg memerlukan validasi bisnis yang sangat ketat
 public void setTipeKamar(String tipeKamar){
   if(tipeKamar.equalsIgnoreCase("Reguler") || tipeKamar.equalsIgnoreCase("Premium") || tipeKamar.equalsIgnoreCase("Suite")){
      this.tipeKamar = tipeKamar;
   } else {
      System.out.println("peringatan: tipe kamar" + tipeKamar + "tidak valid. maka tipe akmar akan dipaksanakan menjaid reguler");
      this.tipeKamar = "Reguler";
   }
 }

 public void setKapasitasMaksimal(int kapasitasMaksimal) {
        this.kapasitasMaksimal = kapasitasMaksimal;
    }

public void setHargaPerMalam(double hargaPerMalam){
   if (hargaPerMalam < 50000){
      System.out.println("peringatan: harga per malam tidak boleh kurang dari 50000. maka harga per malam akan dipaksakan menjadi 50000");
      this.hargaPerMalam = 50000;
   } else {
      this.hargaPerMalam = hargaPerMalam;
   }
}

  public void setIsTersedia(boolean isTersedia) {
        this.isTersedia = isTersedia;
    }

//method overloading pesan kamar
public void pesanKamar(){
   if(isTersedia){
      isTersedia = false;
      System.out.println("Kamar " + nomorKamar + " berhasil dipesan.");
        } else {
         System.out.println("peringatan: Kamar " + nomorKamar + " sudah terisi!");  
   }
}


public void pesanKamar (int jumlahTamu){
   if(!isTersedia){
      System.out.println("peringatan: Kamar " + nomorKamar + " sudah terisi!");
   } else if (jumlahTamu > kapasitasMaksimal){
      System.out.println("peringatan: jumlah tamu" + jumlahTamu + "melebihi kapasitas maksimal kamar " + nomorKamar + "!");
   } else {
      isTersedia = false;
      System.out.println("Kamar " + nomorKamar + " berhasil dipesan untuk " + jumlahTamu + " tamu.");
   }
}

public void batalkanPesanan(){
   isTersedia = true;
   System.out.println("Pesanan untuk kamar " + nomorKamar + " telah dibatalkan.");
}

//methode overloading untuk sistem penagihan

public double hitungTotalBayar(int jumlahMalam){
   return hargaPerMalam * jumlahMalam;
}

public double hitungTotalBayar(int jumlahMalam, String kodeVoucher){
   double total = hargaPerMalam * jumlahMalam;
   if (kodeVoucher.equalsIgnoreCase("PROMO") && jumlahMalam >= 3) {
            double diskon = total * 0.20;
            System.out.println("Voucher P R O M O berhasil! Diskon 20% = Rp" + diskon);
            return total - diskon;
        } else {
            System.out.println("Kode voucher tidak valid atau tidak memenuhi syarat untuk diskon.");
         }
         return total;
}

//tampilan

  public void tampilkanProfilKamar() {
        System.out.println("==============================");
        System.out.println(" kamar hotel profile ");
        System.out.println("==============================");
        System.out.println("No Kamar  : " + nomorKamar);
        System.out.println("Tipe Kamar   : " + tipeKamar);
        System.out.println("kapasitas    : " + kapasitasMaksimal + " orang");
        System.out.println("harga per malam : Rp" + hargaPerMalam);
        System.out.println("Status: " + (isTersedia ? "Tersedia" : "Sudah Dipesan"));
        System.out.println("==============================");
    } 

}
