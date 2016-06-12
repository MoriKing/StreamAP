package dataAccess.bigfile;

import dataAccess.entities.IEventDao;


/**
 * The actual implementation of loading events
 * @author morteza neishaboori
 *
 */
public class BigfileEventDao implements IEventDao {

	@Override
	public void startLoading() {
		// TODO Auto-generated method stub
		
		
	/*	FileInputStream inputStream = null;
		Scanner sc = null;
		try {
		    inputStream = new FileInputStream(path);
		    sc = new Scanner(inputStream, "UTF-8");
		    while (sc.hasNextLine()) {
		        String line = sc.nextLine();
		        // System.out.println(line);
		    }
		    // note that Scanner suppresses exceptions
		    if (sc.ioException() != null) {
		        throw sc.ioException();
		    }
		} finally {
		    if (inputStream != null) {
		        inputStream.close();
		    }
		    if (sc != null) {
		        sc.close();
		    }
		}*/
		
	}
	

}
