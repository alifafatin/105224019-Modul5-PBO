public class Main {
    public static void main(String[] args) {
        Rekening akun = new Rekening("12345", 50000); // Berhasil
        
        System.out.println("Saldo saat ini: " + akun.getSaldo());
        
        akun.setSaldo(-1000); // Akan muncul pesan Error
        System.out.println("Saldo setelah coba diisi negatif: " + akun.getSaldo()); // Tetap 50000
    }
}