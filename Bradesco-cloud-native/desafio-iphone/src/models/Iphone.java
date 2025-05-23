package models;

public class Iphone implements InternetComunicator, MusicPlayer, TelephonSystem {

    // Internet Comunicator System

    @Override
    public void showPage (){
        System.out.println("Apresentando a página desejada");
    }

    @Override
    public void updateTab (){
        System.out.println("Aba atualizada com sucesso");
    }

    @Override
    public void addTab (){
        System.out.println("Nova aba adicionada ao navegador");
    }


    //Music Player System

    String musicName;

    @Override
    public void stopMusic(){
        System.out.println("Parando a reproducão da música");
    }

    @Override
    public void playMusic(){
        System.out.println("Reproduzindo a música "+ musicName);
    }

    @Override
    public void selectMusic(String musicName){
        this.musicName = musicName;
    }

    //Telephon System

    @Override
    public void aceptCall() {
        System.out.println("Aceitando a chamada recebida");
    }

    String nameContact;
    int contactNumber;

    @Override
    public void selectContact(String nameContact, int contactNumber) {

        this.nameContact = nameContact;
        this.contactNumber = contactNumber;

        System.out.println("Contato de " + nameContact + " adicionado com sucesso!");
    }

    @Override
    public void callContact() {
        System.out.println("Ligando para o contato "+ nameContact);
        
    }

    @Override
    public void closeCall() {
        System.out.println("Encerrando a chamada");
    }
}
