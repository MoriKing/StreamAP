package dataAccess.bigfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

import dataAccess.Access;
import dataAccess.entities.IEventDao;
import dataAccess.jsonconverter.JsonConverter;

import common.configuration.Config;
import common.entities.*;

/**
 * The actual implementation of loading events
 * @author morteza neishaboori
 *
 */
public class BigfileEventDao implements IEventDao {

	@Override
	public void startLoading() throws IOException {
		
		int recordTotal=0;
		int failedRecords=0;
		JsonConverter deserializer =new JsonConverter();
		
		FileInputStream inputStream = null;
		Scanner sc = null;
		try {
		    inputStream = new FileInputStream(Config.path);
		    sc = new Scanner(inputStream, "UTF-8");
		    while (sc.hasNextLine()) {
		        String record = sc.nextLine();
		        		        
		        try {
		        	Event eventRecord = deserializer.fromJson(record);
		        	//Access.enrtyQueue.put(eventRecord);
		        	System.out.println(record);
		        	
				} catch (Exception e) {
					failedRecords++;
			        //TODO: Discarding the failed records to a separate discarded file  
					System.out.println("error");
				}
		                
		      
		      recordTotal++;
		      
		      System.out.println(failedRecords + " records decoding from JSON failed out of :" + recordTotal);
		    }
		    //Scanner suppresses exceptions
		    if (sc.ioException() != null) {
		        throw sc.ioException();
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println(failedRecords + " records failed out of :" + recordTotal);
		    if (inputStream != null) {
		        inputStream.close();
		    }
		    if (sc != null) {
		        sc.close();
		    }
		}
		
	}
	

}
