package br.com.ereinar.countdown.repositories;

import br.com.ereinar.countdown.models.Countdown;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountdownRepository extends JpaRepository<Countdown, Long> {

}
