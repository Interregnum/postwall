package dao.mapper;

import java.util.List;

import domain.Credential;

/**
 * Interface of Credential Mapper.
 * @author Mengchao Zhong
 */
public interface CredentialMapper {

	Credential selectCredentialByUsername(String username);
	
	List<String> selectSecurityQuestionsByUsername(String username);
}
