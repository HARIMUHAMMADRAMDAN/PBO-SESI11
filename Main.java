public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan ("C:\\Users\\Anonymous\\Documents\\PERKULIAHAN\\SEMESTER 4\\Pemograman Berorietasi Objek\\SESI 11\\data_buku.txt");

        Buku buku1 = new Buku ("Pemrogramman Java", "Pengarang 1", false);
        Buku buku2 = new Buku ("Pemrogramman PHP","Pengarang 11", true);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        System.out.println("Daftar Buku Perpustakaan: ");
        perpustakaan.lihatBuku();
    }
}
