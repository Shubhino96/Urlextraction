import java.io.File;
import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;

public class Transform {
	public static void main(String args[]) throws IOException{
		File file=new File("C:/Users/shubhangi/workspace/URLextract/src/raw.html");
		Document doc=Jsoup.parse(file,"utf-8");
		Element tagmeta=new Element(Tag.valueOf("meta"), "");
		tagmeta.attr("charset","utf-8");
		doc.head().appendChild(tagmeta);
		
		Element tagli=new Element(Tag.valueOf("ul"), "");
		tagli.attr("style","list-style-type:square");
		Element li=new Element(Tag.valueOf("li"),"");
		li.text("Class 1");
		Element li1=new Element(Tag.valueOf("li"),"");
		li1.text("Class 2");
		tagli.appendChild(li);
		tagli.appendChild(li1);
		doc.body().appendChild(tagli);
		System.out.println("filew");
		FileWriter writer =new FileWriter("C:/Users/shubhangi/workspace/URLextract/src/newf.html");
		writer.write(doc.toString());
		writer.close();
	}
	
}
