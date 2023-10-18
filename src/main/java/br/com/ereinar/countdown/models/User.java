package br.com.ereinar.countdown.models;

import br.com.ereinar.countdown.dtos.UserDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "users")
@Table(name = "users")
@Data
public class User {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
//    private LocalDate birthDate;
//    private Set<User> friends;
//    private Set<Countdown> countdownsOwned;
//    private Set<Countdown> hypes;
//    private Set<Countdown> likes;

    public User() { }

    public User(UserDTO dto) {
        this.firstName = dto.firstName();
        this.lastName = dto.lastName();
        this.login = dto.login();
        this.password = dto.password();
    }
}
