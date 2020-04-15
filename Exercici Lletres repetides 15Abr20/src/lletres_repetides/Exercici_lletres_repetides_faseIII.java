package lletres_repetides;
import java.util.HashMap;
public class Exercici_lletres_repetides_faseIII {

	public static void main(String[] args) {
		HashMap < Character,Integer> mi_nombre= new HashMap <Character,Integer>();
	
		String nombre = "Federico";
		for (int i=0; i <nombre.length(); i++) {
			if(mi_nombre.containsKey(nombre.charAt(i))) {
				mi_nombre.put(nombre.charAt(i),(int)mi_nombre.get(nombre.charAt(i))+1);
			}else {
				mi_nombre.put(nombre.charAt(i), 1);
			}
		}
	
		System.out.println(mi_nombre);
		

	}

}


/*mi_nombre.put('F',1);
mi_nombre.put('e',2);
mi_nombre.put('d',3);
mi_nombre.put('e',4);
mi_nombre.put('r',5);
mi_nombre.put('i',6);
mi_nombre.put('c',7);
mi_nombre.put('o',8);
*/
/*mi_nombre.put(1,'F');
mi_nombre.put(2,'e');
mi_nombre.put(3,'d');
mi_nombre.put(4,'e');
mi_nombre.put(5,'r');
mi_nombre.put(6,'i');
mi_nombre.put(7,'c');
mi_nombre.put(8,'o');
*/