package app;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import domain.Destination;
import domain.DestinationRepository;

@RestController
public class DestinationController {
	
	private DestinationRepository repo;
	
	public DestinationController() {
		repo = new DestinationRepository();
		Destination Leuven = new Destination("Leuven", "3000", "Vlaams-Brabant");
		Destination Antwerpen = new Destination("Antwerpen", "2000", "Antwerpen");
		Destination Gent = new Destination("Gent", "9000", "Oost-Vlaanderen");
		repo.addDestination(Leuven);		
		repo.addDestination(Antwerpen);
		repo.addDestination(Gent);
	}

	@RequestMapping(value = "/info")
	public @ResponseBody String getInfo() {
		return "Returns information about a given destination.";
	}
	
	@RequestMapping(value = "/destination")
	public @ResponseBody Destination getDestination(@RequestParam(value = "name") String name) {
		return repo.getDestination(name);
	}
	
	@RequestMapping(value = "/all")
	public @ResponseBody Collection<Destination> getAllDestinations() {
		return repo.getAllDestinations();
	}

}
