package dataAccess.jsonconverter;

import common.entities.*;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

// TODO: Make the class generic! find a way to pass the T.Class in stupid java generic capabilities! 

public class JsonConverter {
	
public JsonConverter() {
		
}

public Event fromJson(String json) throws JsonParseException
      , JsonMappingException, IOException{
	
Event javaObject = new ObjectMapper().readValue(json, Event.class);

return javaObject;
}


}
