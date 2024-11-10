# NAMA : ZAINAL ABIDIN

# NPM  : 2210010087

# KELAS : 5B NONREG BANJARMASIN 

# (LATIHAN 3 )

# APLIKASI PENGELOLAAN KONTAK

## Deskripsi
APLIKASI PENGELOLAAN KONTAK ini adalah aplikasi berbasis Java Swing untuk mengelola daftar kontak. Aplikasi ini memungkinkan pengguna untuk menambah, mencari, memperbarui, dan menghapus kontak. Setiap kontak dapat diklasifikasikan ke dalam kategori tertentu, seperti *Teman*, *Keluarga*, atau *Kerja*, sehingga pengguna dapat mengelompokkan kontak berdasarkan kategori.

## Fitur
- **Tambah Kontak**: Memungkinkan pengguna menambahkan kontak baru dengan nama, nomor telepon, dan kategori.
- **Hapus Kontak**: Pengguna dapat menghapus kontak yang dipilih dari daftar.
- **Perbarui Kontak**: Memungkinkan pengguna memperbarui informasi kontak yang sudah ada.
- **Cari Kontak**: Fitur pencarian untuk menemukan kontak berdasarkan nama atau informasi lain yang diinputkan pengguna.
- **Kategori**: Kontak dapat dikategorikan menjadi "Teman", "Keluarga", atau "Kerja".

## Kode
Kelas utama adalah `ContactApp` yang menggunakan *Java Swing* untuk antarmuka pengguna, dan mengelola data kontak menggunakan tabel (JTable) untuk menampilkan dan memanipulasi data. Aplikasi ini juga memanfaatkan kelas `ContactManager` untuk manajemen data kontak di backend, seperti menambahkan, menghapus, atau mengambil data kontak.

Kode berikut menginisialisasi tampilan antarmuka, aksi-aksi tombol, dan koneksi database:
- `initComponents()`: Inisialisasi komponen antarmuka pengguna seperti *textfield*, *button*, *table*, dan pengaturan layout.
- `addButton`: Menambah kontak ke daftar dan menyimpan ke database.
- `deleteButton`: Menghapus kontak yang dipilih dari daftar.
- `updateButton`: Mengubah data kontak yang dipilih.
- `searchButton`: Mencari kontak berdasarkan kata kunci dari kolom pencarian.

## Teknologi yang Digunakan
- **Java Swing**: Untuk membangun antarmuka pengguna.
- **JDBC (Java Database Connectivity)**: Untuk menghubungkan aplikasi dengan database.
- **Java SE**: Framework Java dasar untuk pemrograman backend dan UI.

## Keunggulan
- **Antarmuka Sederhana**: Aplikasi ini memiliki antarmuka yang mudah digunakan dengan tombol yang jelas untuk setiap fungsi.
- **Fungsi CRUD Lengkap**: Pengguna dapat melakukan semua operasi dasar untuk manajemen kontak (Create, Read, Update, Delete).
- **Klasifikasi Kontak**: Setiap kontak dapat diklasifikasikan berdasarkan kategori untuk pengelompokan yang lebih mudah.
- **Pencarian Kontak**: Memungkinkan pengguna mencari kontak dengan cepat menggunakan fitur pencarian.

## Cara Menggunakan
1. **Menambah Kontak**: Isi nama, nomor telepon, dan pilih kategori, kemudian klik tombol "Add".
2. **Menghapus Kontak**: Pilih kontak dari daftar kontak, kemudian klik tombol "Delete".
3. **Memperbarui Kontak**: Pilih kontak dari daftar kontak, perbarui informasi yang diinginkan, dan klik tombol "Update".
4. **Mencari Kontak**: Ketik nama atau detail kontak yang ingin dicari di kolom pencarian, kemudian klik tombol "Search".

## Cara Menjalankan Program
1. **Persiapan Database**: Pastikan Anda telah menyiapkan database untuk menyimpan data kontak.
   - Buat tabel yang diperlukan menggunakan `DatabaseSetup.createTable();`.
2. **Menjalankan Aplikasi**:
   - Jalankan aplikasi dengan menjalankan metode `main` dalam kelas `ContactApp`.
   - Program akan memuat antarmuka pengguna dan siap digunakan untuk menambah, menghapus, memperbarui, dan mencari kontak.
