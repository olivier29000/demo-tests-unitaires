package dev.utils;

import junit.framework.Assert;
import junit.framework.TestCase;

public class StringUtilsTest extends TestCase {

	public void testLevenshteinDistance1() {
		StringUtils stringUtils = new StringUtils();

		Assert.assertEquals(1, stringUtils.levenshteinDistance("chats", "chat"));

	}

	public void testLevenshteinDistance2() {
		StringUtils stringUtils = new StringUtils();

		Assert.assertEquals(1, stringUtils.levenshteinDistance("aviron", "avion"));

	}

	public void testLevenshteinDistance3() {
		StringUtils stringUtils = new StringUtils();

		Assert.assertEquals(2, stringUtils.levenshteinDistance("distance", "instance"));

	}

	public void testLevenshteinDistance4() {
		StringUtils stringUtils = new StringUtils();

		Assert.assertEquals(5, stringUtils.levenshteinDistance("", "Chine"));

	}

	public void testLevenshteinDistance5() {
		StringUtils stringUtils = new StringUtils();

		Assert.assertEquals(5, stringUtils.levenshteinDistance(null, "Chine"));
	}

	public void testLevenshteinDistance6() {
		StringUtils stringUtils = new StringUtils();

		Assert.assertEquals(0, stringUtils.levenshteinDistance(null, null));
	}

}
