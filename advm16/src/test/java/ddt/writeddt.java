package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writeddt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream n=new FileOutputStream("./src/test/resources/prop3.properties");
Properties f=new Properties();
f.setProperty("url", "https://demowebshop.tricentis.com/");
f.setProperty("email","rikesh1833@gmail.com");
f.store(n,"prp3");
FileInputStream z=new FileInputStream("./src/test/resources/prop2.properties");

f.load(z);
f.getProperty("url");
	}

}