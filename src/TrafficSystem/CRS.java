package TrafficSystem;

import java.io.*;
import java.util.*;

import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.xml.sax.helpers.DefaultHandler;

public class CRS {
	
	//File file;
	
	public CRS() {
		//file = new File("demo.txt");

	}
	
	public boolean isConnected() {
		return true;
		
	}

	public File getMapFile() {
		
		try {
		File file = new File("demo.map"); 
		return file;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
