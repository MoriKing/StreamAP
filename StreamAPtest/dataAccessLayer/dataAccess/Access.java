package dataAccess;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import dataAccess.entities.IEventDao;
import common.entities.*;

public class Access {

	
	public static Map<String,Event> localCacheTable = Collections.synchronizedMap(new HashMap<String, Event>());
	//a synchronized queue here also: TODO
	
	private Access() {
				
	}
	
	//get the underlying file store from config : TODO
	
	private static final IDaoFactory factory = DaoFactories.GetFactory("BigFile");
	
	public static IEventDao EventDao = factory.getEventDao();
	
}
