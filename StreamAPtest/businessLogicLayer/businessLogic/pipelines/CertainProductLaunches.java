package businessLogic.pipelines;

import java.util.List;

import businessLogic.Pipeline;
import businessLogic.processors.*;

import common.entities.*;


/**
 * 
 * The output of this pipeline are records with certain given product ID in a certain given time period
 * @author morteza neishaboori
 *
 */
public class CertainProductLaunches extends Pipeline<List<Event>> {
	
	public CertainProductLaunches(String product, String type) {

		
		this.Register(new FilterProduct(product)).Register(new FilterType(type));
	}

}
