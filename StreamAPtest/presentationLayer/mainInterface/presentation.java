package mainInterface;

import java.io.IOException;

import businessLogic.Logic;
import dataAccess.Access;

public class presentation {
	
	 public static void main(String[] args) throws IOException {
	        
		Logic.collect();
		Access.EventDao.StartLoaderThread();
		
		System.out.println("end");
	    }
	 

}
