package scoring.score.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import scoring.score.models.BussinessProduct;

@Repository
public interface IBussinessProductRepository extends JpaRepository<BussinessProduct, Integer> {
	@Query("select s.bprProdName from BussinessProduct s where s.bprId=?1 ")
	public String getBussProdDesc(Integer bpId);
}
