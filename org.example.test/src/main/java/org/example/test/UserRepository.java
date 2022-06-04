package org.example.test;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    public User findByFirstName(String firstName);
    public List<User> findByEmail(String email);
    Long deletePersonByfirstName(String firstName);

}