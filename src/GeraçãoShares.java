import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

public class GeraçãoShares {


	public static void main(String[] args) throws Exception {
		int largura = 64, altura = 64;
		int tam = (largura*altura)/2;
		int tamanhoImagem = altura/2;
		int qtdCaracteres = tam/512;
		
		
		
		Random random = new Random();
		BufferedImage bi = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB); 
		Graphics2D img = bi.createGraphics();
		
		Alfabeto alfa = new Alfabeto();
		Share1 sh1 = new Share1(tam, largura, altura, img, random, bi);
		Share2 sh2 = new Share2(largura, altura, img, bi, sh1);
		
		String msg = alfa.mensagemAleatoria(qtdCaracteres);
				
		sh2.cifrarMensagem64(sh1, img, tamanhoImagem, msg);
		sh2.output(altura, bi);
		
		System.out.println("\nMensagem: "+msg);
		System.out.println("Quantidade de Caracteres: "+qtdCaracteres+"\n");


		
	}

	
}

