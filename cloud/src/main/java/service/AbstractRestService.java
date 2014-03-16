package service;

import java.util.Locale;
import java.util.Map;

import domain.exception.ApplicationException;

/**
 * Abstract ReST Service implements {@link ServiceInterface}.
 * Provide helper methods which can be used across all ReST Service classes.
 * @author Mengchao Zhong
 */
public abstract class AbstractRestService implements ServiceInterface {
	
	/**
	 * Check whether the service caller is authorized or not.
	 * @param privilegeLevel
	 * @throws ApplicationException
	 */
	protected void checkAuthorization(Integer privilegeLevel) throws ApplicationException {
		
	}
	
	/**
	 * Check if required field is presented in the {@link Map}.
	 * Append missing field to {@link StringBuilder} of error message.
	 * @param map
	 * @param key
	 * @param error
	 * @return {@link Void}
	 */
	protected Void checkRequiredField(final Map<String, Object> map, final String key, final StringBuilder error) {
		final Locale defaultLocale = Locale.getDefault();
		if(map.containsKey(key) 
				|| map.containsKey(key.toLowerCase(defaultLocale)) 
				|| map.containsKey(key.toUpperCase(defaultLocale))) {
			return null;
		}
		else {
			error.append(key + "\t");
			return null;
		}
	}
}
