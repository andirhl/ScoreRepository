package scoring.score.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import scoring.score.models.BussinessCategory;

@Repository
public interface IBussinessCategoryRepository extends JpaRepository<BussinessCategory, Integer> {
	
	@Query ("select s.bctBussCategory from BussinessCategory s where s.btcId=?1 and s.bctVisible='Y'")
	String getBussCatDesc (Integer id);
	//BussinessCategory findFirstByBtcIdAndBctVisible(Integer btcId, String visible);
	
//	@Query("select s from BussinessCategory s where s.bctVisible='Y'")
//    List<BussinessCategory> getBussCatList();

	// boleh baca2 soal derived query
	List<BussinessCategory> findByBctVisible(String value);
}
