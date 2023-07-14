
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
public class api {
	
	public  double get(String monedaOrigen, String monedaDestino, double cantidad)  {
		double resultado = 0;

        try {
    
            String url = "https://www.google.com/search?q=" + cantidad + monedaOrigen + "+to+" + monedaDestino;

  
            Document doc = Jsoup.connect(url).get();

            Element result = doc.select("span.DFlfde.SwHCTb").first();

       
            String tasaCambio = result.text().replaceAll("[^0-9.]", "");
            resultado=Double.parseDouble(tasaCambio);

    
            System.out.println("Tasa de cambio: " + tasaCambio);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
		 return resultado;
		
		
		
	}
	
	
	       
}
