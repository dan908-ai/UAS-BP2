package aplikasifrozenfood1;
public class FrozenFood {
    private String nama;
    private int expired;
    private int stock;
    private int harga;

FrozenFood(){

}
FrozenFood(String n, int e, int s, int h){ 
      nama=n; expired=e; harga=h; stock=s;
      System.out.println("Objek " +nama+ " dibuat..");
}
//setter
    void setNama(String s){nama=s;}
    void setExpired(int s){expired=s;}
    void setHarga(int s) {harga=s;}
    void setStock(int s){ stock=s;}

//getter
   String getNama(){return nama;}
   int getExpired(){return expired;}
   int getHarga (){ return harga;}
   int getStock(){return stock;}

   //ToString
    String ToString() {
            return nama+" ["+harga+"] ["+stock+"]["+expired; 
    }
 
    




}

