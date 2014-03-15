package domain;

import java.io.Serializable;
import java.util.List;

/**
 * Domain Class {@link User}.
 * @author Mengchao Zhong
 */
public class User implements Serializable {

	/**
	 * List of phone numbers.
	 */
	private List<Phone> phones;
	
	/**
	 * List of addresses.
	 */
	private List<Address> addresses;
}
