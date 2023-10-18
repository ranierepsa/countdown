package br.com.ereinar.countdown.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "countdown")
@Table(name = "countdown")
@Data
public class Countdown {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String title;
    private String description;
    private String officialWebSiteURL;
    private LocalDateTime endOfCountdown;
    private LocalDateTime creationDateTime;
// private Set<Users> usersFollowing;
// private Set<Users> usersHyping;
// private Set<CountdownComment> comments;
}
