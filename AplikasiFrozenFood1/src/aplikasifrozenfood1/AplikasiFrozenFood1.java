package aplikasifrozenfood1;
import java.util.Scanner;

public class AplikasiFrozenFood1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       FrozenFood nugget = new FrozenFood();
       int pilih=0,pilih2=0;
       
       do{
            System.out.println("\nAplikasi Frozen Food");
            System.out.println("1. Master Barang");
            System.out.println("2. Transaksi Penjualan");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih=sc.nextInt();
            do{
            switch (pilih){
                case 1:
                    System.out.println("1. Tambah Barang");
                    System.out.println("2. Ubah Barang");
                    System.out.println("3. Hapus Barang");
                    System.out.println("4. Lihat Barang");
                    System.out.println("5. Kembali ke Menu Utama");
                    System.out.print("Pilih : ");
                    pilih2 = sc.nextInt();
                   
                    switch (pilih2){
                        case 1:
                            
                    System.out.print("Nama Menu = ");
                    String nm=sc.next();
                    System.out.print("Harga = ");
                    int h=sc.nextInt();
                    System.out.print("Expired = ");
                    String e=sc.next();        
                    System.out.println("Stock = ");
                    int s=sc.nextInt();
                    System.out.println("Produk Berhasil Ditambahkan !");                            
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                    }
                case 2:
                    

                case 3:
                case 4:
                case 5:

                    
            }}while(pilih2!=5);
            
        }while(pilih!=3);
    
    
}
}