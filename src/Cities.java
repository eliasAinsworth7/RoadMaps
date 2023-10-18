import java.util.ArrayList;
import java.util.LinkedList;

public class Cities {
    private static LinkedList<Graph> roadsOfcities = new LinkedList<>();
    public Cities(){
        Vertex kecioren = new Vertex(new Info("Keçiören ","Keçiören, Ankara ilinin ilçesidir. 2022 yılı nüfus verilerine göre Ankara'nın ikinci, Türkiye'nin ise en büyük dördüncü ilçesi konumundadır."));
        Vertex sincan = new Vertex(new Info("Sincan","Sincan, Ankara'nın ilçelerinden biri ve en kalabalık altıncı ilçesidir."));
        Vertex cankaya = new Vertex(new Info("Çankaya","Çankaya, Ankara'nın bir ilçesi.[1] Ankara ilinin orta kesiminde bulunan ilçe,[2] Ankara'nın başkent olması ile birlikte Türkiye'nin yönetim merkezi durumuna gelmiştir.[1] 2022 yılı nüfus verilerine göre Ankara'nın birinci, Türkiye'nin ise en büyük ikinci ilçesi konumundadır. Türkiye'nin en kalabalık ilçelerinden biri olarak nüfusu pek çok ilden daha fazladır"));
        kecioren.addEdge(sincan,64);kecioren.addEdge(cankaya,44);sincan.addEdge(kecioren,64);cankaya.addEdge(kecioren,44);
        ArrayList<Vertex> districtOfankara = new ArrayList<>();districtOfankara.add(kecioren);districtOfankara.add(sincan);districtOfankara.add(cankaya);
        Graph ankara = new Graph(true,false,districtOfankara,"Ankara");
        Vertex yomra = new Vertex(new Info("Yomra","Yomra, Trabzon ilinin ilçesi ve 25 Mahalleden oluşmaktadır.Yomra ilçesinin ilk adı Durana’dır. İlçeye ilk yerleşenler tarafından bu isim verilmiştir. İlçe yeni adını içinde yetişmekte olan Yomra elmasından almıştır."));
        Vertex of = new Vertex(new Info("Of","Of (Eski Lazca: ოფუტე, Oput'e, Romeika: Όφη, Όfi), Trabzon ilinin doğusunda yer alan ve tarihi çok eskilere dayanan bir ilçedir. Arazisini, Of'tan Karadeniz'e dökülen Solaklı ve Baltacı derelerinin aşağı havzaları oluşturur."));
        Vertex akcaabat = new Vertex(new Info("Akçaabat","Akçaabat eski ismiyle Polathane, Trabzon ilinin bir ilçesi olup, Vakfıkebir ve Çarşıbaşı'nın doğusunda, Trabzon'un 13 km. batısında, Düzköy ve Maçka'nın kuzeyinde yer almaktadır. Sakin bir sey almayin her sey pahali.(Su 30tl olur mu kardesim ya)"));
        yomra.addEdge(of,43);yomra.addEdge(akcaabat,32);of.addEdge(yomra,43);akcaabat.addEdge(yomra,32);
        ArrayList<Vertex> districtOftrabzon = new ArrayList<>();districtOftrabzon.add(yomra);districtOftrabzon.add(of);districtOftrabzon.add(akcaabat);
        Graph trabzon = new Graph(true,false,districtOftrabzon,"Trabzon");
        Vertex yusufeli = new Vertex(new Info("Yusufeli","Yusufeli, Türkiye Cumhuriyeti'nin Karadeniz Bölgesi'nde bulunan Artvin iline bağlı bir ilçe ve ilçenin merkezi olan kasabadır. İlçe merkezi Yusufeli Barajı'nın yapılmasıyla yeni yerine taşınmıştır."));
        Vertex murgul = new Vertex(new Info("Murgul","Murgul (Lazca ve Gürcüce: მურღული; Murğuli), Türkiye'nin Karadeniz Bölgesi'nde bulunan Artvin ilinin bir ilçesidir."));
        Vertex arhavi = new Vertex(new Info("Arhavi","Arhavi (Lazca: Arǩabi, Gürcüce: არქაბი/Arkabi); Türkiye Cumhuriyeti'nin Karadeniz Bölgesi'nde bulunan Artvin iline bağlı bir ilçe ve ilçenin merkezi olan şehir."));
        murgul.addEdge(yusufeli,117);murgul.addEdge(arhavi,52);arhavi.addEdge(murgul,52);yusufeli.addEdge(murgul,117);
        ArrayList<Vertex> districtOfartvin = new ArrayList<>();districtOfartvin.add(yusufeli);districtOfartvin.add(arhavi);districtOfartvin.add(murgul);
        Graph artvin = new Graph(true,false,districtOfartvin,"Artvin");
        roadsOfcities.add(artvin);roadsOfcities.add(trabzon);roadsOfcities.add(ankara);
    }

    public LinkedList<Graph> getGraphList() {
        return roadsOfcities;

    }
}
