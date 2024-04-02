package com.example.tugasdayke6;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SepatuActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Sepatu_Adaptor sepatuAdaptor;
    private ArrayList<Model_Sepatu> modelSepatuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepatu);

        EdgeToEdge.enable(this);

        // Isi data ke dalam objek Model_Sepatu
        isiDataSepatu();

        recyclerView = findViewById(R.id.Tampilan);
        sepatuAdaptor = new Sepatu_Adaptor(modelSepatuList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(sepatuAdaptor);
    }

    private void isiDataSepatu() {
        modelSepatuList = new ArrayList<>();
        modelSepatuList.add(new Model_Sepatu("SKATE SAFE LOW RORY WHITE LEATHER", R.drawable.sepatuvansskatesafewhite, "Jauh dari bermain aman seperti namanya, Rory Milanes dan Danny Brady telah meninggalkan mesin fotokopi dan dipromosikan untuk mengerjakan sepatu baru pada musim semi ini – Safe Low.\n" +
                "\n" +
                "Versi pertama diperkenalkan melalui kolaborasi Vans Skateboarding x Palace pada tahun 2023, dengan kampanye yang terinspirasi dari kantor yang dipimpin oleh pembalap tim skate Vans dan Palace, Rory dan Brady. Untuk Musim Semi 2024, duo yang berbasis di London ini telah memperbarui siluet dengan sentuhan desain pribadi mereka. Safe Low adalah sepatu skate vulkanisir baru yang terinspirasi oleh gaya ikonik Vans dari arsip.\n" +
                "\n" +
                "Safe Low Rory dan Danny tersedia dalam dua warna – kulit serba putih Rory dan gaya biru langit Danny. Sepatu tersebut memiliki karya seni khusus dari masing-masing skater, dengan sepatu Rory menampilkan karya seni dari temannya dan seniman Istana, John Knight. Sepatu ini dilengkapi tali Ghillie dan bootie kaus kaki untuk kenyamanan maksimal dan ukuran yang pas.\n" +
                "\n" +
                "Koleksinya juga dilengkapi dengan kaos putih klasik yang terinspirasi dari kaos vintage yang ditemukan Rory dengan tulisan “safe”.\n\n" + "https://www.tokopedia.com/vast/skate-safe-low-brady-sky-blue-40-5-51caa?extParam=src%3Dshop%26whid%3D8113637", "Rp. 1.799.000"));
        modelSepatuList.add(new Model_Sepatu("SKATE SAFE LOW BRADY SKY BLUE", R.drawable.sepatuvansskatesafeblack, "Jauh dari bermain aman seperti namanya, Rory Milanes dan Danny Brady telah meninggalkan mesin fotokopi dan dipromosikan untuk mengerjakan sepatu baru pada musim semi ini – Safe Low.\n" +
                "\n" +
                "Versi pertama diperkenalkan melalui kolaborasi Vans Skateboarding x Palace pada tahun 2023, dengan kampanye yang terinspirasi dari kantor yang dipimpin oleh pembalap tim skate Vans dan Palace, Rory dan Brady. Untuk Musim Semi 2024, duo yang berbasis di London ini telah memperbarui siluet dengan sentuhan desain pribadi mereka. Safe Low adalah sepatu skate vulkanisir baru yang terinspirasi oleh gaya ikonik Vans dari arsip.\n" +
                "\n" +
                "Safe Low Rory dan Danny tersedia dalam dua warna – kulit serba putih Rory dan gaya biru langit Danny. Sepatu tersebut memiliki karya seni khusus dari masing-masing skater, dengan sepatu Rory menampilkan karya seni dari temannya dan seniman Istana, John Knight. Sepatu ini dilengkapi tali Ghillie dan bootie kaus kaki untuk kenyamanan maksimal dan ukuran yang pas.\n" +
                "\n" +
                "Koleksinya juga dilengkapi dengan kaos putih klasik yang terinspirasi dari kaos vintage yang ditemukan Rory dengan tulisan “safe”.\n\n " + "https://www.tokopedia.com/vast/skate-safe-low-brady-sky-blue-40-5-51caa?extParam=src%3Dshop%26whid%3D8113637", "Rp. 1.799.000"));
        modelSepatuList.add(new Model_Sepatu("OLD SKOOL VINTAGE FLORAL MARSHMALLOW", R.drawable.sepatuvansmashmellowwhite, "Old Skool adalah desain sepatu pertama kami yang menampilkan garis samping ikonis Vans Sidestripe — meskipun saat itu, itu hanya sekedar coretan sederhana yang digambar oleh pendiri Paul Van Doren. Sejak pertama kali diluncurkan pada tahun 1977, siluet rendah ini telah menjadi ikon di dunia skateboard, musik, dan fashion. Dari para skater jalanan era 90-an hingga punk dan legenda hip hop dan fashion saat ini,\n" +
                " " + "Old Skool secara konsisten menjadi pilihan sepatu bagi para kreatif yang melakukan hal-hal sesuai dengan gaya mereka sendiri. Old Skool Vintage Floral hanya menambahkan sentuhan gaya ekstra. \n\n tokopedia.com/vast/old-skool-vintage-floral-marshmallow-38-3866d?extParam=src%3Dshop%26whid%3D8113637", "Rp. 1.189.150"));
        modelSepatuList.add(new Model_Sepatu("ROWAN MARSHMALLOW/GUM", R.drawable.sepatuvanssmashmellowwhiteandbrown, "Setiap kali Rowan Zorilla menginjak papannya, itu adalah pertunjukan langsung. Dia membuat skating yang paling sulit terlihat mudah, dan sepatu khas pertamanya dirancang dengan mempertimbangkan hal tersebut. Rowan mungkin terlihat santai di permukaannya, namun jika digali lebih dalam lagi, lapisan kerumitannya akan mulai terlihat. Dengan fitur progresif dan bahan yang telah teruji waktu, sepatu vulkanisir ini mendorong Anda untuk menampilkan performa Anda sendiri.\n" +
                "\n" +
                "DURABILITAS YANG TAK TERTANDINGI - Lapisan bawah DURACAP™ yang diperkuat di area dengan tingkat keausan tinggi menambah daya tahan yang tak tertandingi untuk memperpanjang umur setiap sepatu.\n" +
                "\n" +
                "GRIP LEGENDARIS - Kompon karet SickStick™ milik kami adalah karet kami yang paling lengket.\n" +
                "\n" +
                "POPCUSH™ CUSHIONING - Bantalan dan perlindungan benturan terbaik kami. Alas kaki pengembalian energi PopCush™ melindungi kaki Anda sekaligus membantu mengurangi kelelahan kaki untuk sesi skate yang lebih lama.\n" +
                "\n" +
                "BAHAN KLASIK - Rowan dibuat dengan bahan suede kokoh dan bagian atas kanvas 10 ons untuk tampilan Vans® yang ikonikn\n\n." + "https://www.tokopedia.com/vast/rowan-marshmallow-gum-40-5-e0074?extParam=src%3Dshop%26whid%3D8113637", "Rp.1.359.150"));
        modelSepatuList.add(new Model_Sepatu("STYLE 36 BLACK/MARSHMALLOW", R.drawable.sepatuvanssmashmellowwhiteandblack, "Vans Style 36 pertama kali dirilis di tahun 1977 dan berevolusi jadi siluet Old Skool. Ini adalah sepatu Vans pertama yang memiliki jazz-stripe pada panel sampingnya, detail yang diinspirasi oleh gambar doodle sang pendiri, Paul Van Doren. Model ini menghidupkan kembali desain original model tahun 1978, termasuk pola jahitan original dan toe cap yang diperkuat. Colorway ini memiliki upper kanvas Marshmallow dengan Dress Blues jazz-stripe dan suede Marshmallow pada toe cap, eyelet, dan heel-nya. Sepatu ini juga memiliki midsole karet vulkan dan outsole waffle yang klasik.\n\n" + "https://www.tokopedia.com/vast/style-36-black-marshmallow-43-416ca?extParam=src%3Dshop%26whid%3D8113637", "Rp.1.019.150"));
        modelSepatuList.add(new Model_Sepatu("AUTHENTIC DISNEY 100 OG FAMILY MULTI/MULTI", R.drawable.sepatuvanssdesneyslipon, "Selama 100 tahun, minat Disney adalah bercerita. Dari satu generasi ke generasi berikutnya, kisah-kisah Disney telah menginspirasi para pencipta, memengaruhi budaya pop, dan menyatukan kita. Tahun ini, Vans dengan bangga merayakan satu abad kisah dan karakter Disney tak terlupakan yang telah memikat hati penonton di seluruh dunia dengan koleksi yang dibuat untuk seluruh keluarga.\n" +
                "\n" +
                "Memasuki dunia Disney melalui lensa Off The Wall, Disney X Vans Authentic menyoroti beberapa karakter Disney tertua dan paling dicintai dengan estetika hitam putih. Dari Mickey dan Minnie hingga Donald dan Goofy, sepatu low-top klasik ini memungkinkan Anda merayakan keajaiban abadi Disney setiap hari.\n" +
                "\n" +
                "Koleksi Disney X Vans\n" +
                "Sepatu low-top warisan\n" +
                "Penutupan bertali\n" +
                "Bagian atas berbahan suede dan tekstil yang kokoh\n" +
                "Tambalan karakter Disney yang ikonik\n" +
                "Sulaman Disney100\n" +
                "Sol luar wafel karet khas\n" +
                "4 baris renda lubang logam untuk ukuran 3,5-6\n" +
                "5 baris renda lubang logam untuk ukuran 6,5 ke atas.\n\n" + "https://www.tokopedia.com/vast/authentic-disney-100-og-family-multi-multi-41-33234?extParam=src%3Dshop%26whid%3D8113637", "Rp. 1.247.150"));
        modelSepatuList.add(new Model_Sepatu("SK8-HI DISNEY 100 VILLAINS MULTI", R.drawable.sepatuvanssdesneylong, "Selama 100 tahun, minat Disney adalah bercerita. Dari satu generasi ke generasi berikutnya, kisah-kisah Disney telah menginspirasi para pencipta, memengaruhi budaya pop, dan menyatukan kita. Tahun ini, Vans dengan bangga merayakan satu abad kisah dan karakter Disney tak terlupakan yang telah memikat hati penonton di seluruh dunia dengan koleksi yang dibuat untuk seluruh keluarga.\n" +
                "\n" +
                "Melangkah ke dunia Disney melalui lensa Off The Wall, Disney X Vans Sk8-Hi menyoroti pemeran penjahat Disney yang karismatik, namun sering disalahpahami. Dari Ursula dan Cruella hingga Jafar dan Hades, sepatu high-top yang menakutkan ini memungkinkan Anda merayakan keajaiban abadi Disney setiap hari.\n" +
                "\n" +
                "Koleksi Disney X Vans\n" +
                "Sepatu Sidestripe™ yang tinggi dan legendaris\n" +
                "Bagian atas berbahan suede dan tekstil yang tahan lama\n" +
                "Cetakan penjahat Disney\n" +
                "Penutupan bertali\n" +
                "Penutup jari kaki yang diperkuat\n" +
                "Kerah empuk yang mendukung\n" +
                "Sol luar wafel karet khas\n" +
                "Sk8-Hi® Klasik.\n\n" + "https://www.tokopedia.com/vast/sk8-hi-disney-100-villains-multi-40-5-8bfbe?extParam=src%3Dshop%26whid%3D8113637", "Rp. 1.359.150"));
        modelSepatuList.add(new Model_Sepatu("OLD SKOOL 36 DX NYLON BLOCK DRIZZLE", R.drawable.sepatuvanssoldschoolwhiteandgrey, "Pertama dikenal sebagai Vans #36, sepatu Old Skool ini debut di tahun 1977 dengan tambahan yang unik: gambar doodle random oleh si pendiri, Paul Van Doren, dan awalnya disebut sebagai 'jazz stripe'. Hari ini, Sidestripe Vans yang terkenal sudah menjadi ciri khas terkenal dari brand Vans yang mudah dikenali.\n" +
                "\n" +
                "Dibuat dengan suede tahan lama dan upper berbahan kanvas dalam berbagai pilihan warna, Old Skool merayakan warisan Vans sembari memastikan sepatu tali low top ini tetap ikonik seperti dulu. Sepatu ini juga memiliki toe cap yang lebih kuat, collar empuk yang memberikan support, dan outsole waffle karet ciri khas Vans.\n" +
                "\n" +
                " \n" +
                "\n" +
                "• Sepatu sidestripe, low-top Vans yang ikonik\n" +
                "• Upper berbahan kanvas dan suede yang tahan lama\n" +
                "• Menggunakan tali sepatu\n" +
                "• Toe cap yang lebih kuat\n" +
                "• Collar empuk yang memberikan support\n" +
                "• Outsole waffle karet ciri khas Vans.\n\n" + "https://www.tokopedia.com/vast/old-skool-36-dx-nylon-block-drizzle-39-0288c?extParam=src%3Dshop%26whid%3D8113637", "Rp. 1.359.150"));
        modelSepatuList.add(new Model_Sepatu("SK8-LOW CORDURA BLACK", R.drawable.sepatuvansspandora, "Sepatu Vans Sk8-Low Cordura Black memiliki desain yang unik dan elegan, serta terbuat dari bahan berkualitas. Sepatu ini juga memiliki jahitan yang rapi dan detail, serta diproduksi menggunakan teknologi modern. \n" +
                "Sepatu Vans Sk8-Low Cordura Black memiliki fitur-fitur berikut: Bahan Cordura canvas yang tahan air dan anti robek, Lidah dan kerah yang empuk, Sol luar dari karet vulkanisir untuk traksi, Konstruksi yang tahan lama, Bentuk yang pas dan nyaman.\n\n" + "https://www.tokopedia.com/vast/sk8-low-cordura-black-41-a9589?extParam=src%3Dshop%26whid%3D8113637", "Rp. 1.359.150"));
        modelSepatuList.add(new Model_Sepatu("ZAHBA MID BEATRICE DOMOND DARK OLIVE", R.drawable.sepatuvansssamba, "Terinspirasi oleh semua era sejarah skate, gaya khas pebalap tim Vans Skateboarding Beatrice Domond terasa kontemporer dan diinformasikan oleh generasi lain. Di papannya, Beatrice mendorong street skating ke arah yang segar dan mengasyikkan yang memadukan gaya dan kemahiran. Dia melakukan hal yang sama: gaya pribadinya yang tak tertandingi telah menjadikannya favorit para ahli fesyen. Keserbagunaan ini menjadikan Domond pilihan sempurna untuk memperkenalkan Zahba Mid, anggota terbaru keluarga Zahba dan siluet yang, seperti Domond, dapat melakukan apa saja. Menampilkan ImpactWaffle, desain sol luar dengan bantalan benturan terbaik dari Vans, Zahba Mid menempatkan bantalan di tempat yang Anda butuhkan-dan menjauhkannya dari area yang tidak Anda perlukan-sehingga Anda memiliki keseimbangan yang tepat antara perlindungan benturan dan kontrol papan untuk meningkatkan level Anda. skatingmu. Itulah dampak yang bisa Anda lihat.\n" +
                "\n" +
                "\n" +
                "FITUR PRODUK\n" +
                "• IMPACTWAFFLE™: Untuk memberikan perlindungan dampak tingkat berikutnya, tanpa\n" +
                "mengorbankan nuansa papan.\n" +
                "\n" +
                "• VR3CUSH™: Midsole fleksibel dengan kepadatan ganda yang terbuat dari setidaknya 50% busa EVA berbasis bio yang sebagian berasal dari tumbuhan. (EMEA: sesuai standar referensi ASTM D6866-16)\n" +
                "\n" +
                "• SICKSTICK™: Cupsole Zahba™ Mid memiliki desain tapak zonal untuk meningkatkan cengkeraman dan daya tahan, dengan tapak ImpactWaffle™ di bagian tumit untuk meningkatkan umur sepatu. Sol luar karet Zahba Mid SickStick diproduksi dengan setidaknya 55% karet alam yang diperoleh dari sumber yang bertanggung jawab dan mengikuti praktik berkelanjutan yang telah terbukti dengan tujuan mengurangi dampak terhadap planet ini.\n\n" + "https://www.tokopedia.com/vast/zahba-mid-beatrice-domond-dark-olive-40-5-bd05c?extParam=src%3Dshop%26whid%3D8113637", "Rp. 1.784.150"));
        modelSepatuList.add(new Model_Sepatu("VANS AUTHENTIC 44 DX ALVA SKATES INDIGO NAVY", R.drawable.sepatuvanssauthentic, "Vans merayakan pionir kreatif dan legenda skateboard Tony Alva dengan koleksi alas kaki dan pakaian.\n" +
                "\n" +
                "Tidak ada orang yang lebih autentik dan jujur pada diri mereka sendiri selain Tony Alva. Sebagai salah satu penjelajah kreatif pertama Vans, dia menjadi inspirasi bagi generasi masa depan untuk maju dalam perjalanan mereka menemukan jati diri mereka. Dengan Alva Skates Authentic 44 DX, kami meninjau kembali warisan Tony bersama Vans untuk menginspirasi semua pemikir kreatif untuk menyalurkan sisi batin Tony Alva dan menjadi autentik tanpa penyesalan.\n" +
                "\n" +
                "• Koleksi Sepatu Vans x Alva\n" +
                "• Bagian atas berbahan tekstil yang terinspirasi gaya vintage\n" +
                "• Seluruh desain cetak Alva dan airbrush\n" +
                "• Pelapis kaus kaki Ortholite®\n" +
                "• Pita foxing yang lebih mengkilap\n" +
                "• Tali katun\n" +
                "• Sol luar wafel karet yang khas\n" +
                "• 4 baris renda lubang logam untuk ukuran 36-39\n" +
                "• 5 baris renda lubang logam untuk ukuran 40 ke atas\n" +
                "\n" +
                "Komposisi: KANVAS.\n\n" + "https://www.tokopedia.com/vast/vans-authentic-44-dx-alva-skates-indigo-navy-43-a18a3?extParam=whid%3D8113637%26src%3Dshop", "Rp. 1.614.150"));
        modelSepatuList.add(new Model_Sepatu("KNU SKOOL DISNEY 100 SCAR BLACK/BROWN", R.drawable.sepatuvanssdesneyschoolbrown, "Selama 100 tahun, minat Disney adalah bercerita. Dari satu generasi ke generasi berikutnya, kisah-kisah Disney telah menginspirasi para pencipta, memengaruhi budaya pop, dan menyatukan kita. Tahun ini, Vans dengan bangga merayakan satu abad kisah dan karakter Disney tak terlupakan yang telah memikat hati penonton di seluruh dunia dengan koleksi yang dibuat untuk seluruh keluarga.\n" +
                "\n" +
                "Melangkah ke dunia Disney melalui lensa Off The Wall, Disney X Vans Knu Skool menghormati The Lion King dengan sentuhan unik dengan menyalurkan paman Simba yang licik, Scar. Dengan cetakan wajahnya di sol luar dan sulaman siluet hyena di bagian tumit, sepatu gembung tahun 90-an ini memungkinkan Anda merayakan keajaiban abadi Disney setiap hari.\n" +
                "\n" +
                "Koleksi Disney X Vans\n" +
                "Sepatu low top tahun 90an diterbitkan kembali\n" +
                "Bagian atas berbahan suede yang kokoh\n" +
                "Lidah bengkak dan kerah pergelangan kaki\n" +
                "Detailnya terinspirasi oleh Scar dari The Lion King\n" +
                "Sidestripe™ cetakan 3D yang bengkak\n" +
                "Tarikan tumit untuk kemudahan masuk\n" +
                "Sol luar wafel karet khas dengan cetakan Scar.\n\n" + "https://www.tokopedia.com/vast/knu-skool-disney-100-scar-black-brown-40-5-64de7?extParam=src%3Dshop%26whid%3D8113637", "Rp. 1.699.150"));
        modelSepatuList.add(new Model_Sepatu("ROWAN 2 GREY/WHITE", R.drawable.sepatuvanssrowan, "• IMPACTWAFFLE: Rowan 2 mengembangkan teknologi ImpactWaffle™ dengan menariknya lebih jauh ke bagian depan sepatu untuk perlindungan lebih terhadap benturan, tanpa mengorbankan tekstur papan.\n" +
                "\n" +
                "• SICKSTICK: Cupsole karet Rowan 2 SickStick™ dilengkapi dengan desain tapak zonal di kaki depan untuk meningkatkan cengkeraman dan kontrol papan, dengan pola tapak wafel terbalik di bagian tumit untuk meningkatkan umur sepatu.\n" +
                "\n" +
                "• DURACAP: Duracap™ terbuka di bagian atas untuk daya tahan maksimum terhadap keausan.\n" +
                "\n" +
                "• SOCKLINER DAUR ULANG: Lapisan tambahan yang terbuat dari 98% bahan daur ulang telah ditambahkan di atas midsole yang dibentuk untuk menambah kenyamanan.\n" +
                "\n" +
                "Kode : VN0A2Z3I1XM\n" +
                "Warna : ABU-ABU / PUTIH\n" +
                "Bahan : SUEDE, SINTETIS.\n\n" + "https://www.tokopedia.com/vast/rowan-2-grey-white-41-c2fc7?extParam=src%3Dshop%26whid%3D8113637", "Rp. 1.699.150"));
        modelSepatuList.add(new Model_Sepatu("CLASSIC SLIP-ON 98 DX (ANAHEIM FACTORY) OG MARBLE/BLUE", R.drawable.sepatuvanssclasic, "“ANAHEIM FACTORY PACK” adalah paket yang dibuat sebagai penghormatan kepada pabrik pertama VANS di Anaheim, California. Detail nostalgia seperti nomor gaya dan pewarnaan, pita rubah mengkilap, renda katun, pelapis kain yang dibor, dan bagian atas tekstil yang kokoh ada di mana-mana. Sambil mereproduksi model aslinya, kami mewujudkan kenyamanan modern dengan memperbarui insole ORTHOLITE.\n\n" + "https://www.tokopedia.com/vast/classic-slip-on-98-dx-anaheim-factory-og-marble-blue-8?extParam=src%3Dshop%26whid%3D8113637", "Rp. 1.189.150"));
        modelSepatuList.add(new Model_Sepatu("VANS BLACK AND WHITE OLD SCHOOL", R.drawable.sepatuvansswhayve, "Sebuah gaya baru yang unik dari Vans, Wayvee dirancang dari awal dengan masukan dari para pemain skateboard yang memahami apa artinya mendorong batas-batas gaya dan perkembangan.\n" +
                "\n" +
                "Wayvee dilengkapi dengan penutup jari kaki Duracap untuk daya tahan dan inovasi terbaru Vans, LuxLiner yang memberikan penguncian yang tahan seumur hidup.\n" +
                "\n" +
                "Sol luar Wafflecup yang revolusioner memberi para skater dukungan sol cup yang mereka butuhkan dipadukan dengan nuansa papan sepatu yang divulkanisasi, untuk memberikan kelenturan yang luar biasa, peningkatan daya tahan, dan bantalan benturan maksimum.\n\n" + "https://www.tokopedia.com/vast/wayvee-black-true-white-40-5-e3d4c?extParam=whid%3D8113637%26src%3Dshop", "Rp. 1.799.000"));
    }
}
