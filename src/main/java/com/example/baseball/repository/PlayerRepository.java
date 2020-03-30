package com.example.baseball.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.baseball.domain.Player;


/**
 *
 *追加したい操作があればここに追加していく
 *
 **/
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
