package scoring.score.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import scoring.score.models.BussinessCategory;

@Repository
public interface IBussinessCategoryRepository extends JpaRepository<BussinessCategory, Integer> {
	
	@Query ("select s.bctBussCategory from BussinessCategory s where btcId=?1")
	public String getBussCatDesc (Integer id);

}
