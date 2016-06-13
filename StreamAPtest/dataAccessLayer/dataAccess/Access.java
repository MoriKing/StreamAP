package dataAccess;

import java.util.concurrent.SynchronousQueue;

import dataAccess.entities.IEventDao;
import common.entities.*;

public class Access {

	public static SynchronousQueue<Event> enrtyQueue=new SynchronousQueue<Event>();
		
	private Access() {
				
	}
	
	//TODO: get the underlying file store method from config
	
	private static final IDaoFactory factory = DaoFactories.GetFactory("BigFile");
	
	public static IEventDao EventDao = factory.getEventDao();
	
}
