package LocadoraCarros;

public class Vendedores {
	private​ string​ nome; 
	private​​ int​ idade; 
	private​ int​ tempo_empresa; 
	private​ float​ salario; 
	private​ int​ media_vendas; 
	 ​         
	 ​public​ ​Vendedores​( 
			 ​String​ ​nome​, 
	 ​        ​int​ ​idade​, 
	 ​        int​ ​tempo_empresa​, 
	 ​        ​float​ ​salario​){
		 
	 ​        ​this​.​nome ​=​ nome; 
	 ​        this​.​idade ​=​ idade; 
	 ​        ​this​.​tempo_empresa ​=​ tempo_empresa; 
	 ​        ​this​.​salario ​=​ salario;
	 } 
	 ​         
	 public​ ​Vendedor​(​String​ ​string​, ​int​ ​i​, ​int​ ​j​, ​double​ ​d​) { 
	 ​    //​ TODO Auto-generated constructor stub 
	 } 
	  
	 ​       
	 ​public​ ​void​ ​Informacao​(){ 
	  
		 System​.​out​.​println(​"​Nome: ​"​ ​+​ nome ​+​ ​"​\n​"​ ​+ 
				 "​Idade: ​"​ ​+​ idade ​+​ ​"​\n​"​ ​+ 
				 ​"​Tempo de empresa: ​"​ ​+​ tempo_empresa ​+​ ​"​\n​"​ ​+ 
				 ​"​Salário: ​"​ ​+​ salário ​+​ ​"​\n​"​); 
		 }
	 ​         
	 ​public​ ​static​ ​void​ ​main​(​String​[] ​args​) { 
		 ​Vendedor​ ​V1​ ​=​ ​new 
				 Vendedor​(​"​Gabriel​"​, ​32​, ​9​, ​4.500​); 
		 Vendedor​ v2 ​=​ ​new​  
				 ​Vendedor​ (​"​DEpiro​"​,​43​,​20​,13.000​); 
	         
		 V1.Informacao();
		 V2.Informacao();
	 
	 ​        } 
	 ​} 
	 
	}
}

