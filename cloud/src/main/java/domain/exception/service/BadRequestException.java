package domain.exception.service;

import domain.enumeration.ErrorSubCode;
import domain.exception.ApplicationException;
import domain.externalization.HttpStatusCode;

/**
 * Factory Class {@link BadRequestException} extends {@link ApplicationException}.
 * Provide factory methods to produce {@link BadRequestException}.
 * @author Mengchao Zhong
 */
public class BadRequestException extends ApplicationException {

	/**
	 * Default Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of {@link BadRequestException}.
	 * @param statusCode
	 * @param subCode
	 * @param serviceName
	 * @param errorMessage
	 * @param exception
	 */
	private BadRequestException(Integer statusCode, ErrorSubCode subCode,
			String serviceName, String errorMessage, Throwable exception) {
		super(statusCode, subCode, serviceName, errorMessage, exception);
	}

	/**
	 * Construct {@link BadRequestException} with HTTP Status 400.
	 * Error message:  Missing Parameter(s): ${serviceName}.
	 * @param subCode
	 * @param serviceName
	 * @param missingParameters
	 * @return {@link BadRequestException}
	 */
	public static BadRequestException missingParameter(ErrorSubCode subCode,
			String serviceName, String missingParameters) {
		return new BadRequestException(
				HttpStatusCode.BAD_REQUEST, 
				subCode, 
				serviceName, 
				String.format("Missing Parameter(s): %s".trim(), missingParameters), 
				new Throwable());
	}
}