package bitmap_matriz.util;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
	
	public static List<Integer> vetorParaLista(int[] vetor){
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < vetor.length; i++) {
			 lista.add(vetor[i]);
		}
		return lista;
	}

}
