package mulcam.kb04.gifthub.GiftHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mulcam.kb04.gifthub.GiftHub.entity.Gift;

public interface GiftRepository extends JpaRepository<Gift, Integer> {

}