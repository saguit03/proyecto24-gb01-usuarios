package es.unex.asee.gb01.contents.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.unex.asee.gb01.contents.Entities.UserEntity;
import es.unex.asee.gb01.contents.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        }

    public UserEntity findByUsername(String username){
        return userRepository.findByUsername(username);
    }

}
