package bitmap_matriz;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.IOException;
import java.util.Map;

import bitmap_matriz.entity.Imagem;
import bitmap_matriz.service.ImagemService;
import bitmap_matriz.util.ImagemResource;

class Main {

	public static void main(String[] args) {
		
		try {
			ImagemResource imagemResource = new ImagemResource();
			BufferedImage img = imagemResource.buscarImagem("/imagem/icone.bmp");
			Raster raster = img.getRaster();
			
			int linhas = img.getHeight();
			int colunas = img.getWidth();	
			
			int[] vetorInput = {84147255, 123456789, 255255255, 84147255, 000, 3981154, 255226106, 39221224};			
			
			ImagemService imagemService = new ImagemService();
			Map<Integer, Integer> quantidade = imagemService.contarElementosDaMatriz(vetorInput, new Imagem(linhas, colunas), raster);
			
			quantidade.forEach((chave, valor) -> System.out.println("Elemento com a cor RGB: "+(chave == 0 ? "000" : chave)+ " foi encontrado "+valor+" vezes na matriz de bitmap"));			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}

}
