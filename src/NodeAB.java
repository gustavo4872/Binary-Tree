public class NodeAB {

	public int info;
	public NodeAB dir;
	public NodeAB esq;
	public NodeAB pai;
	
	public NodeAB(int x){
		this.info = x;
		this.dir = null;
		this.esq = null;
		this.pai = null;
	}
	
	//construtor padrao
	public NodeAB(){}
	
	//Metodo que retorna o elemento
	public NodeAB elemento(){
		return this;
	
	}
}
