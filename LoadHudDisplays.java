package home4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface{
	String name=null;
	public LoadHudDisplays(String n) {
		name =n;
	}
	@Override
	public ArrayList<String> load() {
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader readme= null;
		try {
			readme= new BufferedReader(new FileReader(name));
			String s;
			while((s= readme.readLine())!=null) {
				list.add(s);
			}
			readme.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	

}
