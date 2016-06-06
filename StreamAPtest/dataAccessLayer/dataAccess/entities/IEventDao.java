package dataAccess.entities;


/**
 * Defines methods to access Events and is not dependent on the underlying data store technology
 * The concerete implementation of this Dao are implementation dependent 
 * @author morteza neishaboori
 *
 */
public interface IEventDao {
	
	/**
	 *  Start loading the events to the queue and hash map
	 */
	void startLoading();
	
}
