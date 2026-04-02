public class Rekening {
    // 1. Atribut private (Sudah Benar)
    private String nomorRekening;
    private int saldo;

    // 2. Konstruktor (Nama disamakan dengan kelas)
    public Rekening(String nomorRekening, int saldo) {
        this.nomorRekening = nomorRekening;
        // Memanggil setter agar validasi "tidak boleh negatif" juga berlaku saat objek dibuat
        setSaldo(saldo); 
    }

    // 3. Getter (Sudah Benar)
    public int getSaldo() {
        return this.saldo;
    }

    // 4. Setter dengan Penjaga Keamanan (Sudah Benar)
    public void setSaldo(int saldoBaru) {
        if (saldoBaru < 0) { 
            System.out.println("Error: Saldo tidak boleh negatif!"); 
        } else {
            this.saldo = saldoBaru; 
            System.out.println("Saldo berhasil diupdate menjadi: " + this.saldo);
        }
    }
}