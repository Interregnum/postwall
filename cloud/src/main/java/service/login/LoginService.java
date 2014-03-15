package service.login;

import java.util.Map;

import domain.exception.ApplicationException;

import service.AbstractRestService;

/**
 * ReST Service - Login.
 * @author Mengchao Zhong
 */
public class LoginService extends AbstractRestService {

	private Integer privilegeLevel;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void validateRequest(Map<String, Object> requestMap) throws ApplicationException {
		StringBuilder validationErrors = new StringBuilder();
		checkRequiredField(requestMap, "username", validationErrors);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String, Object> executeService(Map<String, Object> requestMap) throws ApplicationException {
		checkAuthorization(privilegeLevel);
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String, Object> translateResponse(Map<String, Object> responseMap) throws ApplicationException {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setPrivilegeLevel(Integer privilegeLevel) {
		this.privilegeLevel = privilegeLevel;
	}
}
