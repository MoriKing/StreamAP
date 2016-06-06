package dataAccess.bigfile;

import dataAccess.IDaoFactory;
import dataAccess.entities.IEventDao;

/**
 * Big File specific factory that creates Big File specific data access objects.
 * Here means getting the events from Big File
 * @author morteza neishaboori
 *
 */
public class BigfileDaoFactory implements IDaoFactory {

	
	@Override
	public IEventDao getEventDao() {
		
		return new BigfileEventDao();
	}
	 


}
