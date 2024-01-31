/**
 * 
 */
package fr.diginamic.immobilier.entites;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Louis-Valentin CHARVET
 *
 */
public class MaisonTest {

	private Maison maison;

	@Before
	public void setUp() {
		maison = new Maison();
	}

	@Test
	public void testAjouterPiece() {
		// Création de nouvelles pièces
		Piece piece1 = new Chambre(1, 25.0);
		Piece piece2 = new Salon(2, 20.0);

		// Ajout des pièces à la maison
		maison.ajouterPiece(piece1);
		maison.ajouterPiece(piece2);
		// Cas de test avec une pièce null
		maison.ajouterPiece(null);

		// Vérification du nombre de pièces après ajout
		assertEquals(2, maison.nbPieces());

		// Vérification que les pièces ajoutées sont celles attendues
		assertEquals(piece1, maison.getPieces()[0]);
		assertEquals(piece2, maison.getPieces()[1]);
	}

	@Test
	public void testSuperficieEtage() {
		// Création de nouvelles pièces
		Piece piece1 = new Chambre(1, 25.0);
		Piece piece2 = new Salon(2, 20.0);

		// Ajout des pièces à la maison
		maison.ajouterPiece(piece1);
		maison.ajouterPiece(piece2);

		// Vérification de la superficie de l'étage 1
		assertEquals(25.0, maison.superficieEtage(1), 0.001);

		// Vérification de la superficie de l'étage 2
		assertEquals(20.0, maison.superficieEtage(2), 0.001);

		// Vérification de la superficie d'un étage inexistant
		assertEquals(0.0, maison.superficieEtage(3), 0.001);
	}

	@Test
	public void testSuperficieTypePiece() {
		// Création de nouvelles pièces
		Piece piece1 = new Chambre(1, 25.0);
		Piece piece2 = new Salon(2, 20.0);
		Piece piece3 = new Cuisine(1, 15.0);

		// Ajout des pièces à la maison
		maison.ajouterPiece(piece1);
		maison.ajouterPiece(piece2);
		maison.ajouterPiece(piece3);

		// Vérification de la superficie des pièces de type "Chambre"
		assertEquals(25.0, maison.superficieTypePiece("Chambre"), 0.001);

		// Vérification de la superficie des pièces de type inexistant
		assertEquals(0.0, maison.superficieTypePiece("Salle de bain"), 0.001);

		// Vérification de la superficie des pièces avec type null
		assertEquals(0.0, maison.superficieTypePiece(null), 0.001);
	}

	@Test
	public void testCalculerSurface() {
		// Création de nouvelles pièces
		Piece piece1 = new Chambre(1, 25.0);
		Piece piece2 = new Salon(2, 20.0);
		Piece piece3 = new Cuisine(1, 15.0);

		// Ajout des pièces à la maison
		maison.ajouterPiece(piece1);
		maison.ajouterPiece(piece2);
		maison.ajouterPiece(piece3);

		// Vérification de la superficie totale
		assertEquals(60.0, maison.calculerSurface(), 0.001);
	}

}
