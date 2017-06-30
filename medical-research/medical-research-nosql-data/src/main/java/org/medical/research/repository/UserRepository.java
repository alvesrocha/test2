package org.medical.research.repository;

import java.util.List;

import org.medical.research.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

	public User findByUsername(String username);
	
	public List<User> findAll();
}
