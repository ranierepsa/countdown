package br.com.ereinar.countdown.repositories;

import br.com.ereinar.countdown.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    @Query(value = "SELECT DISTINCT user FROM users user")
    public Set<User> findAllDistinct();
}
