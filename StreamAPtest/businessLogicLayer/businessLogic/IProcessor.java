package businessLogic;

public interface IProcessor<T> {
	
	void Execute(T input);  
	
}
