package Models;

public class Maquina {

    private int water;
    private boolean clean;
    private int shampoo;
    private Pet pet;

    public void takeAShouwer(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
        }

        this.water -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        System.out.println("O pet" + pet.getNome() + "está limpo");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade de água da maquina está no máximo");

            return;
        } 

        water += 2;
    }

    public void addShampoo(){
        if (water == 30){
            System.out.println("A capacidade de shampoo da maquina está no máximo");

            return;
        } 

        shampoo += 2;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet (){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){

            System.out.println("A máquina está suja, para colocar pet é necessário limpa-la");

        }

        if (hasPet()){
            System.out.println("O pet" + this.pet.getNome() + " está na máquina no momento");
        }



        this.pet = pet;
    }

    public void removePet(){
        this.clean = this.pet.isClean();

        System.out.println("O pet está"+ this.pet.getNome() +"está limpo");

        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean =true;

        System.out.println("A máquina está limpa");
    }

}
