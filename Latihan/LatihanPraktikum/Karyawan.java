package Modul5.Latihan.LatihanPraktikum;

public class Karyawan {
    //nomor 1
    private String idKaryawan;
    private String namaKaryawan;
    
    //nomor 2
    private double gajiPokok;

    //nomor3
    private String departemen;

//nomor 1 untuk konstruktor
public Karyawan(String idKaryawan, String namaKaryawan) {
    this.idKaryawan = idKaryawan;
    this.namaKaryawan = namaKaryawan;
}

//nomor 1
public String getIdKaryawan() {
    return idKaryawan;
}

public String getNamaKaryawan() {
    return namaKaryawan;
}

//nomor 2
public double getGajiPokok() {
    return gajiPokok;
}
//nomor 1 dan 2 dan 3 untuk setter
public void setIdKaryawan(String idKaryawan) {
    this.idKaryawan = idKaryawan;
}

public void setNamaKaryawan(String namaKaryawan) {
    this.namaKaryawan = namaKaryawan;
}
public void setGajiPokok(double gajiPokok) {
    if (gajiPokok < 0){
        System.out.println("Eror! gaji tak boleh negatif");
    } else {
        this.gajiPokok = gajiPokok;
    }
}

public void setDepartemen(String departemen) {
    this.departemen = departemen;
}

//nomor3
public String getDepartemen() {
    return departemen;
}

//setter
public void tampilkanDataKaryawan(){
    System.out.println("ID Karyawan: " + idKaryawan);
    System.out.println("Nama Karyawan: " + namaKaryawan);
    System.out.println("Gaji Pokok: " + gajiPokok);
    System.out.println("Departemen: " + departemen);

    }

}