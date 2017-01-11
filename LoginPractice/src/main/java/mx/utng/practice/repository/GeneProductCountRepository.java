package mx.utng.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.GeneProductCount;



@Repository
public interface GeneProductCountRepository extends JpaRepository<GeneProductCount,Long> {

}
