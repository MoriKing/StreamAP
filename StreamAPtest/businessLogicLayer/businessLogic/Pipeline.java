package businessLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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
     * Executing all the attached processors in a pipeline manner
     * @param inputStream
     * @return
     */
    public void RunPipeline(T inputStream)  
    {  
   	   	
    	processors.forEach(f -> f.Execute(inputStream));
        
    }  
}  