public class main {
    public static void main(String[] args) {
        System.out.println("Selamat datang di Hotel Java! (Simulasi)");

        //kamar pertama, uji ketahanan Setter dengan mencoba memasukkan tipe kamar "Presidential" dan
        //harga "-10000"; pastikan sistem Anda langsung memaksanya menjadi "Reguler" dan "50000".

        System.out.println("==uji coba kamar 1==");
        KamarHotel kamar1 = new KamarHotel("100", "Presidential", 3 );
        System.out.println("==uji coba kamar 1 dengan harga -10000==");
        kamar1.setHargaPerMalam(-10000);

        //Pada kamar kedua yang dibuat dengan kapasitas maksimal 2 orang, lakukan percobaan
        //pemesanan menggunakan metode pesanKamar(4) dan pastikan sistem memblokirnya secara
        //otomatis karena overcapacit
        //. Setelah itu, pesan kamar tersebut dengan jumlah tamu yang sesuai
         //(misalnya 2 orang) hingga sistem menyatakan berhasil. Cobalah lakukan pemesanan lagi tanpa
         //parameter pesanKamar() pada kamar yang sama untuk melihat peringatan bahwa kamar tersebut
         //sudah dipesan.
         System.out.println("==uji coba kamar 2==");
         KamarHotel kamar2 = new KamarHotel ("200", "Premium", 2, 150000);
         System.out.println("==uji coba pesan kamar 2 dengan kapasitas 4 orang==");
         kamar2.pesanKamar(4); //ini harusnya kan di tolak 
         System.out.println("==uji coba pesan kamar 2 dengan kapasitas 2 orang==");
         kamar2.pesanKamar(2); //ini harusnya kan di terima ea ea 
         System.out.println("==uji coba pesan kamar 2 dengan kapasitas 2 orang==");
         kamar2.pesanKamar(2); //ini harusnya kan di terima ea ea 
         
         // Demonstrasikan juga perhitungan tagihan pada kamar pertama untuk 2 malam
         //menggunakan voucher "PROMO" yang mana harus gagal mendapat diskon karena kurang dari 3
         //malam, lalu hitung tagihan kamar kedua untuk 4 malam dengan voucher "PROMO" yang mana
         //harus berhasil dipotong diskon 20%. Akhiri simulasi dengan mencetak "Struk Informasi" yang
         //rapi ke layar, menampilkan seluruh kondisi akhir atribut dari kedua objek kamar tersebut.

        System.out.println("== tagihan kamar 1 untuk 2 malam dengan voucher PROMO==");
        double totalBayarKamar1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total bayar kamar 1: Rp" + totalBayarKamar1);

        System.out.println("== tagihan kamar 2 untuk 4 malam dengan voucher PROMO==");
        double totalBayarKamar2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total bayar kamar 2: Rp" + totalBayarKamar2);

        System.out.println("===================");
        System.out.println("Struk Informasi");
        System.out.println("===================");
        kamar1.tampilkanProfilKamar();
        System.out.println();
        kamar2.tampilkanProfilKamar();
    }
}
