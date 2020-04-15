package lletres_repetides;
import java.util.ArrayList;
import java.util.List;
public class Exercici_lletres_repetides_faseII {

	public static void main(String[] args) {
		boolean vocal = false;
		boolean numero =false;
		char [] numeros = {'0','1','2','3','4','5','6','7','8','9'};
		char [] vocales = {'a','e','i','o','u'};
		List <Character> mi_nombre = new ArrayList<>();
	
		mi_nombre.add(0, 'F');
		mi_nombre.add(1, 'e');
		mi_nombre.add(2, 'd');
		mi_nombre.add(3, 'e');
		mi_nombre.add(4, 'r');
		mi_nombre.add(5, 'i');
		mi_nombre.add(6, 'c');
		mi_nombre.add(7, 'o');
		mi_nombre.add(8, '0');
		
		for (int i=0; i<mi_nombre.size(); i++) {
			for (int j=0; j<vocales.length; j++) {
					if (mi_nombre.get(i) == vocales[j]) {
					vocal = true;
					}
					if (mi_nombre.get(i) == numeros[j]) {
						numero = true;
						}
				
			}
			String cierto = " es vocal";
			String falso = " es consonante";
			if (vocal == true && numero == false) {
				System.out.println("La letra "+mi_nombre.get(i)+ cierto);
			}
			if (vocal == false && numero == false) {
				System.out.println("La letra "+mi_nombre.get(i)+ falso);
			}
			vocal=false;
			if (numero == true) {
				System.out.println("Los nombres no contienen números. El "+mi_nombre.get(i)+ " es un número." );
			}
		}
		//System.out.println(mi_nombre);
		//System.out.println(vocal);
	}

}
