
public class Criptografia {
	
	private String frase;
	private int cifra;
	public String getFrase() {
		return frase;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	public int getCifra() {
		return cifra;
	}
	public void setCifra(int cifra) {
		this.cifra = cifra;
	}
	
	public void criptar() {
		for (char c : frase.toCharArray()) 
			System.out.println((char) ((int)c + cifra));		
	}
	
	public void descriptar() {
		for (char c : frase.toCharArray()) 
			System.out.println((char) ((int)c - cifra));		
	}
	
	
	

}
