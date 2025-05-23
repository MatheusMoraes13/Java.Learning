import models.Iphone;

public class Main {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        //Internet comunicator system test
        iphone.addTab();
        iphone.updateTab();
        iphone.showPage();

        //Music player system test
        iphone.selectMusic("Samurai, Djavan");
        iphone.playMusic();
        iphone.stopMusic();

        //Phone system test
        iphone.selectContact("Brenda Ferreira", 12345);
        iphone.callContact();
        iphone.aceptCall();
        iphone.closeCall();
    }
}
