package scoring.score.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import scoring.score.models.MsTable;
import scoring.score.models.MsTableColumn;

@Repository
public interface IMsTableColumnRepository extends JpaRepository<MsTableColumn, Integer> {
	
	@Query
	("select s from MsTableColumn s where s.mstcId=1 and s.mstcmstId=2")
	public List <MsTableColumn> findByMstcIdAndMstcMsId(Integer mstcId, Integer mstcmstId);

}
