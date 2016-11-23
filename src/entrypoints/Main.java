package entrypoints;

public class Main {

	public void n() {
		Atributos atr = new Atributos("teste");
		String x = atr.getY();
		m(x);
	}
	
	public void m(String x) {
		String w = x + " passou";
		System.out.println(w);
	}
}
