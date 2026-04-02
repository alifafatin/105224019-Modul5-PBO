public class App {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.nama = "Anton"; // Berhasil karena public
        
        // mhs.nim = "12345"; // Tetap Error (Sesuai konsep private)

        System.out.println(mhs.nama);
        
        mhs.setNim("12345"); // Mengisi lewat jalur resmi
        System.out.println(mhs.getNim()); // Membaca lewat jalur resmi

        // PERBAIKAN: Gunakan getter, jangan panggil mhs.namaOr langsung
        mhs.setNamaOr("Budi"); 
        System.out.println(mhs.getNamaOr()); 
    }
}