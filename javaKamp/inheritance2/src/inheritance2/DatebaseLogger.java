package inheritance2;

public class DatebaseLogger extends Logger{
	@Override // kendi kodumu yaz�yorum anlam�na gelir
	public void log() { //
		System.out.println("Database yolland�.");
	}
}
