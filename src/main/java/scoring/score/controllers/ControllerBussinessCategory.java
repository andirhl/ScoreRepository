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
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import scoring.score.models.BussinessCategory;
import scoring.score.services.ServiceBussinessCategory;

@RestController
public class ControllerBussinessCategory {
	@Autowired
	ServiceBussinessCategory servBussCat;
	
	@GetMapping("/getbusscatlist")
	public List<BussinessCategory> getBussCat(){
		return servBussCat.getBussCat();
	}
	
	@GetMapping("/getbusscatid")
	public Optional<BussinessCategory> getByBussCatId(Integer bcId) {
		return servBussCat.getByBussCatId(bcId);
	}
	
	@PostMapping("/submitBussCat")
	@Transactional
	public String addupdateBussCat(@RequestBody  BussinessCategory bussCat) {
		//System.out.println("begi........n :"+bussCat.getBctBussCategory());
		BussinessCategory bcat=servBussCat.addupdateBussCat(bussCat);

		//System.out.println("end.....:"+bcat.getBtcId());
		return "Submit Successfully";

		//System.out.println("end.....:"+bcat.getBtcId());
	//	return "Update Successfully";

	}
	
	
	public String deleteBussCat(Integer bcId) {
		return servBussCat.deleteBussCat(bcId);
	}
	
	@GetMapping("/getbusscatname")
	public String getBussCatName(Integer bcId) {
		return servBussCat.getBussCatName(bcId);
	}
		

}
