package scoring.score.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import scoring.score.models.MsTableColumn;
import scoring.score.models.MsTableColumnCompKey;
import scoring.score.repository.IMsTableColumnRepository;

@Service
public class ServiceMsTableColumn {
	@Autowired
	IMsTableColumnRepository repoMsTableColumn;
	
	public List<MsTableColumn> getMsTableColumn(){
		return repoMsTableColumn.findAll();
	}

	
	
	public MsTableColumn addupdateMsTableColumn(MsTableColumn msTableColumn) {
		//System.out.println(msTable.getMsTable()+" - "+msTable.getMstId());
		return repoMsTableColumn.save(msTableColumn);
		//return "Submit Successfully";
	}
	
	public String deleteMstTableColumn(MsTableColumnCompKey msTableColumnCompKey) {
		repoMsTableColumn.deleteById(msTableColumnCompKey );
		return "Successfully Update";
	}
	
	public List<MsTableColumn> findByMstcIdAndMstcMsId(Integer mstcId, Integer mstcmsId) {
		return repoMsTableColumn.findByMstcIdAndMstcmstId(mstcId, mstcmsId);
	}

}
