package mulcam.kb04.gifthub.GiftHub.service;

import org.springframework.stereotype.Service;

import mulcam.kb04.gifthub.GiftHub.dto.StoreDto;
import mulcam.kb04.gifthub.GiftHub.entity.Store;

@Service
public interface LoginService {
	public Store save(StoreDto storeDto);
}