package service;

import java.util.Map;

public interface ServiceInterface {
	
	public Void validateRequest(Map<String, Object> requestMap);
	
	public Void checkAuthorization(Map<String, Object> requestMap);
	
	public Map<String, Object> executeService(Map<String, Object> requestMap);
	
	public Map<String, Object> translateResponse(Map<String, Object> responseMap);
	
}
