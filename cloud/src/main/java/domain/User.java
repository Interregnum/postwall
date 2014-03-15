package domain;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
	
	private List<Phone> phones;
	
	private List<Address> addresses;
}
