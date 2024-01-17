package scoring.score.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import scoring.score.models.BussinessCategory;
import scoring.score.repository.IBussinessCategoryRepository;






@Service
public class ServiceBussinessCategory {
	@Autowired
	IBussinessCategoryRepository repoBussCat;
	
	public List<BussinessCategory> getBussCat(){
		return repoBussCat.findAll();
	}

}
