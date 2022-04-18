package bitmap_matriz.util;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class ImagemResource {
			
	public BufferedImage buscarImagem(String resource) throws IOException {
		InputStream input = getClass().getResourceAsStream(resource);
		return ImageIO.read(input);
	}

}
