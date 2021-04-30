package inheritance2;

public class EmailLogger extends Logger{
	@Override // kendi kodumu yazýyorum anlamýna gelir
	public void log() { //
		System.out.println("Email yollandý.");
	}
}
