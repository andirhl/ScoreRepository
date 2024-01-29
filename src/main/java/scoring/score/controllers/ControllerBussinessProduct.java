package scoring.score.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import scoring.score.models.BussinessProduct;
import scoring.score.services.ServiceBussinessProduct;


@RestController
public class ControllerBussinessProduct {
	@Autowired
	ServiceBussinessProduct servBussPro;
	
	@GetMapping("/getBussProdList")	
	public List<BussinessProduct> getBussProdList(){
		return servBussPro.getBussProdList();		
	}
	
	@GetMapping("/getbussproid")
	public Optional<BussinessProduct> getByBussProId(Integer bpId) {
		return servBussPro.getByBussProId(bpId);
	}
	
	@PostMapping("/submitbusspro")
	@Transactional
	public String addupdateBussPro(@RequestBody  BussinessProduct bussPro) {		
		BussinessProduct bcat=servBussPro.addupdateBussPro(bussPro);
		return "Submit Successfully";
	}
	
	@DeleteMapping("/deletebusspro")
	public String deleteBussPro(Integer bpId) {
		return servBussPro.deleteBussCat(bpId);
	}
	
	@GetMapping("/getbussproname")
	public String getBussCatName(Integer bpId) {
		return servBussPro.getBussCatName(bpId);
	}

}
