package kz.example.mongodb.repository;

import kz.example.mongodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends MongoRepository<User, String> {
}
