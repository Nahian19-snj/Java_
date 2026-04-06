package com.example.fitnesstracker;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for RunRecord entities.
 * Spring Data JPA automatically provides the implementation.
 */
@Repository
public interface RunRecordRepository extends JpaRepository<RunRecord, Long> {

}
