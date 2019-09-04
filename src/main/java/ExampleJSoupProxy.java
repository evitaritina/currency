import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ExampleJSoupProxy {
    public static void main(String[] args) throws Exception {
        System.setProperty("http.proxyHost", "localhost");
        System.setProperty("http.proxyPort", "80");

        Document doc = Jsoup.connect("http://stackoverflow.com").get();
        System.out.println("Obtained Title: " + doc.title());
    }
}