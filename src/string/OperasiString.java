package string;

public class OperasiString {
    public static void main(String[] args) {
        String kota = "Banjarbaru";

        System.out.println(kota);

        char[] uniskaChar = { 'U', 'N', 'I', 'S', 'K', 'A' };
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(6));
        System.out.println(kota.substring(0,6));

        System.out.println(kota.length());   // mengetahui panjang atau jumlah karakter dalam string
        System.out.println(kota.charAt(3));  // mengambil sebuah karakter dari string pada posisi indeks 3
        System.out.println(String.format("UNISKA %s", kota));  // memformat string
        System.out.println(kota.contains("banjar"));  // memeriksa apakah urutan karakter "banjar" ada dalam string kota. Hasil FALSE karena besar kecil huruf tidak sama.
        System.out.println(kota.equals(uniskaString)); // memeriksa apakah nilai dari dua buah string sama atau tidak
        System.out.println(uniskaString.isEmpty());  // mengetahui apakah string kosong atau tidak
        System.out.println(uniskaString.concat(kota)); // menggabungkan uniskaString dan kota
        System.out.println(kota.replace('a', 'i')); // mengganti seluruh karakter 'a' pada string kota menjadi 'i'
        System.out.println(kota.indexOf("baru"));  // mengembalikan posisi indeks dari substring "baru"

        String warning = "   Awas ada anjing galak!!  ";
        int angka = 20;

        System.out.println(warning);
        System.out.println(warning.trim()); // menghapus spasi awal dan akhir dari string warning
        System.out.println(String.valueOf(angka) + 21);  // mengkonversi tipe data dari int angka menjadi string dan menggabungkannya dengan 21

        String s1 = "Aduh";
        String s2 = "Atuh";

        System.out.println(s1.compareTo(s2));
        /* compateTo digunakan untuk membandingkan dua buah String berdasarkan urutan leksikografisnya.
           jika string pertama memiliki posisi urutan lebih dulu, maka nilai yang dikembalikan angka negatif
           jika String kedua yang memiliki posisi urutan lebih dulu, maka nilai yang dikembalikan angka positif
           tetapi jika kedua string memiliki posisi urutan yang sama, maka nilai yang dikembalikan adalah nol */



    }
}
