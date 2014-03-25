/**
 * 
 */
package dao.mapper;

import java.util.List;

import domain.Address;

/**
 * Interface of Address Mapper.
 * @author Mengchao Zhong
 */
public interface AddressMapper {
	
	List<Address> selectAllAddress();

}
