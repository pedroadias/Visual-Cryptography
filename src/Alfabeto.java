import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Alfabeto {
	int altura_process, largura_process;

	BufferedImage image_process = null;

	ArrayList<Integer> zero = new ArrayList<Integer>();
	ArrayList<Integer> um = new ArrayList<Integer>();
	ArrayList<Integer> dois = new ArrayList<Integer>();
	ArrayList<Integer> tres = new ArrayList<Integer>();
	ArrayList<Integer> quatro = new ArrayList<Integer>();
	ArrayList<Integer> cinco = new ArrayList<Integer>();
	ArrayList<Integer> seis = new ArrayList<Integer>();
	ArrayList<Integer> sete = new ArrayList<Integer>();
	ArrayList<Integer> oito = new ArrayList<Integer>();
	ArrayList<Integer> nove = new ArrayList<Integer>();
	ArrayList<Integer> letraA = new ArrayList<Integer>();
	ArrayList<Integer> letraB = new ArrayList<Integer>();
	ArrayList<Integer> letraC = new ArrayList<Integer>();
	ArrayList<Integer> letraD = new ArrayList<Integer>();
	ArrayList<Integer> letraE = new ArrayList<Integer>();
	ArrayList<Integer> letraF = new ArrayList<Integer>();
	ArrayList<Integer> letraG = new ArrayList<Integer>();
	ArrayList<Integer> letraH = new ArrayList<Integer>();
	ArrayList<Integer> letraI = new ArrayList<Integer>();
	ArrayList<Integer> letraJ = new ArrayList<Integer>();
	ArrayList<Integer> letraK = new ArrayList<Integer>();
	ArrayList<Integer> letraL = new ArrayList<Integer>();
	ArrayList<Integer> letraM = new ArrayList<Integer>();
	ArrayList<Integer> letraN = new ArrayList<Integer>();
	ArrayList<Integer> letraO = new ArrayList<Integer>();
	ArrayList<Integer> letraP = new ArrayList<Integer>();
	ArrayList<Integer> letraQ = new ArrayList<Integer>();
	ArrayList<Integer> letraR = new ArrayList<Integer>();
	ArrayList<Integer> letraS = new ArrayList<Integer>();
	ArrayList<Integer> letraT = new ArrayList<Integer>();
	ArrayList<Integer> letraU = new ArrayList<Integer>();
	ArrayList<Integer> letraV = new ArrayList<Integer>();
	ArrayList<Integer> letraX = new ArrayList<Integer>();
	ArrayList<Integer> letraW = new ArrayList<Integer>();
	ArrayList<Integer> letraY = new ArrayList<Integer>();
	ArrayList<Integer> letraZ = new ArrayList<Integer>();

	public Alfabeto() throws IOException 	{
		for (int k = 0; k < 37; k++) {
			if(k == 0) {
				File input = new File("0.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							zero.add(cont);
						}
					}
				}
			}
			else if(k == 1) {
				File input = new File("1.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							um.add(cont);
						}
					}
				}
			}
			else if(k == 2) {
				File input = new File("2.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							dois.add(cont);
						}
					}
				}
			}
			else if(k == 3) {
				File input = new File("3.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							tres.add(cont);
						}
					}
				}
			}else if(k == 4) {
				File input = new File("4.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							quatro.add(cont);
						}
					}
				}
			}else if(k == 5) {
				File input = new File("5.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							cinco.add(cont);
						}
					}
				}
			}else if(k == 6) {
				File input = new File("6.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							seis.add(cont); 
						}
					}
				}
			}else if(k == 7) {
				File input = new File("7.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							sete.add(cont);
						}
					}
				}
			}else if(k == 8) {
				File input = new File("8.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							oito.add(cont);
						}
					}
				}
			}else if(k == 9) {
				File input = new File("9.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							nove.add(cont);
						}
					}
				}
			}else if(k == 10) {
				File input = new File("A.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraA.add(cont);
						}
					}
				}

			}else if(k == 11) {
				File input = new File("B.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraB.add(cont);
						}
					}
				}

			}else if(k == 12) {
				File input = new File("C.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraC.add(cont);
						}
					}
				}

			}else if(k == 13) {
				File input = new File("D.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraD.add(cont);
						}
					}
				}
			}else if(k == 14) {
				File input = new File("E.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraE.add(cont);
						}
					}
				}
			}else if(k == 15) {
				File input = new File("F.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraF.add(cont);
						}
					}
				}
			}else if(k == 16) {
				File input = new File("G.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraG.add(cont);
						}
					}
				}
			}else if(k == 17) {
				File input = new File("H.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraH.add(cont);
						}
					}
				}
			}else if(k == 18) {
				File input = new File("I.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraI.add(cont);
						}
					}
				}
			}else if(k == 19) {
				File input = new File("J.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraJ.add(cont);
						}
					}
				}
			}else if(k == 20) {
				File input = new File("K.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraK.add(cont);
						}
					}
				}
			}else if(k == 21) {
				File input = new File("L.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraL.add(cont);
						}
					}
				}
			}else if(k == 22) {
				File input = new File("M.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraM.add(cont);
						}
					}
				}
			}else if(k == 23) {
				File input = new File("N.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraN.add(cont);
						}
					}
				}
			}else if(k == 24) {
				File input = new File("O.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraO.add(cont);
						}
					}
				}
			}else if(k == 25) {
				File input = new File("P.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraP.add(cont);
						}
					}
				}
			}else if(k == 26) {
				File input = new File("Q.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraQ.add(cont);
						}
					}
				}
			}else if(k == 27) {
				File input = new File("R.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraR.add(cont);
						}
					}
				}
			}else if(k == 28) {
				File input = new File("S.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraS.add(cont);
						}
					}
				}
			}else if(k == 29) {
				File input = new File("T.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraT.add(cont);
						}
					}
				}
			}else if(k == 30) {
				File input = new File("U.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraU.add(cont);
						}
					}
				}
			}else if(k == 31) {
				File input = new File("V.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraV.add(cont);
						}
					}
				}
			}else if(k == 32) {
				File input = new File("X.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraX.add(cont);
						}
					}
				}
			}else if(k == 33) {
				File input = new File("W.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraW.add(cont);
						}
					}
				}
			}else if(k == 34) {
				File input = new File("Y.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraY.add(cont);
						}
					}
				}
			}else if(k == 35) {
				File input = new File("Z.bmp");
				image_process = ImageIO.read(input);
				altura_process = image_process.getHeight();
				largura_process = image_process.getWidth();
				int cont = 0;
				for (int i = 0; i < altura_process; i++) {
					for (int j = 0; j < largura_process; j++) {
						cont++;
						Color c = new Color(image_process.getRGB(j, i));
						if((c.getRed() & c.getGreen() & c.getBlue()) == 255) {
							letraZ.add(cont);
						}
					}
				}
			}
		}
	}

	public String mensagemAleatoria(int caracteres) {
		int qtdeMaximaCaracteres = caracteres;

		String[] mensagem = {"0", "1","2", "3", "4", "5", "6", "7", "8","9",
				"A", "B", "C","D","E","F","G","H","I","J","K",
				"L","M","N","O","P","Q","R","S","T","U","V","X","W","Y","Z"};

		StringBuilder senha = new StringBuilder();

		for (int i = 0; i < qtdeMaximaCaracteres; i++) {
			int posicao = (int) (Math.random() * mensagem.length);
			senha.append(mensagem[posicao]);
		}
		return senha.toString();
	}
}