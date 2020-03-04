import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
GradeBook t1,t2;
	@BeforeEach
	void setUp() throws Exception {
		t1 = new GradeBook(5);
		t2 = new GradeBook(5);
		
		t1.addScore(68);
		t1.addScore(45);
		t1.addScore(5);
		t1.addScore(28);
		t1.addScore(19);
		
		t2.addScore(10);
		t2.addScore(99);
		t2.addScore(24);
		t2.addScore(56);
		t2.addScore(11);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		t1=t2=null;
	}
		
	@Test
	void testAddScore() {
		assertTrue (t1.toString().equals("68.0 45.0 5.0 28.0 19.0 "));
		assertTrue (t2.toString().equals("10.0 99.0 24.0 56.0 11.0 "));
		
		 assertEquals(5,t1.getScoreSize());
		 assertEquals(5,t2.getScoreSize());
		
		
	}

	@Test
	void testSum() {
		assertEquals(165, t1.sum() );	
		assertEquals(200, t2.sum() );	
	}

	@Test
	void testMinimum() {
		assertEquals(5, t1.minimum());
		assertEquals(10, t2.minimum());
		
	}

	@Test
	void testFinalScore() {
		assertEquals(160, t1.finalScore());
		assertEquals(190, t2.finalScore());
		
		
	}

	
	
}
