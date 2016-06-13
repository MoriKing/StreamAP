package businessLogic.processors;

import java.util.List;
import java.util.stream.Collectors;

import businessLogic.IProcessor;
import common.entities.Event;

public class FilterType implements IProcessor<List<Event>>{

	private String type;
	
	
	/**
	 * insert the product you want to filter as source
	 * @param source
	 */
	public FilterType(String type) {
		this.type=type;
	}
	
	@Override
	public List<Event> Execute(List<Event> input) {

		return input.stream().filter(event -> event.type==this.type)
				.collect(Collectors.toList());

	}

	
}
