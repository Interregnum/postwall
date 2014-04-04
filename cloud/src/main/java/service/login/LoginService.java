package service.login;

import java.util.Map;

import javax.annotation.Resource;

import service.AbstractRestService;
import dao.mapper.CredentialMapper;
import domain.Credential;
import domain.enumeration.ErrorSubCode;
import domain.exception.ApplicationException;
import domain.exception.service.AuthorizationException;

/**
 * ReST Service - Login.
 * @author Mengchao Zhong
 */
public class LoginService extends AbstractRestService {

	private Integer privilegeLevel;
	
	@Resource
	private CredentialMapper credentialMapper;
	
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
		String username = (String) requestMap.get("username");
		String password = (String) requestMap.get("password");
		Credential credential = credentialMapper.selectCredentialByUsername(username);
		if(credential != null && password.equals(credential.getPassword())) {
			
		}
		else {
			throw AuthorizationException.unauthorized(
					ErrorSubCode.USER_NOT_AUTHENTICATED, LoginService.class.getName());
		}
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
