package inheritance2;

public class FileLogger extends Logger{
	@Override // kendi kodumu yazýyorum anlamýna gelir
	public void log() { //
		System.out.println("File yollandý.");
	}
}
