package scoring.score.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import scoring.score.models.BussinessProduct;

@Repository
public interface IBussinessProductRepository extends JpaRepository<BussinessProduct, Integer> {
}
