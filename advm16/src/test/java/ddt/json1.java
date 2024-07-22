package ddt;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class json1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f=new File("./src/test/resources/json.json");
ObjectMapper l=new ObjectMapper();
JsonNode i=l.readTree(f);
System.out.println(i.get("url").asText());
String s = i.get("url").asText();
	WebDriver k=new ChromeDriver();
	k.get(s);
	}

}
