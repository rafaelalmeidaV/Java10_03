package aula10_03;

public class TestaProduto {

	public static void main(String[] args) {
	Produto prod1 = new Produto(6, "Smartphone", 3200);
	Produto prod2 = new Produto(7,"notebook",3700);
	
	System.out.print("Produto 1: "+ 
	prod1.getCodigo()+" "+ 
	prod1.getDescricao()+ " "+
	prod1.getPreco());
	
	System.out.print("Produto 2: "+ 
	prod2.getCodigo()+" "+ 
	prod2.getDescricao()+ " "+
	prod2.getPreco());


	}

}
