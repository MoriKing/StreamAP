package dataAccess;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import dataAccess.entities.IEventDao;

public class Access {

	
	public static Map<String,String> localCacheTable = Collections.synchronizedMap(new HashMap<String, String>());
	//a synchronized queue here also: TODO
	
	private Access() {
				
	}
	
	//get the underlying file store from config : TODO
	
	private static final IDaoFactory factory = DaoFactories.GetFactory("BigFile");
	
	public static IEventDao EventDao = factory.getEventDao();
	
}
