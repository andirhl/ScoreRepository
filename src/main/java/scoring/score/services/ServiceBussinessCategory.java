package scoring.score.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import scoring.score.models.BussinessCategory;
import scoring.score.repository.IBussinessCategoryRepository;

@Service
public class ServiceBussinessCategory {
	@Autowired
	IBussinessCategoryRepository repoBussCat;
	
	public List<BussinessCategory> getBussCat(){
		return repoBussCat.findAll();
	}
	
	public Optional<BussinessCategory> getByBussCatId(Integer bcId) {
		return repoBussCat.findById(bcId);
	}

	public BussinessCategory addupdateBussCat(BussinessCategory bussCat) {
		System.out.println(bussCat.getBctBussCategory()+" - "+bussCat.getBtcId());
		return repoBussCat.save(bussCat);
		//return "Submit Successfully";
	}
	
	public String deleteBussCat(Integer bcId) {
		repoBussCat.deleteById(bcId);
		return "Successfully Delete";
	}
	
	
}
