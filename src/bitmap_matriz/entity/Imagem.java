package bitmap_matriz.entity;

public class Imagem {
	
	private int linhas;
	private int colunas;
	private int[] cores;
	
	public Imagem(int linhas, int colunas) {		
		this.linhas = linhas;
		this.colunas = colunas;
		this.cores = new int[linhas * colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}

	public int[] getCores() {
		return cores;
	}	

}
