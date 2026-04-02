package Modul5.Latihan.LatihanPraktikum;

public class Main {
    public static void main(String[] args) {
    //nomor 4
       Karyawan karyawan1 = new Karyawan("K00001", "Anton Tralala");

       karyawan1.setDepartemen("IT Ceunah");

       System.out.println("=== Test Gaji Minus ===");
       karyawan1.setGajiPokok(-100000000);

       System.out.println("== test Gaji no Minus ===");
       karyawan1.setGajiPokok(10000000);

       karyawan1.tampilkanDataKaryawan();
    }
}
