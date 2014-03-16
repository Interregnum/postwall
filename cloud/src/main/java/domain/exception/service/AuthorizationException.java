package domain.exception.service;

import domain.enumeration.ErrorSubCode;
import domain.exception.ApplicationException;
import domain.externalization.HttpStatusCode;


/**
 * Factory Class {@link AuthorizationException} extends {@link ApplicationException}.
 * Provide factory methods to produce {@link AuthorizationException}.
 * @author Mengchao Zhong
 */
public class AuthorizationException extends ApplicationException {

	/**
	 * Default Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of {@link AuthorizationException}.
	 * @param statusCode
	 * @param subCode
	 * @param serviceName
	 * @param errorMessage
	 * @param exception
	 */
	private AuthorizationException(Integer statusCode, ErrorSubCode subCode,
			String serviceName, String errorMessage, Throwable exception) {
		super(statusCode, subCode, serviceName, errorMessage, exception);
	}

	/**
	 * Construct {@link AuthorizationException} with HTTP Status 401.
	 * Error message:  Authentication failed on ${serviceName}.
	 * @param subCode
	 * @param serviceName
	 * @return {@link AuthorizationException}
	 */
	public static AuthorizationException unauthorized(ErrorSubCode subCode,
			String serviceName) {
		return new AuthorizationException(
				HttpStatusCode.UNAUTHORIZED,
				subCode, 
				serviceName, 
				String.format("Authentication failed on %s.", serviceName),
				new Throwable());
	}
	
	/**
	 * Construct {@link AuthorizationException} with HTTP Status 403.
	 * Error message:  Forbidden. ${serviceName} is NOT available to unauthorized user.
	 * @param subCode
	 * @param serviceName
	 * @return {@link AuthorizationException}
	 */
	public static AuthorizationException forbidden(ErrorSubCode subCode,
			String serviceName) {
		return new AuthorizationException(
				HttpStatusCode.FORBIDDEN,
				subCode, 
				serviceName, 
				String.format("Forbidden. %s is NOT available to unauthorized user.", serviceName),
				new Throwable());
	}
}
