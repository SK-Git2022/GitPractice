package com.techm.ReqResp.utils;

import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class FileComparison {
	
	private static final Logger logger = LogManager.getLogger(FileComparison.class);
	
	public static void compareTwoFiles() {
		String filePath=System.getProperty("user.dir") +"\\src\\test\\java\\com\\techm\\ReqResp\\resources\\";
	LinkedHashMap<String, String> positionMap=new LinkedHashMap<String, String>();
		LinkedHashMap<String, String> instruMentsMap=new LinkedHashMap<String, String>();
		try {
			FileReader filereader = new FileReader(
					new File(filePath+"PositionReport.csv"));

			CSVReader csvReader = new CSVReaderBuilder(filereader).build();
			List<String[]> allData = csvReader.readAll();
			for(int row=1; row<allData.size();row++) {
					String[] columns = allData.get(row);
					positionMap=getDataRow(filePath+"PositionDetails.csv",1,columns[1]);
					if(!positionMap.isEmpty()) {					
						instruMentsMap=getDataRow(filePath+"\\InstrumentDetails.csv",1,positionMap.get("InstrumentID"));
						if(!instruMentsMap.isEmpty()) {
							String[] headerRow=allData.get(0);
							StringBuilder sb=new StringBuilder();
							for(int column=0;column<columns.length;column++) {								
								if(headerRow[column].equals("Total Price")) {									 
									 int totalMultiplication=Integer.parseInt(positionMap.get("Quantity"))*Integer.parseInt(instruMentsMap.get("Unit Price"));
									 if(totalMultiplication!=Integer.parseInt(columns[column])) {
										 System.out.println("Wrong calculation found, Please cross check Total Price==>"+positionMap.get("Quantity")+"*"+instruMentsMap.get("Unit Price"));
										 logger.error("Wrong calculation found, Please cross check Total Price==>"+positionMap.get("Quantity")+"*"+instruMentsMap.get("Unit Price"));
									 }
								}
								sb.append(allData.get(0)[column]+"==>"+columns[column]+" ");
								//System.out.println(allData.get(0)[column]+"==>"+columns[column]);
							}		
							System.out.println("**********************PositionReport Contents  Row==>"+row+"********************************");
							logger.info("**********************PositionReport Contents  Row==>"+row+"********************************");
							System.out.println(sb.toString());		
							logger.info(sb.toString());	
							logger.info("***************************************************************************************\n");
							System.out.println("***************************************************************************************\n");
						} else {
							logger.error("Instrument.csv file does not contain required data");	
							System.out.println("Instrument.csv file does not contain required data");
						}
					} else{
						logger.error("PositionDetail.csv file does not contain required data");							
						System.out.println("PositionDetail.csv file does not contain required data");
					}					
				
			}				
		    } catch (Exception e) {
				e.printStackTrace();
			}
	}

	public static LinkedHashMap<String, String> getDataRow(String filePath,int columnToBeChecked,String primaryId) {
		LinkedHashMap<String, String> dataMap=new LinkedHashMap<String, String>(); 
		try {
			// Create an object of file reader class with CSV file as a parameter.
			FileReader filereader = new FileReader(
					new File(filePath));

			//CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
			CSVReader csvReader = new CSVReaderBuilder(filereader).build();
			List<String[]> allData = csvReader.readAll();
			String[] headerRow=allData.get(0);

			// print Data
			for (String[] row : allData) {
				if(row[columnToBeChecked-1].toString().equals(primaryId)) {
					for(int i=0;i<row.length;i++) {
						dataMap.put(headerRow[i],row[i]);
					}					
					break;
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataMap;
	}	
	
}
