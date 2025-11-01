import java.util.Scanner;
public class T1Job8_08 { //Tugas 1 : Number Rectangles
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, j, k, N;
    do {        
        System.out.print("Input N : "); N=sc.nextInt();
            if (N<3) {
                System.out.println("Can't input lower than 3!");        
                continue;
            } else {
                break;
            }
    } while (true);

    for (i=1; i<=N; i++) { // line counter
        if (i==1 || i==N) { // prints the N thingy for the top most and bottom most layer..
            for (j=1; j<=N; j++) {
                System.out.print(N);
                System.out.print(" ");
            }
            System.out.println();
        } else { // print the N number and giving it space for N-related times before printing another N
            for (j=(N-2); j<N; j++) {
                System.out.print(N);
                if (N<10) { // for 1 digit numbers
                    for (k=1; k<((N*2)-2); k++) {
                        System.out.print(" ");
                    }
                } else if (N<100) { // for 2 digit numbers
                    for (k=1; k<((N*3)-4); k++) {
                        System.out.print(" ");
                    }
                } else { // for 3 digit numbers
                    for (k=1; k<((N*4)-6); k++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    sc.close();
  }
}


// Buatlah  program  untuk  mencetak  tampilan
// persegi  angka  seperti  di  bawah  ini
// berdasarkan input N (nilai N minimal 3)
// Contoh N = 3, dan N = 5

//  5 5 5 5 5
//  5       5
//  5       5  3 3 3
//  5       5  3   3
//  5 5 5 5 5  3 3 3