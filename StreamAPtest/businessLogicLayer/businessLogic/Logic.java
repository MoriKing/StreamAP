package businessLogic;

import java.util.ArrayList;
import java.util.List;

import businessLogic.pipelines.CertainProductLaunches;
import common.entities.Event;
import dataAccess.Access;

/**
 * This class collects the entities from the data access layer queue
 * and distributes them properly for the created pipeline and registered processors
 * 
 * @author Morteza Neishaboori
 *
 */
public class Logic {

	
	public static void collect()
	{
	
	Thread collector = new Thread("COLLECTOR"){
		public void run(){
			try {
				

				List<Event> inputStream = new ArrayList<Event>();
				//TODO: observer pattern to fill in the pipeline inputs
				//every pipeline should be subscribed to the entry data collector
				int i=0;
				while(i<100)
				{
					Event temp;
					inputStream.add(temp=Access.enrtyQueue.take());
					
					i++;
					
				}
				
				CertainProductLaunches myPipeline =
						new CertainProductLaunches("product-a","launch");
				
				List<Event> result = myPipeline.RunPipeline(inputStream);
				
				for (Event event : result) {
					System.out.println("event_id:"+event.event_id+
							" , application:"+ event.application+
							" , type:"+ event.type+
							" , source:"+event.source);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error in Logic class");
			}
		}
		
	};
	
	collector.start();
	}
	
	
}
