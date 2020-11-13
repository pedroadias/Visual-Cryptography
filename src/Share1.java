import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;

public class Share1  {
	private int x, y;
	private int pixels[];

	
	Color branco = new Color(255,255,255); 
	Color preto = new Color(0, 0, 0);
	Color azul = new Color(0,0,255);

	public Share1(int tam, int largura, int altura, Graphics2D img, Random random, BufferedImage bi) throws IOException {
		Criarletra cl = new Criarletra();
		addPixels(tam, random);
		criaShare1(largura, altura, img, bi);
	}

	public void addPixels(int tam, Random random) {
		pixels = new int [tam];
		for (int i = 0; i < tam; i++) { 
			pixels[i] = random.nextInt(6);
		}
	}

	public void criaShare1(int largura, int altura, Graphics2D img, BufferedImage bi) throws IOException {
		System.out.println("\nCriando Share1");
		for (y = 0; y < largura/2; y++) {
			for (x = 0; x < altura/2; x++) {
				if (pixels[y * (altura/2) + x] == 0) {
					img.setColor(branco);
					img.fillRect(2 * x, 2 * y, 1,1);
 					img.setColor(branco);
					img.fillRect(2 * x + 1, 2 * y, 1,1);
					img.setColor(preto);
					img.fillRect(2 * x, 2 * y + 1, 1,1);
					img.setColor(preto);
					img.fillRect(2 * x + 1, 2 * y + 1, 1,1);
					
				}
				else if (pixels[y * (altura/2) + x] == 1) {
					img.setColor(preto);
					img.fillRect(2 * x, 2 * y, 1,1);
					img.setColor(preto);
					img.fillRect(2 * x + 1, 2 * y, 1,1);
					img.setColor(branco);
					img.fillRect(2 * x, 2 * y + 1, 1,1);
					img.setColor(branco);
					img.fillRect(2 * x + 1, 2 * y + 1, 1,1);
				}
				else if (pixels[y * (altura/2) + x] == 2) {
					img.setColor(branco);
					img.fillRect(2 * x, 2 * y, 1,1);
					img.setColor(preto);
					img.fillRect(2 * x + 1, 2 * y, 1,1);
					img.setColor(branco);
					img.fillRect(2 * x, 2 * y + 1, 1,1);
					img.setColor(preto);
					img.fillRect(2 * x + 1, 2 * y + 1, 1,1);
				}
				else if (pixels[y * (altura/2) + x] == 3) {
					img.setColor(preto);
					img.fillRect(2 * x, 2 * y, 1,1);
					img.setColor(branco);
					img.fillRect(2 * x + 1, 2 * y, 1,1);
					img.setColor(preto);
					img.fillRect(2 * x, 2 * y + 1, 1,1);
					img.setColor(branco);
					img.fillRect(2 * x + 1, 2 * y + 1, 1,1);
				}
				else if (pixels[y * (altura/2) + x] == 4) {
					img.setColor(branco);
					img.fillRect(2 * x, 2 * y, 1,1);
					img.setColor(preto);
					img.fillRect(2 * x + 1, 2 * y, 1,1);
					img.setColor(preto);
					img.fillRect(2 * x, 2 * y + 1, 1,1);
					img.setColor(branco);
					img.fillRect(2 * x + 1, 2 * y + 1, 1,1);
				}
				else if (pixels[y * (altura/2) + x] == 5) {
					img.setColor(preto);
					img.fillRect(2 * x, 2 * y, 1,1);
					img.setColor(branco);
					img.fillRect(2 * x + 1, 2 * y, 1,1);
					img.setColor(branco);
					img.fillRect(2 * x, 2 * y + 1, 1,1);
					img.setColor(preto);
					img.fillRect(2 * x + 1, 2 * y + 1, 1,1);
					
				}
			}
		
			File file = new File(altura+" - Share1.bmp");
			ImageIO.write(bi, "bmp", file);

		}
		System.out.println("SHARE 1 CRIADA!!\n");
		
		

		}
	
	public int[] getPixels() {
		return pixels;
	}

	public void setPixels(int[] pixels) {
		this.pixels = pixels;
	}

	

	
	
}



		
