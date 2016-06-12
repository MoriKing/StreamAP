package mainInterface;

import java.io.IOException;

import dataAccess.Access;

public class presentation {
	
	 public static void main(String[] args) {
	        
		try {
			Access.EventDao.startLoading();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    }
	 

}
