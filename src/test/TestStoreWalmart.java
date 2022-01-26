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
public class TestStoreWalmart {
	Store walmart = new Store("Walmart", 3322, 240);
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEmployeeHire() {
		walmart.hire(10);
		Assert.assertEquals(walmart.getEmployeeAmount(), 250);
	}
	@Test
	public void testMegaTrue() {
		Assert.assertTrue(walmart.isMega());
	}

}
