# TUGAS
1. [Tugas1 / T1Job8_08.java](#T1Job8_08.java)

# Percobaan
1. [Percobaan 1](#percobaan-1)
- [Pertanyaan](#pertanyaan)
    * [Jawaban](#jawaban)
2. [Percobaan 2](#percobaan-2)
- [Pertanyaan](#pertanyaan-1)
    * [Jawaban](#jawaban-1)
3. [Percobaan 3](#percobaan-3)
- [Pertanyaan](#pertanyaan-2)
    * [Jawaban](#jawaban-2)
4. [Percobaan 4](#percobaan-4)


## Percobaan 1
[Star08.java](/Star08.java)
### Pertanyaan
1. Jika  pada  perulangan  for,  inisialisasi  i=1  diubah  menjadi  i=0,  apa  yang  akibatnya? 
Mengapa bisa demikian? 
2. Jika pada perulangan for, kondisi i <= N diubah menjadi i > N, apa akibatnya? Mengapa 
bisa demikian?  
3. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa 
bisa demikian?

### Jawaban
1. -Bintang yang di-output akan melebihi satu dari yang di-assign oleh input user, hal ini terjadi karena gabungan 2 hal, yaitu kondisi yang menggunakan <= (Kurang dari atau sama dengan), dan diubahnya angka awal inisialisasi yang dimulai dari 0.\
-Karena kondisi true yang di-cek adalah <=, maka perhitungan akan berhenti pada value var.* i yang sama dengan var. N, dan karena perhitungan dimulai dari value 0 sebagai urutan angka pertama daripada value 1 sebagai urutan pertama.\
-Seperti contoh, saat kita meng-assign 5 pada var. N, jika var. i dimulai dari 0,  maka total urutan angka adalah (0, 1, 2 ,3 ,4 ,5) dengan total 6 angka berurutan yang membuat program akan meng-output 6 kali dibandingkan jika dimulai dari angka 1 yang akan meng-output 5 kali, sesuai dengan assignment pada var. N.\
\
-Tetapi, jika var. i di-inisialisasi dengan 0, bisa di-mitigasi dengan mengubah operator perbandingan pada pengecekan kondisi dari (<=) menjadi (<).\
-Semisal kita assign value 5 pada var. N, berdasarkan kondisi yang ada, urutan angka dimulai dari 0 dan berhenti di angka 4, secara efektif menghasilkan 5 urutan angka yang menjadi jumlah perulangan dilakukan (0, 1, 2, 3, 4).\
*1 (var. =  variabel)

2. -Program perulangan tidak akan terjadi, karena var. i di-inisialisasi value 1, dan kita meng-assign value positif apapun pada var. N, kondisi true tidak akan tercapai karena value var. i tidak akan lebih besar daripada bilangan asli apapun.\
-Itu semua terjadi jika kita meng-input atau meng-assign nilai positif pada var. N. jika kita assign nilai yang akan menghasilkan true pada kondisi (cth. 1 > 0, 1 > -1.), perulangan akan dilakukan secara tidak terbatas.\
-Hal ini bisa terjadi karena kita meng-assign var. N yang tidak berubah, tetapi update masih merubah nilai var. i,  yang jika kita masukkan kondisi yang true seperti 1 > 0, perulangan akan dijalankan dan akan ada update i++ yang menjadi 2 > 0 (i>N), lalu 3 > 0, dan seterusnya.\
-Karena kondisi dan update kita pada dasarnya tidak memungkinkan perulangan menghasilkan kondisi false, update-nya menambah nilai var. i, kondisi berhenti jika i lebih rendah pada var. N, yang kita atur lebih rendah daripada var. i. mengulang terus-menerus hingga tak hingga. 

3. Mirip seperti pada jawaban sebelumnya, perulangan akan terus-menerus dilakukan untuk setiap nilai positif var. N, karena update terjadi pada var. i yang nilainya terus menurun dan secara otomatis akan selalu lebih rendah daripada kondisi i<=N yang menghasilkan true secara terus menerus dengan update i-- dengan asumsi inisialisasi var. i=1, dan assignment var. N=1 atau lebih besar (setiap bilangan positif).

<!-- prev answer: referring to the previous answer, it will loop for every positive number of var. N, becuase the update is for var. i. which, since it will get lower and lower, it will always fullfill the i<=N condition, assuming the initialization was i=1. (w.i.p answer) -->


## Percobaan 2
[Square08.java](/Square08.java)
### Pertanyaan
1. Perhatikan perulangan luar. Jika pada sintaks **for**, inisialisasi `iOuter=1` diubah menjadi `iOuter=0`, apa yang akibatnya? Mengapa bisa demikian?  
2. Kembalikan program semula dimana inisialisasi **iOuter=1.** Kemudian perhatikan perulangan dalam, Jika pada sintaks **for**, inisialisasi `i=1` diubah menjadi `i=0`, apa yang akibatnya? Mengapa bisa demikian?  
3. Jadi,  apakah  perbedaan  kegunaan  antara  perulangan  luar  dengan  perulangan  yang 
berada didalamnya?  
4. Mengapa perlu ditambahkan sintaks `System.out.println();` di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan? 
5. Silakan commit dan push ke repository Anda.

### Jawaban
1. Jumlah bintang pada tiap baris tetap mengikuti var. N, tetapi jumlah baris yang ada melebihi satu dari nilai N. Mirip seperti pertanyaan pertama pada percobaan sebelumnya, hal ini terjadi karena inisialisasi nilai 0 dan kondisi yang menggunakan <=, yang membuat total urutan angka sebanyak satu lebih banyak daripada nilai yang kita assign pada var. N. yang membuat kode yang ada didalamnya dijalankan satu kali lebih banyak. tetapi, hal ini tidak mengefek jumlah bintang yang di-output dalam satu baris, karena perulangan luar ini mengeksekusi 2 hal, yaitu menjalankan inner loop, dan mencetak baris baru. mengoutput hasil inner loop dan mencetak baris baru satu kali lebih banyak.

2. Jumlah bintang per baris bertambah satu, mirip dengan pertanyaan pertama dari percobaan sebelumnya. Dengan alasan mengatur i=0, menggeser posisi inisial perhitungan urutan satu perulangan lebih banyak karena kondisi yang dicari adalah <=N.

3. Perulangan luar digunakan untuk mengatur jumlah baris dan di dalamnya terdapat perulangan dalam yang mengatur jumlah isi tiap barisnya.

4. `System.out.println();` setelah perulangan dalam di dalam perulangan luar berarti saat perulangan luar dijalankan, perulangan dalam dijalankan yang mencetak bintang sesuai N, setelah perulangan dalam selesai `System.out.println();` mencetak baris kosong baru sebelum perulangan luar melakukan update dan mengecek kondisi sebelum melakukan perulangan lagi atau berhenti.


## Percobaan 3
[Triangle08.java](/Triangle08.java)\
(Cek commit history karena ada update pada file untuk menjawab pertanyaan percobaan 3)

### Pertanyaan
1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan  tampilan berikut? 
```
*
**
***
****
*****
```
2. Jika  tidak  sesuai,  bagian  mana  saja  yang  harus  diperbaiki/ditambahkan?  Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan.  
3. Silakan commit dan push ke repository Anda. 

### Jawaban

Tidak sama, output yang dihasilkan adalah semua bintang ter-output tetapi dalam satu line/baris yang sama. Cara membenarkannya adalah dengan cara menambahkan `System.out.println();` pada baris ke-10 atau sesudah perulangan dalam, jadi setelah perulangan dalam selesai melakukan bagiannya, sebelum outer loop di-update dan melakukan perulangan yang aakan mengeksekusi perulangan dalam lagi, akan meng-output line kosong sebelum outer loop selesai dan mengeksekusi loop yang memiliki loop dalamnya lagi.

<!-- prev answer: add sout after line 10 
basically its sout after the inner loop so it prints a new line after every inner loop before updating the outer loop executing the loop again. -->


## Percobaan 4
[RataNilai08.java](/RataNilai08.java)
