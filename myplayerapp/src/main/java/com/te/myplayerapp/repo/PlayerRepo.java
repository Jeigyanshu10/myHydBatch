package com.te.myplayerapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.myplayerapp.dto.Player;

@Repository
public interface PlayerRepo extends CrudRepository<Player, Integer>{

}
