package com.database.testing.databasetesting.respository;

import com.database.testing.databasetesting.Models.Enterprise;
import com.database.testing.databasetesting.Models.RegisterUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends CrudRepository<Enterprise, Integer> {
}
