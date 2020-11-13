
import java.awt.Color; 
import java.awt.Font; 
import java.awt.FontMetrics;
import java.awt.Graphics2D; 
import java.awt.image.BufferedImage; 
import java.io.File;
import java.io.IOException; 
import javax.imageio.ImageIO;


public class Criarletra { 
	
	public Criarletra() throws IOException{
		LetraImagem("0"); LetraImagem("1");	LetraImagem("2"); LetraImagem("3"); LetraImagem("4");	LetraImagem("5");
		LetraImagem("6"); LetraImagem("7");	LetraImagem("8"); LetraImagem("9"); LetraImagem("A");	LetraImagem("B");
		LetraImagem("C"); LetraImagem("D");	LetraImagem("E"); LetraImagem("F"); LetraImagem("G");	LetraImagem("H");
		LetraImagem("I"); LetraImagem("J");	LetraImagem("K"); LetraImagem("L");	LetraImagem("M");
		LetraImagem("N"); LetraImagem("O");	LetraImagem("P"); LetraImagem("Q");	LetraImagem("R");
		LetraImagem("S"); LetraImagem("T"); LetraImagem("U"); LetraImagem("V"); LetraImagem("X");
		LetraImagem("W"); LetraImagem("Y");	LetraImagem("Z");
}


public void LetraImagem(String c) throws IOException { 
	Font f = new  Font(Font.DIALOG, Font.CENTER_BASELINE,18);
	int larg_comp = 14;

	BufferedImage img = new BufferedImage(larg_comp, larg_comp,  BufferedImage.TYPE_INT_ARGB); 
	Graphics2D g = (Graphics2D) img.getGraphics();
	g.setFont(f); 
	FontMetrics frc =  g.getFontMetrics(); 

	img = new BufferedImage(larg_comp,larg_comp, BufferedImage.TYPE_INT_RGB); 
	g =  (Graphics2D) img.getGraphics();
	g.setColor(new Color(255,255,255));
	g.setFont(f); 
	int x = ((14 - frc.stringWidth(c)) / 2); 
	int y =  ((14 - frc.getHeight()) / 2) + frc.getAscent();

	g.drawString(c,x, y);

	try { 
		File file = new File(c+".bmp"); 
		ImageIO.write(img, "bmp", file);
		
	}catch(Exception e) {

	} 
}

}



