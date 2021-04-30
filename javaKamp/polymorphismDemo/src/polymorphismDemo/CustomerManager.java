package polymorphismDemo;

public class CustomerManager  {
	private BaseLogger baseLogger;
public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}

public void add() {
	System.out.println("M��teri Eklendi ");
	this.baseLogger.Log("Log mesaj�");
}
}
