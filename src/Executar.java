
public class Executar {

	public Executar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Lutador l[] = new Lutador[6]; //instancia varios lutadores
		
		l[0] = new Lutador("Pretty Boy", "Fran�a", 31, 1.75f,
							68.9f, 11 ,2,1);
		
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f,
				57.8f, 14 ,2,3);
		
		l[2] = new Lutador("Snapshadow", "EUA", 3135, 1.65f,
				80.9f, 12 ,2,1);
		
		l[3] = new Lutador("Dead code", "Austr�lia", 28, 1.70f,
				119.3f, 5 ,4,3);
		
		l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f,
				119.3f, 5 ,4,3);
		
		l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f,
				105.7f, 12 ,2,4);
		
		/*for(int i=0; i < l.length; i++)
		{
			l[i].status();
		}*/
		
		l[0].status();
		System.out.println("Pretty boy perdeu uma luta");	
		l[0].perderLuta();
		l[0].status();
	}

}
