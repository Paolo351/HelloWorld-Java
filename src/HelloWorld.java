
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		/* HelloWorld.dodawanie(4, 5); */
		System.out.println(HelloWorld.dodawanie(4, 5));
		System.out.println(HelloWorld.sprawdzZakres(1, 5, 3));
				
	}
	
	public static int dodawanie (int x, int y) {
		int wynik;
		wynik = x + y;
		/* System.out.println(wynik);  */
		return wynik;
		
	}
	
	public static boolean sprawdzZakres (int zakresMin, int zakresMax, int liczba) {
		if (liczba >= zakresMin && liczba <= zakresMax) 
		{
			return true;
		} else return false;
	}

}
