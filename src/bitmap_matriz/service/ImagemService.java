package bitmap_matriz.service;

import java.awt.image.Raster;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bitmap_matriz.entity.Imagem;
import bitmap_matriz.util.ListUtil;

public class ImagemService {

	public Map<Integer, Integer> contarElementosDaMatriz(int[] vetorInput, Imagem imagem, Raster raster) {

		Map<Integer, Integer> qts = new HashMap<>();
		List<Integer> lista = ListUtil.vetorParaLista(vetorInput);
		
		for (int i = 0; i < lista.size(); i++) {
			
			boolean aux = false;
			for (int x = 0; x < imagem.getColunas(); x++) {
				for (int y = 0; y < imagem.getLinhas(); y++) {					
									
					raster.getPixel(x, y, imagem.getCores()); // -> captura da combinação de cor RGB do pixel e adiciona no vetor de cores
					int pixel = Integer.parseInt(String.valueOf(imagem.getCores()[0]) + String.valueOf(imagem.getCores()[1]) + String.valueOf(imagem.getCores()[2]));					
										
					if (lista.get(i) == pixel) { // -> compara o elemento input na posição i com o valor do pixel capturado na posição x y da imagem
						aux = true;						
						if (qts.containsKey(lista.get(i))) {
							
							int primeiraOcorrencia = lista.indexOf(lista.get(i));					
							if(i == primeiraOcorrencia) // -> verifica se o valor do elemento input na posição i já foi contabilizado anteriormente. Utilizado para tratar valores repetidos
								qts.put(lista.get(i), qts.get(lista.get(i)) + 1);
							
						} else {
							qts.put(lista.get(i), 1);
						}						
					}
					
				}
			}
			if (!aux)
				qts.put(vetorInput[i], 0);
			
		}

		return qts;

	}

}
