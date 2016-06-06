package businessLogic;

public interface IProcessor<T> {
	
	T Execute(T input);  
	
}
