package dataAccess.bigfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

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
		
		JsonConverter deserializer =new JsonConverter();
		
		FileInputStream inputStream = null;
		Scanner sc = null;
		try {
		    inputStream = new FileInputStream(Config.path);
		    sc = new Scanner(inputStream, "UTF-8");
		    while (sc.hasNextLine()) {
		        String record = sc.nextLine();
		        
		        Event eventRecord = deserializer.fromJson(record);
		        
		        System.out.println(eventRecord.event_id);
		        
		        break;
		    }
		    //Scanner suppresses exceptions
		    if (sc.ioException() != null) {
		        throw sc.ioException();
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		    if (inputStream != null) {
		        inputStream.close();
		    }
		    if (sc != null) {
		        sc.close();
		    }
		}
		
	}
	

}
