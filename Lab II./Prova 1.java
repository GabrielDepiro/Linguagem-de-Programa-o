package Loja;

public class Sofá {
	private String lugares;
	private String cor;
	private int tamanho;
	private int preco;
	
	public Sofá( 
			String lugares,  
			String cor, 
			int tamanho, 
			int preco) 
	{
		this.lugares = lugares;
		this.cor = cor;
		this.tamanho = tamanho;
		this.preco = preco;
	}
	
	public String get_lugares() { 
		return lugares; 
		} 
	public void set_lugares(String novolugares) { 
		lugares = novolugares; 
		} 
	
	public String get_cor() { 
		return cor; 
		}
	public void set_cor(String novocor) { 
		cor = novocor; 
		}
	
	public int get_tamanho() { 
		return tamanho; 
		} 	  
	public void set_tamanho(int novotamanho) { 
		tamanho = novotamanho; 
		} 
	
	public int get_preco() { 
		return preco; 
		}	  
	public void set_preco(int novopreco) { 
		preco = novopreco; 
		} 
	public void Informacao(){ 
		  System.out.println("Lugares: " + lugares + "\n" + 
				  "Cor: " + cor + "\n" + 
				  "Tamanho: " + tamanho + "\n" +
				  "Preço: " + preco + "\n"); 
	      } 
	public static void main(String[] args) {
		Sofá S1 = new
				Sofá("4 lugares", "Azul", 250, 2500);
		Sofá S2 = new
				Sofá("6 lugares", "Cinza", 350, 4000);
	S1.Informacao();
	S2.Informacao();
		 
	S1.set_preco(2200);
		System.out.println("O novo preço é " + S1.get_preco());
	}
}
