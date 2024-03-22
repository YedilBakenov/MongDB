package kz.example.mongodb.repository;

import kz.example.mongodb.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface StudentRepository extends MongoRepository<Student, String> {
}
