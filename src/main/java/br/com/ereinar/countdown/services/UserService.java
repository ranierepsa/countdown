package br.com.ereinar.countdown.services;

import br.com.ereinar.countdown.dtos.UserDTO;
import br.com.ereinar.countdown.models.User;
import br.com.ereinar.countdown.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User findUserById(UUID id) throws Exception {
        return userRepository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    public User createUser(UserDTO dto) {
        User user = new User(dto);
        return this.userRepository.saveAndFlush(user);
    }

    public Set<User> findAllUsers() {
        return this.userRepository.findAllDistinct();
    }

    public User updateUser(UUID userId, UserDTO dto) {
        User user = new User(dto);
        user.setId(userId);
        return this.userRepository.save(user);
    }

    public void deleteUser(UUID id) throws Exception{
        User user = this.findUserById(id);
        this.userRepository.delete(user);
    }
}
