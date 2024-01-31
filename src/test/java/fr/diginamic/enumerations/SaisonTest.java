/**
 * 
 */
package fr.diginamic.enumerations;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Louis-Valentin CHARVET
 *
 */
public class SaisonTest {

	@Test
	public void testValueOfLibelle() {

		// Test des cas nominaux
		Saison printemps = Saison.valueOfLibelle("Printemps");
		assertEquals(Saison.PRINTEMPS, printemps);

		Saison ete = Saison.valueOfLibelle("Eté");
		assertEquals(Saison.ETE, ete);

		// Test avec un libellé nul
		Saison libelleNul = Saison.valueOfLibelle(null);
		assertNull(libelleNul);

		// Test avec un libellé vide
		Saison libelleVide = Saison.valueOfLibelle("");
		assertNull(libelleVide);

		// Test avec un libellé contenant des espaces
		Saison libelleAvecEspaces = Saison.valueOfLibelle("   Hiver   ");
		assertEquals(Saison.HIVER, libelleAvecEspaces);

		// Test avec un libellé en majuscules
		Saison majuscules = Saison.valueOfLibelle("AUTOMNE");
		assertEquals(Saison.AUTOMNE, majuscules);

		// Test avec un libellé inconnu
		Saison inconnu = Saison.valueOfLibelle("Inconnu");
		assertNull(inconnu);
	}
}
