import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int round;
	private boolean aprovada;
	
	//metodos
	public void marcarLuta(Lutador l1,Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) { //regra de negocio = as categorias devem ser iguais para a luta
			this.aprovada= true;
			this.desafiado= l1;
			this.desafiante= l2;
		}
		else {
			this.aprovada= false;
			this.desafiado= null;
			this.desafiante= null;
		}
	}
	public void lutar() {
		if(this.aprovada) {
			System.out.println("Apresentando os lutadores");
			this.desafiado.apresentar();
			this.desafiante.apresentar();
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			System.out.println("------------------------");
			System.out.print("RESULTADO DA LUTA: ");
			switch (vencedor) {
			
			case 0: //empate
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
				
			case 1: //ganhou desafiado
				System.out.println(this.desafiado.getNome() +" ganhou");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2: //ganhou desafiante
				System.out.println(this.desafiante.getNome()+ " ganhou");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
			System.out.println("------------------------");
			System.out.println("ATUALIZAÇÃO");
			System.out.println("------------------------");
			System.out.println("DESAFIADO");
			System.out.println("------------------------");
			this.desafiado.status();
			System.out.println("------------------------");
			System.out.println("DESAFIANTE");
			System.out.println("------------------------");
			this.desafiante.status();
		}
		else {
				System.out.println("Luta não pode acontecer");
			}
	}
	
	
	//getters e setters
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}	
}
