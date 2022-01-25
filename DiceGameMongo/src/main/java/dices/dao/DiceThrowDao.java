package dices.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dices.entity.DiceThrow;

@Repository
@Transactional
public interface DiceThrowDao extends MongoRepository<DiceThrow,String> {

	List<DiceThrow> findAllByPlayerid(String playerid);
	
	public void deleteAllByPlayerid(String playerId);
	
}
