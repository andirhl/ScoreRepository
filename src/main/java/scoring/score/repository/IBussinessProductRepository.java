package scoring.score.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import scoring.score.models.BussinessProduct;

@Repository
public interface IBussinessProductRepository extends JpaRepository<BussinessProduct, Integer> {
	@Query("select concat(s.bprProdName,' (',bprPlatform,')') from BussinessProduct s where s.bprId=?1 and s.bprVisible='Y'")
	public String getBussProdDesc(Integer bpId);
	
    List<BussinessProduct> findByBprBctIdAndBprVisible (Integer BprBctI,String visible  );
    
    List<BussinessProduct> findByBprVisible (String vis);
}
