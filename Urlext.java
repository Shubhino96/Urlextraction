import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
public class Urlext {
	Document doc;
	public String[] imgext(String d){
		String base="http://foodomania.com/category/cuisine/";
		int i=0;
		String[] urls=new String[20];
		try {
			doc=Jsoup.connect(base+d+"/").get();
			Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
			for(Element image:images)
			{
				if(i==20)
					break;
				urls[i]=image.attr("src");
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return urls;
	}
}
