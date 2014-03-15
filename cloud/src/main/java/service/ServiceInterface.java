package service;

import java.util.Map;

import domain.exception.ApplicationException;

/**
 * Interface of Service classes.
 * @author Mengchao Zhong
 */
public interface ServiceInterface {
	
	/**
	 * Validate the request map.
	 * @param requestMap
	 * @throws {@link ApplicationException}
	 */
	void validateRequest(Map<String, Object> requestMap) throws ApplicationException;
	
	/**
	 * Execute service business logics.
	 * @param requestMap
	 * @return {@link Map}
	 * @throws {@link ApplicationException}
	 */
	Map<String, Object> executeService(Map<String, Object> requestMap) throws ApplicationException;
	
	/**
	 * Translate the service response.
	 * @param responseMap
	 * @return {@link Map}
	 * @throws {@link ApplicationException}
	 */
	Map<String, Object> translateResponse(Map<String, Object> responseMap) throws ApplicationException;
	
	/**
	 * Set the privilege level that caller needs to have in order to call current service.
	 * @param privilegeLevel
	 * @return {@link null}
	 */
	void setPrivilegeLevel(Integer privilegeLevel);
}