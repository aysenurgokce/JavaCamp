package inheritance2;

public class EmailLogger extends Logger{
	@Override // kendi kodumu yaz�yorum anlam�na gelir
	public void log() { //
		System.out.println("Email yolland�.");
	}
}
