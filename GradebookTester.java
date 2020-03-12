import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	
	GradeBook g1;

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		g1.addScore(90);
		g1.addScore(55);
		g1.addScore(84);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
	}

	@Test
	void testGetScoreSize() {
		assertEquals(5, g1.getScoreSize(), 0);
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("50.0 75.0 90.0 55.0 84.0 "));
	}

	@Test
	void testSum() {
		assertEquals(354, g1.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(50, g1.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(304, g1.finalScore(), 0);
	}

	@Test
	void testToString() {
		String start = "50.0 75.0 90.0 55.0 84.0 ";
		assertEquals(start, g1.toString());
	}

}
