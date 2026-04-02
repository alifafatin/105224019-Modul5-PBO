public class Mahasiswa {
    public String nama;
    private String nim;
    private String namaOr;

    // Getter untuk NIM (S-nya harus Kapital)
    public String getNim() { 
        return nim;
    }

    public void setNim(String nimBaru) {
        this.nim = nimBaru;
    }

    // TAMBAHKAN INI: Agar namaOr bisa diakses dari luar
    public String getNamaOr() {
        return namaOr;
    }
    
    public void setNamaOr(String nama) {
        this.namaOr = nama;
    }
}