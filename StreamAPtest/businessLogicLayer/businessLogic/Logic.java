package businessLogic;

import dataAccess.Access;

/**
 * This class collects the entities from the data access layer queue
 * and distributes them properly for the created pipline and registered processors
 * 
 * @author Morteza Neishaboori
 *
 */
public class Logic {

	
	public void collect()
	{
	
	Thread collector = new Thread("COLLECTOR"){
		public void run(){
			try {
				

				//TODO: observer pattern to fill in the pipleine inputs
				//every pipline should be subscribed to the entry data collector
				
				while(true)
				{
					
					Access.enrtyQueue.take();
					
					
					
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	};
	
	collector.start();
	}
	
	
}
