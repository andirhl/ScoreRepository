package scoring.score.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import scoring.score.models.MsTable;
import scoring.score.repository.IMsTableRepository;

@Service
public class ServiceMsTable {
	@Autowired
	IMsTableRepository repoMsTable;
	
	public List<MsTable> getMsTable(){
		return repoMsTable.findAll();
	}

	public Optional<MsTable> getByMsId(Integer msId) {
		return repoMsTable.findById(msId);
	}
	
	public MsTable addupdateMsTable(MsTable msTable) {
		//System.out.println(msTable.getMsTable()+" - "+msTable.getMstId());
		return repoMsTable.save(msTable);
		//return "Submit Successfully";
	}
	
	public String deleteMstTable(Integer msId) {
		repoMsTable.deleteById(msId);
		return "Successfully Update";
	}
}
