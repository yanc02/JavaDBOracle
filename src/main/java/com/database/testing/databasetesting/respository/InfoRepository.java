package com.database.testing.databasetesting.respository;

import com.database.testing.databasetesting.Models.RegisterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository("InfoRepository")
public interface InfoRepository extends CrudRepository<RegisterUser, Integer> {
//public interface InfoRepository extends JpaRepository<RegisterUser, Integer> {

//    UserEntity findByEmail(String email);
//    Optional<UserEntity> findByName(String username);

}