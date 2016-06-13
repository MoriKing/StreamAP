package businessLogic.processors;

import java.util.List;
import java.util.stream.Collectors;

import businessLogic.IProcessor;
import common.entities.*;


public class FilterProduct implements IProcessor<List<Event>>{

	private String source;
	
	
	/**
	 * insert the product you want to filter as source
	 * @param source
	 */
	public FilterProduct(String source) {
		this.source=source;
	}
	
	@Override
	public List<Event> Execute(List<Event> input) {

		return input.stream().filter(event -> event.source==this.source)
				.collect(Collectors.toList());

	}

	
}
