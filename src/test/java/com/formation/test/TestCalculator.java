package com.formation.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.formation.Calculateur;

public class TestCalculator {
	@Test
	public void testAdd() {
		assertEquals(13, Calculateur.add(7, 6));
	}
	@Test
	public void testMultiplay() {
		assertEquals(35, Calculateur.multiply(7, 5));
	}
}
