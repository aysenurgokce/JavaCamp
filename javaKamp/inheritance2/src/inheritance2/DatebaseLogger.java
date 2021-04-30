package inheritance2;

public class DatebaseLogger extends Logger{
	@Override // kendi kodumu yazýyorum anlamýna gelir
	public void log() { //
		System.out.println("Database yollandý.");
	}
}
