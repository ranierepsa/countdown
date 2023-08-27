package br.com.ereinar.countdown.controllers;

import br.com.ereinar.countdown.dtos.UserDTO;
import br.com.ereinar.countdown.models.User;
import br.com.ereinar.countdown.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController()
@RequestMapping("/users")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(userService.findUserById(id), HttpStatus.FOUND);
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody UserDTO user) {
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<Set<User>> findAllUsers() {
        return new ResponseEntity<>(this.userService.findAllUsers(), HttpStatus.FOUND);
    }
}
