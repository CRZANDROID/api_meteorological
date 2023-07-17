package com.crzindustries.estacionmetereologica.repositories;

import com.crzindustries.estacionmetereologica.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
