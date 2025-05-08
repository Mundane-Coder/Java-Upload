package com.nie.LostAndFound.RepositoryClasses;

import com.nie.LostAndFound.EntityClasses.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {
}
