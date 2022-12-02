package com.invenio.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import com.invenio.models.Header;
import com.invenio.models.LineItems;

public class CSVReader {


	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException, ParseException{
		

		File csvFile = new File("C:\\Users\\sweta.mishra\\Downloads\\read-file-java-poc1.csv");
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
		String line = "";
		try {
			
			while((line = br.readLine()) != null) {
				String[] count = line.split(";");
				
				if(count[0].equalsIgnoreCase("HAUDIT")) {
					
					 Header headerObject = new  Header();
					 headerObject.setRecordType(count[0]);
					 headerObject.setTotalLines(Integer.parseInt(count[1]));
					 headerObject.setTotalAmt(Float.parseFloat(count[2]));
					 headerObject.setMinAmt(Integer.parseInt(count[3]));
					 DateFormat format = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
					 headerObject.setCurrentDate(format.parse(count[4]));
					 System.out.println("Header: "+headerObject);
					 
					 
					
				}
				else {
					s
					
					LineItems lineItemsObject = new LineItems();
					lineItemsObject.setRecordType(count[0]);
					lineItemsObject.setLineNumber(Integer.parseInt(count[1]));
					lineItemsObject.setRefDocNum(count[2]);
					lineItemsObject.setCity(count[3]);
					lineItemsObject.setAmount(Float.parseFloat(count[4]));
					System.out.println("Line: "+lineItemsObject);
					
					
					
					
					
					
					
				}
				
				}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	

	}

	@Override
	public String toString() {
		return "CSVReader []";
	}
} 