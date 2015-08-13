/**
 * 
 */
package com.ams;

import java.io.BufferedInputStream;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author adhotre
 *
 */
public class TestApp {
	
	@Test
	public void test(){		
		boolean testResult = false;
		try {
			// after business logic statements assert ...
			ClassLoader classLoader = getClass().getClassLoader();
			BufferedInputStream in = (BufferedInputStream) classLoader.getResource("config.properties").getContent();	
			Properties prop = new Properties();
			prop.load(in);
			
			testResult = Boolean.parseBoolean(prop.getProperty("test.assert"));
			
		} catch (Exception e) {
			// TODO: handle exception

		}
		Assert.assertTrue(testResult);
		
	}

}
