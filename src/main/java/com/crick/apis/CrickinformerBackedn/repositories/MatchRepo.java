package com.crick.apis.CrickinformerBackedn.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crick.apis.CrickinformerBackedn.entity.Match;

@Repository
public interface MatchRepo extends JpaRepository<Match,Integer>{
    
    Optional<Match> findByTeamHeading(String teamHeading);

    @Query(value="SELECT * FROM crickinformer.crick_matches WHERE textComplete=:textComplete;",nativeQuery=true)
    List<Match> findAllByTextComplete(@Param("textComplete")String textComplete);
}
