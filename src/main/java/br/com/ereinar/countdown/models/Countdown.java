package br.com.ereinar.countdown.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name = "countdown")
@Table(name = "countdown")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Countdown {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String officialWebSiteURL;
    private LocalDateTime endOfCountdown;
    private LocalDateTime creationDateTime;
// private Set<Users> usersFollowing;
// private Set<Users> usersHyping;
// private Set<CountdownComment> comments;
}
