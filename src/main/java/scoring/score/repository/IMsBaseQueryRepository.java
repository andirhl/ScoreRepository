package scoring.score.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import scoring.score.models.MsBaseQuery;

@Repository
public interface IMsBaseQueryRepository extends JpaRepository<MsBaseQuery, Integer> {
	
	@Query("select s.mbqName from MsBaseQuery s where s.mbqId=?1")
	public String getQueryName(Integer mbqId);
	
	@Query("select s.mbqQuery from MsBaseQuery s where s.mbqId=?1")
	public String getQueryDesc(Integer mbqId);
	
	List<MsBaseQuery> findByMbqVisible (String vis);

}
