package oia.mates.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import oia.mates.RondaMates;

class MatesTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void patoñatoTest() {
		int nroOIAs = 5;
		int[] arrayAis = new int[] { 1, 2, 3, 4 };
		RondaMates r = new RondaMates(nroOIAs, arrayAis);
		r.resolver();
		System.out.println(r.getResultado());

	}

	@Test
	void patoñatoTest1() {
		int nroOIAs = 4;
		int[] arrayAis = new int[] { 1, 1, 1 };
		RondaMates r = new RondaMates(nroOIAs, arrayAis);
		r.resolver();
		System.out.println(r.getResultado());

	}
	
	@Test
	void patoñatoTest2() {
		int nroOIAs = 5;
		int[] arrayAis = new int[] { 4, 3, 2,1 };
		RondaMates r = new RondaMates(nroOIAs, arrayAis);
		r.resolver();
		System.out.println(r.getResultado());
	}

}
