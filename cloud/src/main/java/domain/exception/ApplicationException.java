package domain.exception;

import java.io.Serializable;

import domain.enumeration.ErrorSubCode;

/**
 * Domain Class {@link ApplicationException}.
 * @author Mengchao Zhong
 */
public class ApplicationException extends Throwable	implements Serializable {

	/**
	 * Default Serial Version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * HTTP Status Code.
	 */
	private String statusCode;
	
	/**
	 * Exception Sub Code.
	 */
	private String subCode;
	
	/**
	 * Service Name.
	 */
	private String serviceName;
	
	/**
	 * Error Message.
	 */
	private String errorMessage;
	
	/**
	 * Exception Stack Trace.
	 */
	private String exceptionStackTrace;

	/**
	 * Constructor of {@link ApplicationException}.
	 */
	protected ApplicationException() {
		super();
	}

	/**
	 * Constructor of {@link ApplicationException}.
	 * @param statusCode
	 * @param subCode
	 * @param serviceName
	 * @param errorMessage
	 * @param exception
	 */
	protected ApplicationException(Integer statusCode, ErrorSubCode subCode,
			String serviceName, String errorMessage, Throwable exception) {
		super();
		this.statusCode = statusCode.toString();
		this.subCode = subCode.value();
		this.serviceName = serviceName;
		this.errorMessage = errorMessage;
		this.exceptionStackTrace = exception.getStackTrace().toString();
	}

	/**
	 * Getter of statusCode.
	 * @return @{link String}
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * Setter of statusCode.
	 * @param statusCode
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * Getter of subCode.
	 * @return @{link String}
	 */
	public String getSubCode() {
		return subCode;
	}

	/**
	 * Setter of subCode.
	 * @param subCode
	 */
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	/**
	 * Getter of serviceName.
	 * @return @{link String}
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * Setter of serviceName.
	 * @param serviceName
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * Getter of errorMessage.
	 * @return @{link String}
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Setter of errorMessage.
	 * @param errorMessage
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * Getter of exceptionStackTrace.
	 * @return @{link String}
	 */
	public String getExceptionStackTrace() {
		return exceptionStackTrace;
	}

	/**
	 * Setter of exceptionStackTrace.
	 * @param exceptionStackTrace
	 */
	public void setExceptionStackTrace(String exceptionStackTrace) {
		this.exceptionStackTrace = exceptionStackTrace;
	}
}