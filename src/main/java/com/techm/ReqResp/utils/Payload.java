package com.techm.ReqResp.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Payload {
	
	public static String addPayload() {		
		String payload = null;
		try {			
			payload = FileUtils.readFileToString(
					new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\techm\\ReqResp\\resources\\PostJsonPayLoadFile.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return payload;		
	}

}
