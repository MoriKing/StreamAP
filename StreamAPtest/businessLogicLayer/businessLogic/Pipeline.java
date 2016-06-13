package businessLogic;

import java.util.ArrayList;
import java.util.List;


/**
 * Main class for our pipeline
 * 
 * @author morteza neishaboori
 *
 * @param <T>
 */
public abstract class Pipeline<T>  
{  
    private final List<IProcessor<T>> processors = new ArrayList<IProcessor<T>>();  

    /**
     * Registers the designed processors
     * @param processor
     * @return the instance of the class
     */
    public Pipeline<T> Register(IProcessor<T> processor)  
    {  
        this.processors.add(processor);  
        return this;  
    }  

   
    /**
     * Executing all the registered processors in the pipeline
     * @param inputStream
     * @return
     */
    public T RunPipeline(T inputStream)  
    {  
    	T output = inputStream;
    	
    	for (IProcessor<T> processor: processors) {
    		
    		output=processor.Execute(output);
		}
    	
    	return output;
    	
        
    }  
    
    
}  