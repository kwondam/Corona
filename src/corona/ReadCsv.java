package corona;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCsv {

	public static void main(String[] args) {
		List<List<String>> ret = new ArrayList<List<String>>();
		BufferedReader br = null;
		
		try {
			br=Files.newBufferedReader(Paths.get("C:/Users/indo4/OneDrive/Desktop/index.csv"));
			String line = "";
			//int row =0;
			while((line=br.readLine())!=null) {
				
				List<String> tmpList = new ArrayList<String>();
				String array[] = line.split(",");
				/*
				for(int i=0; i<6;i++) {
					ret[row][i] = array[i];
				}
				*/
				tmpList = Arrays.asList(array);
				System.out.println(tmpList);
				ret.add(tmpList);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

}
