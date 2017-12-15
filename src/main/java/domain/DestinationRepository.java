package domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DestinationRepository {

	private Map<String, Destination> destinations;
	
	public DestinationRepository() {
		destinations = new HashMap<>();
	}
	
	public void addDestination(Destination destination) {
		destinations.put(destination.getName(), destination);
	}
	
	public Destination getDestination(String name) {
		return destinations.get(name);
	}
	
	public Collection<Destination> getAllDestinations() {
		return destinations.values();
	}
	
}
