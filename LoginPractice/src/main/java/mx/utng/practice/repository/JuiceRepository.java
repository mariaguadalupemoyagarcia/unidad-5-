package mx.utng.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Juice;

@Repository
public interface JuiceRepository extends JpaRepository<Juice,Long> {

}
