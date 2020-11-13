import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Share2 {
	
	private int x,y,j;
	private int pos_x = 0, pos_y = 0;
	int posicao = 16;
	int tamanhoLetra = 14;
	int qtd;

	Alfabeto alfa = new Alfabeto();
	
	Color branco = new Color(255,255,255); 
	Color preto = new Color(0,0,0);

	public Share2(int largura, int altura, Graphics2D img, BufferedImage bi, Share1 pixels) throws IOException {
		criaShare2(altura, altura, img, bi, pixels);
	}

	public void letra(ArrayList<Integer> num, int[] pix, Graphics2D img, int tamanhoLetra, int tamanhoImagem, int pos_x, int pos_y, Color preto, Color branco) {
		for (int y = 2*pos_y; y<2*pos_y+tamanhoLetra*2;y=y+2){
			for (int x = 2*pos_x; x<2*pos_x+tamanhoLetra*2;x=x+2){
				for (int i = 0;i<num.size();i++){
					if ((x+y*tamanhoLetra-2*pos_x-2*pos_y*tamanhoLetra)/2+1==num.get(i)){
						if (pix[y*tamanhoImagem/2+x/2]==0) {
							System.out.println("X modificada: " + x + " e Y modificada: " +y);
							img.setColor(preto);
							img.fillRect(x, y, 1, 1);
							img.setColor(preto);
							img.fillRect(x+1, y, 1, 1);
							img.setColor(branco); //(0, 0, 0);
							img.fillRect(x, y+1, 1, 1);
							img.setColor(branco); //(0, 0, 0);
							img.fillRect(x+1, y+1, 1, 1);
						}
						if (pix[y*tamanhoImagem/2+x/2]==1) {
							System.out.println("X modificada: " + x + " e Y modificada: " +y);
							img.setColor(branco); //0, 0, 0));
							img.fillRect(x, y, 1, 1);
							img.setColor(branco); //0, 0, 0));
							img.fillRect(x+1, y, 1, 1);
							img.setColor(preto);
							img.fillRect(x, y+1, 1, 1);
							img.setColor(preto);
							img.fillRect(x+1, y+1, 1, 1);
						}
						if (pix[y*tamanhoImagem/2+x/2]==2) {
							System.out.println("X modificada: " + x + " e Y modificada: " +y);
							img.setColor(preto);
							img.fillRect(x, y, 1, 1);
							img.setColor(branco); //0, 0, 0));
							img.fillRect(x+1, y, 1, 1);
							img.setColor(preto);
							img.fillRect(x, y+1, 1, 1);
							img.setColor(branco); //0, 0, 0));
							img.fillRect(x+1, y+1, 1, 1);
						}
						if (pix[y*tamanhoImagem/2+x/2]==3) {
							System.out.println("X modificada: " + x + " e Y modificada: " +y);
							img.setColor(branco); //0, 0, 0));
							img.fillRect(x, y, 1, 1);
							img.setColor(preto);
							img.fillRect(x+1, y, 1, 1);
							img.setColor(branco); //0, 0, 0));
							img.fillRect(x, y+1, 1, 1);
							img.setColor(preto);
							img.fillRect(x+1, y+1, 1, 1);
						}
						if (pix[y*tamanhoImagem/2+x/2]==4) {
							System.out.println("X modificada: " + x + " e Y modificada: " +y);
							img.setColor(preto);
							img.fillRect(x, y, 1, 1);
							img.setColor(branco); //0, 0, 0));
							img.fillRect(x+1, y, 1, 1);
							img.setColor(branco); //0, 0, 0));
							img.fillRect(x, y+1, 1, 1);
							img.setColor(preto);
							img.fillRect(x+1, y+1, 1, 1);
						}
						if (pix[y*tamanhoImagem/2+x/2]==5) {
							System.out.println("X modificada: " + x + " e Y modificada: " +y);
							img.setColor(branco); //0, 0, 0));
							img.fillRect(x, y, 1, 1);
							img.setColor(preto);
							img.fillRect(x+1, y, 1, 1);
							img.setColor(preto);
							img.fillRect(x, y+1, 1, 1);
							img.setColor(branco); //0, 0, 0));
							img.fillRect(x+1, y+1, 1, 1);
						}
					}
				}
			}
		}

	}


	public void criaShare2(int largura, int altura, Graphics2D img, BufferedImage bi, Share1 pixels) {
		System.out.println("Criando Share2");
		for (y = 0; y < largura/2; y++) {
			for (x = 0; x < altura/2; x++) {
				if (pixels.getPixels()[y * (altura/2) + x] == 0) {
					//System.out.println(y * 32 + x);
					img.setColor(branco);
					img.fillRect(2 * x, 2 * y, 1, 1);
					img.setColor(branco);
					img.fillRect(2 * x + 1, 2 * y, 1, 1);
					img.setColor(preto);
					img.fillRect(2 * x, 2 * y + 1, 1, 1);
					img.setColor(preto);
					img.fillRect(2 * x + 1, 2 * y + 1, 1, 1);
				}
				else if (pixels.getPixels()[y * (altura/2) + x] == 1) {
					img.setColor(preto);
					img.fillRect(2 * x, 2 * y, 1, 1);
					img.setColor(preto);
					img.fillRect(2 * x + 1, 2 * y, 1, 1);
					img.setColor(branco);
					img.fillRect(2 * x, 2 * y + 1, 1, 1);
					img.setColor(branco);
					img.fillRect(2 * x + 1, 2 * y + 1, 1, 1);
				}
				else if (pixels.getPixels()[y * (altura/2) + x] == 2) {
					img.setColor(branco);
					img.fillRect(2 * x, 2 * y, 1, 1);
					img.setColor(preto);
					img.fillRect(2 * x + 1, 2 * y, 1, 1);
					img.setColor(branco);
					img.fillRect(2 * x, 2 * y + 1, 1, 1);
					img.setColor(preto);
					img.fillRect(2 * x + 1, 2 * y + 1, 1, 1);
				}
				else if (pixels.getPixels()[y * (altura/2) + x] == 3) {
					img.setColor(preto);
					img.fillRect(2 * x, 2 * y, 1, 1);
					img.setColor(branco);
					img.fillRect(2 * x + 1, 2 * y, 1, 1);
					img.setColor(preto);
					img.fillRect(2 * x, 2 * y + 1, 1, 1);
					img.setColor(branco);
					img.fillRect(2 * x + 1, 2 * y + 1, 1, 1);
				}
				else if (pixels.getPixels()[y * (altura/2) + x] == 4) {
					img.setColor(branco);
					img.fillRect(2 * x, 2 * y, 1, 1);
					img.setColor(preto);
					img.fillRect(2 * x + 1, 2 * y, 1, 1);
					img.setColor(preto);
					img.fillRect(2 * x, 2 * y + 1, 1, 1);
					img.setColor(branco);
					img.fillRect(2 * x + 1, 2 * y + 1, 1, 1);
				}
				else if (pixels.getPixels()[y * (altura/2) + x] == 5) {
					img.setColor(preto);
					img.fillRect(2 * x, 2 * y, 1, 1);
					img.setColor(branco);
					img.fillRect(2 * x + 1, 2 * y, 1, 1);
					img.setColor(branco);
					img.fillRect(2 * x, 2 * y + 1, 1, 1);
					img.setColor(preto);
					img.fillRect(2 * x + 1, 2 * y + 1, 1, 1);

				}
			}
		}
	}

	public void cifrarMensagem1184(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 37;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 22
				if (j==i+(qtd*21)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*21; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 23
				if (j==i+(qtd*22)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*22; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 24
				if (j==i+(qtd*23)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*23; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 25
				if (j==i+(qtd*24)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*24; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 26
				if (j==i+(qtd*25)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*25; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 27
				if (j==i+(qtd*26)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*26; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}for (int i = 0; i < qtd; i++) {
				// LINHA 28
				if (j==i+(qtd*27)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*27; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 29
				if (j==i+(qtd*28)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*28; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 30
				if (j==i+(qtd*29)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*29; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 31
				if (j==i+(qtd*30)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*30; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 32
				if (j==i+(qtd*31)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*31; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 33
				if (j==i+(qtd*32)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*32; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 34
				if (j==i+(qtd*33)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*33; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 35
				if (j==i+(qtd*34)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*34; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 36
				if (j==i+(qtd*35)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*35; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 37
				if (j==i+(qtd*36)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*36; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem1152(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 36;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 22
				if (j==i+(qtd*21)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*21; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 23
				if (j==i+(qtd*22)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*22; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 24
				if (j==i+(qtd*23)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*23; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 25
				if (j==i+(qtd*24)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*24; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 26
				if (j==i+(qtd*25)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*25; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 27
				if (j==i+(qtd*26)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*26; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}for (int i = 0; i < qtd; i++) {
				// LINHA 28
				if (j==i+(qtd*27)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*27; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 29
				if (j==i+(qtd*28)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*28; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 30
				if (j==i+(qtd*29)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*29; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 31
				if (j==i+(qtd*30)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*30; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 32
				if (j==i+(qtd*31)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*31; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 33
				if (j==i+(qtd*32)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*32; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 34
				if (j==i+(qtd*33)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*33; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 35
				if (j==i+(qtd*34)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*34; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 36
				if (j==i+(qtd*35)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*35; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem1120(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 35;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 22
				if (j==i+(qtd*21)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*21; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 23
				if (j==i+(qtd*22)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*22; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 24
				if (j==i+(qtd*23)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*23; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 25
				if (j==i+(qtd*24)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*24; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 26
				if (j==i+(qtd*25)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*25; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 27
				if (j==i+(qtd*26)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*26; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}for (int i = 0; i < qtd; i++) {
				// LINHA 28
				if (j==i+(qtd*27)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*27; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 29
				if (j==i+(qtd*28)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*28; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 30
				if (j==i+(qtd*29)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*29; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 31
				if (j==i+(qtd*30)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*30; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 32
				if (j==i+(qtd*31)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*31; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 33
				if (j==i+(qtd*32)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*32; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 34
				if (j==i+(qtd*33)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*33; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 35
				if (j==i+(qtd*34)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*34; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem1088(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 34;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 22
				if (j==i+(qtd*21)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*21; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 23
				if (j==i+(qtd*22)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*22; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 24
				if (j==i+(qtd*23)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*23; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 25
				if (j==i+(qtd*24)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*24; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 26
				if (j==i+(qtd*25)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*25; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 27
				if (j==i+(qtd*26)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*26; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}for (int i = 0; i < qtd; i++) {
				// LINHA 28
				if (j==i+(qtd*27)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*27; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 29
				if (j==i+(qtd*28)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*28; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 30
				if (j==i+(qtd*29)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*29; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 31
				if (j==i+(qtd*30)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*30; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 32
				if (j==i+(qtd*31)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*31; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 33
				if (j==i+(qtd*32)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*32; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 34
				if (j==i+(qtd*33)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*33; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem1056(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 33;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 22
				if (j==i+(qtd*21)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*21; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 23
				if (j==i+(qtd*22)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*22; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 24
				if (j==i+(qtd*23)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*23; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 25
				if (j==i+(qtd*24)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*24; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 26
				if (j==i+(qtd*25)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*25; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 27
				if (j==i+(qtd*26)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*26; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}for (int i = 0; i < qtd; i++) {
				// LINHA 28
				if (j==i+(qtd*27)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*27; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 29
				if (j==i+(qtd*28)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*28; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 30
				if (j==i+(qtd*29)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*29; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 31
				if (j==i+(qtd*30)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*30; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 32
				if (j==i+(qtd*31)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*31; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 33
				if (j==i+(qtd*32)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*32; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem1024(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 32;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 22
				if (j==i+(qtd*21)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*21; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 23
				if (j==i+(qtd*22)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*22; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 24
				if (j==i+(qtd*23)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*23; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 25
				if (j==i+(qtd*24)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*24; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 26
				if (j==i+(qtd*25)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*25; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 27
				if (j==i+(qtd*26)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*26; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}for (int i = 0; i < qtd; i++) {
				// LINHA 28
				if (j==i+(qtd*27)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*27; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 29
				if (j==i+(qtd*28)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*28; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 30
				if (j==i+(qtd*29)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*29; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 31
				if (j==i+(qtd*30)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*30; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 32
				if (j==i+(qtd*31)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*31; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem992(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 31;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 22
				if (j==i+(qtd*21)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*21; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 23
				if (j==i+(qtd*22)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*22; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 24
				if (j==i+(qtd*23)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*23; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 25
				if (j==i+(qtd*24)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*24; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 26
				if (j==i+(qtd*25)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*25; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 27
				if (j==i+(qtd*26)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*26; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}for (int i = 0; i < qtd; i++) {
				// LINHA 28
				if (j==i+(qtd*27)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*27; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 29
				if (j==i+(qtd*28)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*28; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 30
				if (j==i+(qtd*29)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*29; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 31
				if (j==i+(qtd*30)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*30; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}

			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem960(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 30;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 22
				if (j==i+(qtd*21)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*21; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 23
				if (j==i+(qtd*22)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*22; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 24
				if (j==i+(qtd*23)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*23; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 25
				if (j==i+(qtd*24)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*24; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 26
				if (j==i+(qtd*25)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*25; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 27
				if (j==i+(qtd*26)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*26; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}for (int i = 0; i < qtd; i++) {
				// LINHA 28
				if (j==i+(qtd*27)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*27; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 29
				if (j==i+(qtd*28)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*28; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 30
				if (j==i+(qtd*29)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*29; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem928(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 29;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 22
				if (j==i+(qtd*21)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*21; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 23
				if (j==i+(qtd*22)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*22; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 24
				if (j==i+(qtd*23)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*23; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 25
				if (j==i+(qtd*24)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*24; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 26
				if (j==i+(qtd*25)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*25; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 27
				if (j==i+(qtd*26)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*26; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}for (int i = 0; i < qtd; i++) {
				// LINHA 28
				if (j==i+(qtd*27)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*27; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 29
				if (j==i+(qtd*28)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*28; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}

			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem896(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 28;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 22
				if (j==i+(qtd*21)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*21; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 23
				if (j==i+(qtd*22)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*22; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 24
				if (j==i+(qtd*23)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*23; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 25
				if (j==i+(qtd*24)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*24; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 26
				if (j==i+(qtd*25)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*25; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 27
				if (j==i+(qtd*26)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*26; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}for (int i = 0; i < qtd; i++) {
				// LINHA 28
				if (j==i+(qtd*27)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*27; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}


			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem800(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 25;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 22
				if (j==i+(qtd*21)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*21; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 23
				if (j==i+(qtd*22)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*22; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 24
				if (j==i+(qtd*23)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*23; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 25
				if (j==i+(qtd*24)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*24; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem768(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 24;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 22
				if (j==i+(qtd*21)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*21; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 23
				if (j==i+(qtd*22)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*22; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 24
				if (j==i+(qtd*23)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*23; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem736(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 23;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 22
				if (j==i+(qtd*21)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*21; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 23
				if (j==i+(qtd*22)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*22; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem704(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 22;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 22
				if (j==i+(qtd*21)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*21; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem672(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 21;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 21
				if (j==i+(qtd*20)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*20; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem640(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 20;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 20
				if (j==i+(qtd*19)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*19; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem608(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 19;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 19
				if (j==i+(qtd*18)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*18; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem576(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 18;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 18
				if (j==i+(qtd*17)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*17; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem544(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 17;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 17
				if (j==i+(qtd*16)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*16; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem512(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 16;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 16
				if (j==i+(qtd*15)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*15; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
		}
	}

	public void cifrarMensagem480(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 15;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 15
				if (j==i+(qtd*14)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*14; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem448(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 14;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 14
				if (j==i+(qtd*13)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*13; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}

			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem416(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 13;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 13
				if (j==i+(qtd*12)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*12; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem384(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 12;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 12
				if (j==i+(qtd*11)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*11; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}

			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem352(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 11;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 11
				if (j==i+(qtd*10)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*10; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}

			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem320(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 10;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 10
				if (j==i+(qtd*9)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*9; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}

			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem288(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 9;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 8
				if (j==i+(qtd*7)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 9
				if (j==i+(qtd*8)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*8; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}

			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem256(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 8;
		for (j=0;j<64;j++){
			for (int i = 0; i < 8; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < 8; i++) {
				// LINHA 2
				if (j==i+8){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < 8; i++) {
				// LINHA 3
				if (j==i+16){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < 8; i++) {
				// LINHA 4
				if (j==i+24){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < 8; i++) {
				// LINHA 5
				if (j==i+32){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < 8; i++) {
				// LINHA 6
				if (j==i+40){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < 8; i++) {
				// LINHA 7
				if (j==i+48){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < 8; i++) {
				// LINHA 8
				if (j==i+56){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*7; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}


			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'i' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'e' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 's' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'b' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
		}

	}

	public void cifrarMensagem224(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 7;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 7
				if (j==i+(qtd*6)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*6; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}

			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem192(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 6;
		for (j=0;j<(qtd*qtd);j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 5
				if (j==i+(qtd*4)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*4; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 6
				if (j==i+(qtd*5)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*5; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}

			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

		}

	}

	public void cifrarMensagem128(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 4;
		for (j=0;j<qtd*qtd;j++){
			for (int i = 0; i < qtd; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 1+(posicao)*i; 
					pos_y = 1; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 2
				if (j==i+(qtd)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 3
				if (j==i+(qtd*2)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*2; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < qtd; i++) {
				// LINHA 4
				if (j==i+(qtd*3)){
					pos_x = 1+(posicao)*i; 
					pos_y = 1+(posicao)*3; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}


			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
		}

	}

	public void cifrarMensagem96(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 3;
		for (j=0;j<9;j++){
			for (int i = 0; i < 3; i++) {
				// LINHA 1
				if (j==i){
					pos_x = 0+16*i; 
					pos_y = 0; 
					//System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < 3; i++) {
				// LINHA 2
				if (j==i+3){
					pos_x = 0+16*i; 
					pos_y = 16; 
					//	System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < 3; i++) {
				// LINHA 3
				if (j==i+6){
					pos_x = 0+16*i; 
					pos_y = 0+16*2; 
					//	System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}

			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
		}
	}

	public void cifrarMensagem64(Share1 pixels, Graphics2D img, int tamanhoImagem, String msg) {
		qtd = 2;
		for (j=0;j<4;j++){
			for (int i = 0; i < 2; i++) {
				if (j==i){
					pos_x = 0+(posicao)*i; 
					pos_y = 0; 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}
			for (int i = 0; i < 2; i++) {
				if (j==i+2){
					pos_x = 0+(posicao)*i; 
					pos_y = 0+(posicao); 
					System.out.println("Posicao X quadrante 1: " + pos_x + ", Posicao Y quadrante 1: " + pos_y);
				}
			}


			if(msg.charAt(j) == '0' && j == j){
				letra(alfa.zero, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '1' && j == j){
				letra(alfa.um, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '2' && j == j){
				letra(alfa.dois, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '3' && j == j){
				letra(alfa.tres, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '4' && j == j){
				letra(alfa.quatro, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '5' && j == j){
				letra(alfa.cinco, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '6' && j == j){
				letra(alfa.seis, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '7' && j == j){
				letra(alfa.sete, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);	
			}

			if(msg.charAt(j) == '8' && j == j){
				letra(alfa.oito, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == '9' && j == j){
				letra(alfa.nove, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
			if(msg.charAt(j) == 'A' && j == j){
				letra(alfa.letraA, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'B' && j == j){
				letra(alfa.letraB, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'C' && j == j){
				letra(alfa.letraC, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'D' && j == j){
				letra(alfa.letraD, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'E' && j == j){
				letra(alfa.letraE, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'F' && j == j){
				letra(alfa.letraF, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'G' && j == j){
				letra(alfa.letraG, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'H' && j == j){
				letra(alfa.letraH, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'I' && j == j){
				letra(alfa.letraI, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'J' && j == j){
				letra(alfa.letraJ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'K' && j == j){
				letra(alfa.letraK, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'L' && j == j){
				letra(alfa.letraL, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'M' && j == j){
				letra(alfa.letraM, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'N' && j == j){
				letra(alfa.letraN, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'O' && j == j){
				letra(alfa.letraO, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'P' && j == j){
				letra(alfa.letraP, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Q' && j == j){
				letra(alfa.letraQ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'R' && j == j){
				letra(alfa.letraR, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'S' && j == j){
				letra(alfa.letraS, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'T' && j == j){
				letra(alfa.letraT, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'U' && j == j){
				letra(alfa.letraU, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'V' && j == j){
				letra(alfa.letraV, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'X' && j == j){
				letra(alfa.letraX, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'W' && j == j){
				letra(alfa.letraW, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Y' && j == j){
				letra(alfa.letraY, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}

			if(msg.charAt(j) == 'Z' && j == j){
				letra(alfa.letraZ, pixels.getPixels(),img,tamanhoLetra,tamanhoImagem,pos_x,pos_y,preto,branco);
			}
		}
	}


	public void output(int altura, BufferedImage bi) throws IOException {
		File file = new File(altura+" - Share2.bmp"); 
		ImageIO.write(bi, "bmp", file);
		System.out.println("Terminado");

	}




}
