package com.syrnikter.CitizenKZ.repositories;

import com.syrnikter.CitizenKZ.models.kzcitizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CitizenRepos extends CrudRepository<kzcitizen, Long> {
}
