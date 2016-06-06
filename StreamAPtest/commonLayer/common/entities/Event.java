package common.entities;

public class Event {

	

	/* 
	 * 
	 * 
	 * type - describes what kind of event occured (launch, purchase, user_interaction, etc)
Depending on the type, certain other packages might be available. If for example type is "purchase", there is a "purchase" package containg information about the actual purchase.
source - the name of the product. This is obfuscated to show product-a, product-b, etc.
event_id - a unique ID for this particular event
application - a package containing information about the application
time - a package containing information about when the event was sent (by the device) and when it was received
device - a package containing information about the device.
device.device_id - an identifier for this device. This can be used to find events from the same device
sender_info - a package containing information about the sending device.
sender_info.geo.country - the country where the event originated from
sender_info.geo.ll - the longitude and latitude where the event originated from
	 */
	
}
