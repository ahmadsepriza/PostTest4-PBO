# PostTest4-PBO

Jadi di program ini kita diminta buat nambahin konsep Abstraction sama Polymorphism.

1. Abstraction
Abstraction ini intinya kayak bikin kerangka umum aja tanpa detail. Nah di sini aku bikin abstract class TempatWisata. Isinya ada method abstract kayak info(), yang belum ada isi kodenya. Jadi nanti setiap anak class kayak WisataAlam, WisataBudaya, atau WisataKuliner wajib bikin sendiri versi info() mereka. Dengan cara ini, tiap jenis wisata bisa punya cara tampil yang beda, tapi tetep nurut sama kerangka dasarnya.

2. Polymorphism
Polymorphism ini ada dua jenis yang aku pake:

    -Overriding
     Ini kejadian waktu class anak bikin ulang method dari class induknya. Contohnya di WisataAlam aku override method info() biar tampilinnya khas wisata alam, bukan umum lagi.

    -Overloading
     Kalau ini namanya methodnya sama, tapi parameternya beda. Misalnya aku bikin method cariWisata() ada yang cuma butuh nama, ada juga yang butuh nama + lokasi. Jadi fleksibel, tinggal dipanggil sesuai kebutuhan.

4. Nilai Tambah (Abstract class + Interface bareng)
Biar lebih mantap, aku juga pake interface. Contohnya aku bikin interface Promo buat ngatur diskon. Nah, class WisataKuliner bisa implement interface ini biar bisa ngitung diskon harga makanan. Jadi di satu program ada kombinasi abstract class sama interface.

5. Package
<img width="315" height="251" alt="image" src="https://github.com/user-attachments/assets/9b70d858-255a-487e-8c93-04960a717889" />

# Output Program

1. Tambah Tempat Wisata di dalam program
<img width="355" height="316" alt="image" src="https://github.com/user-attachments/assets/bd6c809e-3386-43b3-801d-8d50991a8c74" />

2. Menampilkan daftar tempat wisata
<img width="708" height="194" alt="image" src="https://github.com/user-attachments/assets/1960e84c-0d64-4d6a-ae2c-1a27ababc019" />

3. Update tempat wisata
<img width="506" height="276" alt="image" src="https://github.com/user-attachments/assets/4192a8e6-6b44-40d3-88f3-bf7d5b813ceb" />

4. Menghapus Daftar Tempat Wisata
<img width="533" height="215" alt="image" src="https://github.com/user-attachments/assets/ddc29479-a30b-46a7-907d-b8b7949aa31f" />

5. Mencari salah satu daftar tempat wisata
<img width="694" height="206" alt="image" src="https://github.com/user-attachments/assets/168a5706-de4f-485b-b9b4-a6d5661504b7" />

6. Keluar dari program
<img width="584" height="298" alt="image" src="https://github.com/user-attachments/assets/5a61644b-c86b-41b0-94c1-ec279f5dfedd" />








