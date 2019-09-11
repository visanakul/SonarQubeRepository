package com.sonar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import java.util.HashSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SonarQubeDemoApplicationTests {
	public static final Logger LOGGER = LoggerFactory.getLogger(SonarQubeDemoApplicationTests.class);

	@Test
	public void main() {
		SonarQubeDemoApplication.main(new String[] {});
		int a = 1;
		assertEquals(1, a);
	}

	@Test(expected = IllegalAccessException.class)
	public void privateConstructor() throws InstantiationException, IllegalAccessException {
		MyString ms = MyString.class.newInstance();
		assertNull(ms);
	}

	@Test
	public void reverseString() {
		String s = "hello";
		assertNotNull(s);
		String rev = MyString.reverse(s);
		assertNotNull(rev);
		assertEquals("olleh", rev);
		LOGGER.debug(rev);
	}

	@Test
	public void findPair() {
		int[] a = { 14, 25, 35, 54, 75, 86, 117, 208, 339 };
		int sum = 100;
		int c = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] + a[j]) == sum) {
					System.out.println(a[i] + "  " + a[j]);
				}
				c++;
			}
		}
		System.out.println("Total iterations : " + c);

		assertEquals(36, c);
		c = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			if (set.contains(sum - x)) {
				System.out.println(x + "  " + (sum - x));
			} else {
				set.add(x);
			}
			c++;
		}
		System.out.println("Total iterations : " + c);
		assertEquals(9, c);
		c = 0;
		int i = 0, j = a.length - 1;
		while (i < j) {
			if (a[i] + a[j] == sum) {
				System.out.println(a[i] + "  " + a[j]);
				i++;
				j--;
			} else if (a[i] + a[j] > sum) {
				j--;
			} else {
				i++;
			}
			c++;
		}
		System.out.println("Total iterations : " + c);
		assertEquals(6, c);
	}

}
