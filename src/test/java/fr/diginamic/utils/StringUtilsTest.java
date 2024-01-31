/**
 * 
 */
package fr.diginamic.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Louis-Valentin CHARVET
 *
 */
public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance() {
		// Cas nominaux
		assertEquals(2, StringUtils.levenshteinDistance("Chine", "Chien"));
		assertEquals(1, StringUtils.levenshteinDistance("Vienne", "Sienne"));

		// Tests de robustesse avec des paramètres null
		assertThrows(IllegalArgumentException.class, () -> {
			StringUtils.levenshteinDistance("hello", null);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			StringUtils.levenshteinDistance(null, "world");
		});

		assertThrows(IllegalArgumentException.class, () -> {
			StringUtils.levenshteinDistance(null, null);
		});
	}

}
