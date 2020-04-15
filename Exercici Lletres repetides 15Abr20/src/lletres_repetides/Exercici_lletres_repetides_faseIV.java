package lletres_repetides;

import java.util.ArrayList;
import java.util.List;

public class Exercici_lletres_repetides_faseIV {

	public static void main(String[] args) {
		List <Character> mi_nombre = new ArrayList<>();
		List <Character> mi_apellido = new ArrayList<>();
	
		

		mi_nombre.add(0, 'F');
		mi_nombre.add(1, 'e');
		mi_nombre.add(2, 'd');
		mi_nombre.add(3, 'e');
		mi_nombre.add(4, 'r');
		mi_nombre.add(5, 'i');
		mi_nombre.add(6, 'c');
		mi_nombre.add(7, 'o');
		mi_nombre.add(8, ' ');
	
		
		mi_apellido.add(0, 'C');
		mi_apellido.add(1, 'a');
		mi_apellido.add(2, 'm');
		mi_apellido.add(3, 'p');
		mi_apellido.add(4, 'i');
		mi_apellido.add(5, 'ñ');
		mi_apellido.add(6, 'e');
		mi_apellido.add(7, 'z');
				
		List <Character> completo = new ArrayList<>(mi_nombre);
		completo.addAll(mi_apellido);
		

		System.out.print(completo);
		

}
}