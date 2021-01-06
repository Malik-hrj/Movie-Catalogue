package com.example.moviecatalogue;

import java.util.ArrayList;

public class MovieData {
    private static String[] NameMovie = {
            "A Star is Born",
            "Aquaman",
            "Avangers Infinity War",
            "Boheiman Rhapsody",
            "BumbleBee",
            "Dragon Ball The Movie",
            "Mary Poppins Return",
            "Mortal Engines",
            "Preman Pensiun",
            "The Mule",
    };

    private static String[] MovieDetails = {
            "A Star Is born" +
                    "Rilis pada tanggal 3 Oktober 2018 (USA)" +
                    "Musisi kawakan Jackson Maine menemukan - dan jatuh cinta dengan - artis yang sedang berjuang Ally. Dia baru saja menyerah pada mimpinya untuk menjadi besar sebagai penyanyi - sampai Jack membujuknya menjadi sorotan. Tetapi bahkan ketika karier Ally lepas landas, sisi pribadi dari hubungan mereka hancur, ketika Jack berjuang terus-menerus dengan iblis internalnya sendiri. " +
                    "" +
                    "Sutradara : Bradley Cooper",
            "Aquaman" +
                    "Rilis pada tanggal 7 Desember 2018" +
                    "Dulunya merupakan rumah bagi peradaban paling maju di Bumi, Atlantis sekarang merupakan kerajaan bawah laut yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan yang sangat besar, Orm berencana untuk menaklukkan orang-orang samudera yang tersisa dan kemudian ke permukaan dunia. Yang menghalangi jalannya adalah Arthur Curry, saudara tiri manusia setengah manusia Orm dan pewaris sejati takhta. " +
                    "" +
                    "Sutradara : James Wan",
            "Avanggers Infinity War" +
                    "Rilis pada tanggal 25 April 2018" +
                    "" +
                    "Saat Avengers dan sekutu mereka terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh satu pahlawan, bahaya baru telah muncul dari bayang-bayang kosmik: Thanos. Seorang lalim penghinaan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan keinginannya yang terpelintir pada semua kenyataan. Segala sesuatu yang Avengers telah perjuangkan telah mengarah ke saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih tidak pasti. ",
            "Boheiman Rhapsody" +
                    "Rilis pada tanggal 24 Oktober 2018" +
                    "" +
                    "Penyanyi Freddie Mercury, gitaris Brian May, drummer Roger Taylor dan gitaris John Deacon mengambil dunia musik dengan badai ketika mereka membentuk band rock \\'n\\' roll Queen pada tahun 1970. Lagu-lagu hit menjadi klasik instan. Ketika gaya hidup Mercury yang semakin liar mulai lepas kendali, Queen segera menghadapi tantangan terbesarnya - menemukan cara untuk menjaga band tetap bersama di tengah kesuksesan dan kelebihan",
            "BumbleBee" +
                    "Rilis pada tanggal 15 Desember 2018" +
                    "" +
                    "Dalam pelarian pada tahun 1987, Bumblebee menemukan perlindungan di tempat barang rongsokan di kota pantai kecil California. Charlie, di puncak usia 18 dan berusaha menemukan tempatnya di dunia, menemukan Bumblebee, bekas luka pertempuran dan patah. Ketika Charlie membangkitkannya, dia dengan cepat mengetahui bahwa ini bukan bug VW kuning biasa.",
            "Dragon Ball the Movie" +
                    "Rilis pada tanggal 14 Desember 2019" +
                    "" +
                    "Bumi damai setelah Turnamen Kekuasaan. Menyadari bahwa alam semesta masih memiliki banyak orang yang lebih kuat untuk dilihat, Goku menghabiskan seluruh hari pelatihannya untuk mencapai ketinggian yang lebih besar. Lalu suatu hari, Goku dan Vegeta dihadapkan pada seorang Saiyan bernama \\'Broly\\' yang belum pernah mereka lihat sebelumnya. Orang-orang Saiyan seharusnya hampir sepenuhnya musnah dalam kehancuran Planet Vegeta, jadi apa yang dilakukan orang ini di Bumi? Pertemuan antara ketiga Saiyan yang telah mengikuti takdir yang sama sekali berbeda ini berubah menjadi pertempuran yang luar biasa, dengan bahkan Frieza (kembali dari Neraka) terperangkap dalam campuran",
            "Mary Poppins Return" +
                    "Rilis pada tanggal 12 Desember 2018" +
                    "" +
                    "Di era Depresi London, seorang Jane dan Michael Banks yang sudah dewasa, bersama tiga anak Michael, dikunjungi oleh Mary Poppins yang penuh teka-teki setelah kehilangan pribadi. Melalui keterampilan sihirnya yang unik, dan dengan bantuan temannya Jack, dia membantu keluarga menemukan kembali kegembiraan dan keajaiban yang hilang dalam hidup mereka.",
            "Mortal Engines" +
                    "Rilis pada tanggal 27 November 2018" +
                    "" +
                    "Beribu-ribu tahun di masa depan, kota-kota di bumi menjelajah dunia dengan roda besar, saling melahap dalam perjuangan untuk sumber daya yang semakin berkurang. Di salah satu kota traksi besar ini, London tua, Tom Natsworthy mengalami perjumpaan tak terduga dengan seorang wanita muda misterius dari daerah terlantar yang akan mengubah jalan hidupnya selamanya.",
            "Preman Pensiun" +
                    "Rilis pada tanggal 17 Januari 2019" +
                    "" +
                    "Setelah tiga tahun, bisnis Muslihat (Epi Kusnandar), yang telah pensiun sebagai preman, memiliki masalah. Penurunan penjualan. Muslihat juga menghadapi masalah baru ketika Safira (Safira Maharani), satu-satunya anak perempuannya, tumbuh di masa remaja dan mulai dikunjungi oleh anak laki-laki. Masalah yang lebih besar: gesekan antara mantan bawahannya",
            "The Mule" +
                    "Rilis pada tanggal 14 Desember 2019" +
                    "Earl Stone, seorang pria berusia delapan puluhan, bangkrut, sendirian, dan menghadapi penyitaan bisnisnya ketika dia ditawari pekerjaan yang hanya mengharuskannya mengemudi. Cukup mudah, tetapi, tanpa diketahui Earl, dia baru saja mendaftar sebagai kurir narkoba untuk kartel Meksiko. Dia melakukannya dengan sangat baik sehingga muatannya meningkat secara eksponensial, dan Earl menabrak radar agen DEA pengisian keras Colin Bates."
    };

    private static int[] MovieImages = {
            R.drawable.star,
            R.drawable.aquaman,
            R.drawable.avanger,
            R.drawable.boheiman,
            R.drawable.bumblebee,
            R.drawable.poster_dragonball,
            R.drawable.poster_marrypopins,
            R.drawable.poster_mortalengine,
            R.drawable.poster_preman,
            R.drawable.poster_themule,
    };

    static ArrayList<Movie> getListData() {
        ArrayList<Movie> list = new ArrayList<>();
        for (int position = 0; position < NameMovie.length; position++) {
            Movie movie = new Movie();
            movie.setName(NameMovie[position]);
            movie.setDescription(MovieDetails[position]);
            movie.setPhoto(MovieImages[position]);
            list.add(movie);
        }
        return list;
    }
}









