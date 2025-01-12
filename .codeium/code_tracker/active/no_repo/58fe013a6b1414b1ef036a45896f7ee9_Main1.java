
5c:\Users\ASUS\Alifa Izzatunnisa\JavaLanjut\Main1.javaÃ
// File: Main.java

public class Main1 {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa dengan constructor default
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("John Doe");
        mahasiswa1.setNim("123456");
        mahasiswa1.setIpk(3.5);

        // Membuat objek Mahasiswa dengan constructor 2
        Mahasiswa mahasiswa2 = new Mahasiswa("Jane Doe", "654321");
        mahasiswa2.setIpk(3.8);

        // Membuat objek Mahasiswa dengan constructor 3
        Mahasiswa mahasiswa3 = new Mahasiswa("Bob Smith", "789012", 3.2);

        // Menampilkan data mahasiswa
        System.out.println("Mahasiswa 1:");
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("NIM: " + mahasiswa1.getNim());
        System.out.println("IPK: " + mahasiswa1.getIpk());

        System.out.println("\nMahasiswa 2:");
        System.out.println("Nama: " + mahasiswa2.getNama());
        System.out.println("NIM: " + mahasiswa2.getNim());
        System.out.println("IPK: " + mahasiswa2.getIpk());

        System.out.println("\nMahasiswa 3:");
        System.out.println("Nama: " + mahasiswa3.getNama());
        System.out.println("NIM: " + mahasiswa3.getNim());
        System.out.println("IPK: " + mahasiswa3.getIpk());
    }
}Ã
