import java.util.Scanner;

public class DosenDemo10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen10 data = new DataDosen10();
        
        do {
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("5. Cari Nama (Sequential)");
            System.out.println("6. Cari Usia (Binary Search)");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    input.nextLine(); 
                    System.out.print("Masukkan kode: ");
                    String kode = input.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama = input.nextLine();
                    boolean jk;
                    while (true) {
                        System.out.print("Masukkan jenis kelamin (L/P): ");
                        String inputJK = input.nextLine().toUpperCase();
                        if (inputJK.equals("L")) {
                            jk = true;
                            break;
                        } else if (inputJK.equals("P")) {
                            jk = false;
                            break;
                        } else {
                            System.out.println("Input tidak valid, ulangi!");
                        }
                    }
                    System.out.print("Masukkan usia: ");
                    int usia = input.nextInt();
                    data.tambah(new Dosen10(kode, nama, jk, usia));
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Data diurutkan secara ASC!");
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data diurutkan secara DSC!");
                    break;
                case 5:
                    input.nextLine();
                    System.out.print("Masukkan nama yang dicari: ");
                    String cariNama = input.nextLine();
                    data.pencarianDataSequential(cariNama);
                    break;
                case 6:
                    System.out.print("Masukkan usia yang dicari: ");
                    int cariUsia = input.nextInt();
                    data.pencarianDataBinary(cariUsia);
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, Ulangi!");
            }
        } while (true);
    }
}