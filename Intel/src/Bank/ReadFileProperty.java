package Bank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFileProperty {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("src\\Bank\\emp.properties");
			Properties p=new Properties();
			p.load(fis);
			String ei= p.getProperty("Eid");
			System.out.println(ei);
			
			System.out.println(p.getProperty("EmpNm"));
			System.out.println(p.getProperty("ProjNm"));
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		

	}

}
