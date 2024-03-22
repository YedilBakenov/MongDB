package kz.example.mongodb.service;


import kz.example.mongodb.model.User;
import kz.example.mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }

    public User getUserById(String id){
      return   userRepository.findById(id).orElse(null);
    }
}
