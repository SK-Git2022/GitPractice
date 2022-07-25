package com.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
		try {
			ee.eval(new FileReader("C:\\Users\\SHRIRAJ\\eclipse-workspace\\JavaNewFeatures\\JavaScriptFiles\\Hello.js"));			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

}
