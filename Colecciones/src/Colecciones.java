import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * La coleccion Set no puede contener elementos duplicados
		 * Solo tiene los metodos heredados de Collection
		 * Existen diferentes tipos de implementaciones
		 * 
		 * HashSet:Esta implementacion almacena los elementos en una tabla hash.
		 * Es la de mejor rendimiento tiene.
		 * Los elementos no tienen un orden.
		 * 
		 * HashSet
		 * TreeSet / Los ordena alfabeticamente, el más lento
		 * LinkedHashSet / Respeta el orden que tiene por default
		 * 
		 * */
		/*
		Set<String> frutas = new LinkedHashSet();
		frutas.add("Mango");
		frutas.add("Manzana");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuya");
		frutas.add("Platano");
		
		 
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		*/
		/*
		 * Acceso posicional a elementos: manipula elementos en función de 
		 * su posición en la lista.
		 * 
		 * Búsqueda de elementos: busca un elemento concreto de la lista y 
		 * devuelve su posición.
		 * 
		 *Rango de operación: permite realizar ciertas operaciones sobre 
		 *ragos de elementos dentro de la propia lista.
*/
		
		List<String> frutas2 = new ArrayList<String>();
		frutas2.add("Mango");
		frutas2.add("Manzana");
		frutas2.add("Durazno");
		frutas2.add("Pera");
		frutas2.add("Cereza");
		frutas2.add("Mandarina");
		frutas2.add("Carambola");
		frutas2.add("Maracuya");
		frutas2.add("Platano");
		frutas2.add("Mango");
		 
		for(String fruta: frutas2) {
			System.out.println(fruta);
			
		}
		
		int pera = frutas2.indexOf("Pera");
		System.out.println(pera);
		System.out.println(frutas2.get(pera));
		
		List<Integer> agenda = new ArrayList<Integer>();
		agenda.add(123);
		agenda.add(456);
		agenda.add(789);
		
		for(Integer a: agenda) {
			System.out.println(a);
		}
		
		List<String> animales =  new LinkedList<String>();
		animales.add("Perro");
		animales.add("Gato");
		
		animales.add("Conejo");
		
		animales.add("Oso");
		animales.add("Quetzal");
		
		for(String an: animales) {
			System.out.println(an);
		}
		
		/*
		 * La interfaz Mao asocia claves a valores.
		 * No puede contener claves duplicadas y cada 
		 * clave solo puede tener asociada un valor.
		 * 
		 * Implemetaciones:
		 * HashMap
		 * TreeMap
		 * LinkedHashMap
		 * 
		 * Map / tambien se le conoce como diccionarios
		 * Aqui los indices ya no son numeros, pueden ser texto.
		 * */
		Map <String, String> diccionario2 = new TreeMap();
		//diccionario.put(clave,valor);
		diccionario2.put("elemento1","Carlos Eduardo");
		diccionario2.put("dsflñsmd", "aaaaaaaaaaaaaa");
		diccionario2.put("bbbb","ccccccccccccccccccc");
		
		System.out.println(diccionario2.get("elemento1"));
		
		for(Map.Entry<String,String> entry : diccionario2.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		
		
	}

}
