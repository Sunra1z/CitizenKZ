package com.syrnikter.CitizenKZ.repositories;

import com.syrnikter.CitizenKZ.models.kzcitizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface CitizenRepos extends JpaRepository<kzcitizen, Long> {
    @Query(value = "SELECT * from citizen_info where iin like %:keyword%", nativeQuery = true)
    List<kzcitizen> findByKeyword(@Param("keyword") String keyword);
}
