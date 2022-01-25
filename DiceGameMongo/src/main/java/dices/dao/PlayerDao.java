package dices.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dices.entity.Player;

@Repository
@Transactional
public interface PlayerDao extends MongoRepository<Player,String> {
	
	List<Player> findAllByName(String name);
	
	Optional<Player> findByName(String name);

}
