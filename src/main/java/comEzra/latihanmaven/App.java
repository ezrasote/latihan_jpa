package comEzra.latihanmaven;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		{
			HashMap<String, String> map = new HashMap<String, String>();
			// tipe data multidimensi
			// contoh kita bikin dia isi data string dan string, masukinnya pake put

			map.put("Latihan Maven", "Hello World");

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			// System.out.println(map.get("Latihan Maven"));
			// android gabisa nyimpen langsung ke database, harus menggunakan web service.
			// tapi harus menggunakan bahasa json stau wsdl

			// Gson gson = new Gson();

			String json = gson.toJson(map);

			System.out.println(json);
		}
//    	
//    	String [] a = new String[] {"abc"};
//		String [] b = new String[] {"def","ghi"};
//		String [] c = new String[] {"aaa","bbb","ccc"};
//		
//		for (int i = 0; i < alamat.length; i++) {
		String[] alamat = { "abc", "def" };
		String[] telp = { "0990", "0880" };

		HashMap<String, Object> map2 = new HashMap<String, Object>();
		map2.put("nama", "abc");
		map2.put("alamat", alamat);
		map2.put("telp", telp);

		ArrayList<HashMap> array = new ArrayList<HashMap>();

		array.add(map2);
		array.add(map2);

		Gson gson2 = new GsonBuilder().setPrettyPrinting().create();

		// Gson gson2 = new Gson();

		String json2 = gson2.toJson(array);

		System.out.println(json2);
//    
//    	"nama" : "abc",
//    	"alamat" : "def",
//    	"telp" : "099999"
	}

}
