package edu.nus.joozservice.repository;

import edu.nus.joozservice.entity.QrStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QrStatusRepository extends JpaRepository<QrStatusEntity, Integer> {
    List<QrStatusEntity> findAllByCustomerID(int customerId);
}
