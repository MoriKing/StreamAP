package dataAccess;

import dataAccess.bigfile.BigfileDaoFactory;

/**
 * 
 * Abstract factory class (factory of factories) which creates underlying data store specific data access objects.
 * 
 * @author morteza neishaboori
 *
 */
public class DaoFactories {

	  public static IDaoFactory GetFactory(String dataProvider)
      {
		// Return the requested DaoFactory
          switch (dataProvider)
          {
          case "BigFile":
        	  return new BigfileDaoFactory();
          
          default: return new BigfileDaoFactory();
          }
		
		  
      }
	
}
