import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupRun {
    public static void main(String[] args)throws IOException{
        Document dc= Jsoup.connect("https://www.ecb.europa.eu/stats/policy_and_exchange_rates/euro_reference_exchange_rates/html/index.en.html").timeout(6000).get();
        Elements body=dc.select("div#bodycontents");
    }
    
}
