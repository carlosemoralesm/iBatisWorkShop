package cz.novoj.ibatis;

import cz.novoj.ibatis.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Description
 *
 * @author Jan Novotný, FG Forrest a.s. (c) 2007
 * @version $Id: $
 */
public class UserManagerTest extends AbstractBaseTest {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void testGetUserById() throws Exception {
		User user = userMapper.getUserById(1);
		assertNotNull(user);
		assertEquals("novoj", user.getLogin());
	}
}
