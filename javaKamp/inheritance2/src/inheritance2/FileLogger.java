package inheritance2;

public class FileLogger extends Logger{
	@Override // kendi kodumu yaz�yorum anlam�na gelir
	public void log() { //
		System.out.println("File yolland�.");
	}
}
