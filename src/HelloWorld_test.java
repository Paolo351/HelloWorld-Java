import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class HelloWorld_test {
	
	HelloWorld t = new HelloWorld();
	
	/*@Test
	void testMain() {
		fail("Not yet implemented");
	}*/
	
	@SuppressWarnings("static-access")
	@Test
	void testSprawdzZakresTrue() {
		
	int min = 3;
	int max = 122;
	int liczba = 8;
	
		try {
			assertTrue(t.sprawdzZakres(min, max, liczba));
		}
		
		catch (AssertionError e) {
			fail("Liczba mieœci³a siê w zakresie, a program pokaza³ ¿e by³a poza zakresem.");
		}
		
	}

	@SuppressWarnings("static-access")
	@Test
	void testSprawdzZakresFalse() {
		
	int min = 3;
	int max = 12;
	int liczba1 = 18;
	int liczba2 = 1;
	
		try {
			assertFalse(t.sprawdzZakres(min, max, liczba1));
			assertFalse(t.sprawdzZakres(min, max, liczba2));
		}
		
		catch (AssertionError e) {
			fail("Podana liczba nie mieœci³a siê w zakresie, a program pokaza³ inaczej.");
		}
		
	}
	

	@SuppressWarnings("static-access")
	@Test
	void testDodawanie() {

	int x = 2;
	int y = 2;

	try {
			assertEquals(4, t.dodawanie(x, y));
		} 
	catch (AssertionError e) {
		fail("Wynik dodawania nie jest poprawny.");                                     
		}
	}
	
		
		
	


}
