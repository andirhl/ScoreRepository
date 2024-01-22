package scoring.score.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scoring.score.models.BussinessProduct;
import scoring.score.models.MsTable;
import scoring.score.repository.IBussinessProductRepository;

@Service

public class ServiceBussinessProduct {
	@Autowired
	IBussinessProductRepository repoBussPro;
	
	public List<BussinessProduct> getBussProdList(){
		return repoBussPro.findAll();		
	}
	
	public Optional<BussinessProduct> getByBussProId(Integer bcId) {
		return repoBussPro.findById(bcId);
	}

	public BussinessProduct addupdateBussPro(BussinessProduct bussPro) {		
		return repoBussPro.save(bussPro);		
	}
	
	public String deleteBussCat(Integer bcId) {
		repoBussPro.deleteById(bcId);
		return "Successfully Delete";
	}

}
