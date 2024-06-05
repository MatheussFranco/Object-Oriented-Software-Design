package br.edu.unifei.ecot12.lab01;

import java.util.Random;

public class CampoMinado {

	public static final int TOTAL_BOMBAS = 10;
	
	//matrix that the dynamic of the game take place
	private char jogo[][] = new char[10][10];
	//matrix where the player can visualize the game
	private char visual[][] = new char[10][10];
	private int jogadas;
	private boolean fimJogo;
	
	public CampoMinado() {
		//start all matrix with all the elements = '?'
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				jogo[i][j]=' ';
				visual[i][j]='?';
			}
		}
		
		//the game matrix has a space for all the bombs in the game
		Random r = new Random();
		for(int i=0;i<10;i++) {
			int l=r.nextInt(10);
			int c=r.nextInt(10);
			if(jogo[l][c]==' ') {
				jogo[l][c]='*';
			}else {
				i--;
			}			
		}
		
		//counting the neighbors (how many bombs my neighbors have?)
		for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int conta=0;
                if(jogo[i][j]==' '){
                    if(i>0 && j>0 && jogo[i-1][j-1]=='*'){ conta++; }
                    if(i>0 && jogo[i-1][j]=='*'){ conta++; }
                    if(i>0 && j<9 && jogo[i-1][j+1]=='*'){ conta++; }
                    if(j>0 && jogo[i][j-1]=='*'){ conta++; }
                    if(j<9 && jogo[i][j+1]=='*'){ conta++; }
                    if(i<9 && j>0 && jogo[i+1][j-1]=='*'){ conta++; }
                    if(i<9 && jogo[i+1][j]=='*'){ conta++; }
                    if(i<9 && j<9 && jogo[i+1][j+1]=='*'){ conta++; }
                    if(conta>0){ jogo[i][j]=(char)('0'+conta); }
                }
            }
        }
	}
	
	public void desarme(int l, int c) {
		if(fimJogo==false) {
			if(l>=0 && l<=9 && c>=0 && c<=9) {
				if(visual[l][c]=='?') {
					visual[l][c]=jogo[l][c];
					jogadas++;
					if(jogadas>=90) {
						fimJogo=true;
					}
					if(jogo[l][c]=='*') {
						fimJogo=true;
					}
				}
			}
		}
	}
	
	public void imprime(char m[][]) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%s]",m[i][j]);
			}
			System.out.println();
		}
	}
	
	public char[][] getJogo() {
		return jogo;
	}

	public char[][] getVisual() {
		return visual;
	}

	public int getJogadas() {
		return jogadas;
	}
	public boolean isFimJogo() {
		return fimJogo;
	}

	
	
}
