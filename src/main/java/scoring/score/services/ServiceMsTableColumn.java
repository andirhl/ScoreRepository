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
import scoring.score.repository.IMsTableColumnRepository;

@Service
public class ServiceMsTableColumn {
	@Autowired
	IMsTableColumnRepository repoMsTableColumn;
	
	public List<MsTableColumn> getMsTableColumn(){
		return repoMsTableColumn.findAll();
	}

	public Optional<MsTableColumn> getByMstcId(Integer mstcId) {
		return repoMsTableColumn.findById(mstcId);
	}
	
	public MsTableColumn addupdateMsTableColumn(MsTableColumn msTableColumn) {
		//System.out.println(msTable.getMsTable()+" - "+msTable.getMstId());
		return repoMsTableColumn.save(msTableColumn);
		//return "Submit Successfully";
	}
	
	public String deleteMstTableColumn(Integer mstcId) {
		repoMsTableColumn.deleteById(mstcId);
		return "Successfully Update";
	}

	
	public Optional<MsTableColumn> getByMstcMsId(Integer mstcmsId) {
		return repoMsTableColumn.findById(mstcmsId);
	}

}
