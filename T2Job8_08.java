import java.util.Scanner;
public class T2Job8_08 { // Tugas no.2 : Porseni
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String poltek, askLanjut;

    String cab1At1="", cab1At2="", cab1At3="", cab1At4="", cab1At5="";
    String cab2At1="", cab2At2="", cab2At3="", cab2At4="", cab2At5="";
    String cab3At1="", cab3At2="", cab3At3="", cab3At4="", cab3At5="";
    String cab4At1="", cab4At2="", cab4At3="", cab4At4="", cab4At5="";
        
    do {
      System.out.println("\n==========================================");
      System.out.println("      PENDAFTARAN ATLET PORSENI 2024");
      System.out.println("==========================================");

      
      System.out.print("\nNama Politeknik : "); poltek=sc.nextLine(); System.out.println();

      System.out.println("--- Cabang Olahraga 1 : Badminton ---");
      for (int i=1; i<=5; i++) {
        System.out.print("Nama Atlet ke-"+i+": ");
        switch (i) {
          case 1:
            cab1At1=sc.nextLine();
            break;
          case 2:
            cab1At2=sc.nextLine();
            break;
          case 3:
            cab1At3=sc.nextLine();
            break;
          case 4:
            cab1At4=sc.nextLine();
            break;
          case 5:
            cab1At5=sc.nextLine();
            break;
        }
      }


      System.out.println("--- Cabang Olahraga 2 : Tenis Meja ---");
      for (int i=1; i<=5; i++) {
        System.out.print("Nama Atlet ke-"+i+": ");
        switch (i) {
          case 1:
            cab2At1=sc.nextLine();
            break;
          case 2:
            cab2At2=sc.nextLine();
            break;
          case 3:
            cab2At3=sc.nextLine();
            break;
          case 4:
            cab2At4=sc.nextLine();
            break;
          case 5:
            cab2At5=sc.nextLine();
            break;
        }
      }


      System.out.println("--- Cabang Olahraga 3 : Basket ---");
      for (int i=1; i<=5; i++) {
        System.out.print("Nama Atlet ke-"+i+": ");
        switch (i) {
          case 1:
            cab3At1=sc.nextLine();
            break;
          case 2:
            cab3At2=sc.nextLine();
            break;
          case 3:
            cab3At3=sc.nextLine();
            break;
          case 4:
            cab3At4=sc.nextLine();
            break;
          case 5:
            cab3At5=sc.nextLine();
            break;
        }
      }


      System.out.println("--- Cabang Olahraga 4 : Bola Voli ---");
      for (int i=1; i<=5; i++) {
        System.out.print("Nama Atlet ke-"+i+": ");
        switch (i) {
          case 1:
            cab4At1=sc.nextLine();
            break;
          case 2:
            cab4At2=sc.nextLine();
            break;
          case 3:
            cab4At3=sc.nextLine();
            break;
          case 4:
            cab4At4=sc.nextLine();
            break;
          case 5:
            cab4At5=sc.nextLine();
            break;
        }
      }


      System.out.println("\n=========================================");
      System.out.println("        DATA ATLET YANG TERDAFTAR");
      System.out.println("=========================================");

      System.out.println("\nPoliteknik Asal : "+poltek);

      System.out.println("\n--- Atlet Badminton ---");
      System.out.println("1. "+cab1At1);
      System.out.println("2. "+cab1At2);
      System.out.println("3. "+cab1At3);
      System.out.println("4. "+cab1At4);
      System.out.println("5. "+cab1At5);

      System.out.println("\n--- Atlet Tenis Meja ---");
      System.out.println("1. "+cab2At1);
      System.out.println("2. "+cab2At2);
      System.out.println("3. "+cab2At3);
      System.out.println("4. "+cab2At4);
      System.out.println("5. "+cab2At5);

      System.out.println("\n--- Atlet Basket ---");
      System.out.println("1. "+cab3At1);
      System.out.println("2. "+cab3At2);
      System.out.println("3. "+cab3At3);
      System.out.println("4. "+cab3At4);
      System.out.println("5. "+cab3At5);


      System.out.println("\n--- Atlet Bola Voli ---");
      System.out.println("1. "+cab4At1);
      System.out.println("2. "+cab4At2);
      System.out.println("3. "+cab4At3);
      System.out.println("4. "+cab4At4);
      System.out.println("5. "+cab4At5+"\n");

      System.out.print("Apakah anda ingin memasukkan data untuk Politeknik lain ? (ya/tidak) : "); askLanjut=sc.nextLine();

    } while (askLanjut.equalsIgnoreCase("ya"));

    System.out.println("\nProgram telah berhenti, Terima Kasih!\n");

    sc.close();
  }
}




// Tahun 2024 Politeknik Negeri Malang menjadi host
// event nasional Porseni, ada beberapa cabang olahraga
// yang dipertandingkan seperti badminton, tenis meja,
// basket, dan bola voly. Setiap cabor mengirimkan
// 5 atlet terbaiknya dari seluruh politeknik
// seluruh Indonesia untuk mengikuti kegiatan
// 2 tahunan tersebut. Buatlah program untuk memasukkan
// dan menampilkan informasi nama atlet masing-masing
// cabor sejumlah Politeknik yang mendaftar.