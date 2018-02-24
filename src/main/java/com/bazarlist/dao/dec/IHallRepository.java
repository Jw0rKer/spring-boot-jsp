/**
 * 
 */
package com.bazarlist.dao.dec;

import java.util.List;

/**
 * @author JK
 *
 */
public interface IHallRepository extends IGenericRepository {

	Long count(List<String> phone, String hallName);

}
