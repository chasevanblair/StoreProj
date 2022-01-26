/**
 * @author chase - Chase Van Blair
 * CIS175 - Fall 2021
 * Jan 26, 2022
 */
package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import model.Store;

/**
 * @author chase
 *
 */
public class TestStoreLocal {
	Store local = new Store("Joe's grocery", 0000, 25);
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMegaFail() {
		Assert.assertFalse(local.isMega());
	}
	@Test
	public void testNameFail() {
		Assert.assertNotEquals("Joes grocery", local.getName());
	}

}
