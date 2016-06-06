package dataAccess;

import dataAccess.entities.IEventDao;

/**
 * Abstract factory interface for creating data access objects.
 * 
 */
public interface IDaoFactory {

	public IEventDao getEventDao();
	
}
