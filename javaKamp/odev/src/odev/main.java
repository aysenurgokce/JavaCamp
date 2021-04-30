package odev;

public class main {

	public static void main(String[] args) {
		Feature feature0 = new Feature();
		feature0.menu="Profil Düzenle";
		Feature feature1 = new Feature();
		feature1.menu="Üyelikleri Yönet";
		Feature feature2 = new Feature();
		feature2.menu="Kart bilgisi veya deðiþtir";
		Feature feature3 = new Feature();
		feature3.menu="Address";
		Feature feature4 = new Feature();
		feature4.menu="Ýletiþim";
		Feature feature5 = new Feature();
		feature5.menu="Çýkýþ";
		
		Program program1 = new Program("Programlamaya Giriþ Ýçin Temel Kurs", "Engin Demiroð");
		Program program2 = new Program("Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA+ REACT)", "Engin Demiroð");
		Program program3 = new Program("Yazýlým Geliþtirici Yetiþtirme Kampý(C# + ANGULAR)", "Engin Demiroð");
		
		Program[] program = {program1,program2,program3};
		for (Program program4 : program) {
			System.out.println("Kurs :"+program4.name + " Eðitmen :"+ program4.teacher);
		}

		Feature[] feature = {feature0,feature1,feature2,feature3,feature4,feature5};
		for (Feature feature6 : feature) {
			System.out.println(feature6.menu);
		}
		Business business = new Business();
		business.course(feature0);
		business.course(feature1);
		business.course(feature2);
		business.course(feature3);
		business.course(feature4);
		business.course(feature5);
		
		business.lesson(program1);
		business.lesson(program2);
		business.lesson(program3);
	}

}
