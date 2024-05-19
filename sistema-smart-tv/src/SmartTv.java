public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumetarVolume(){
        System.out.println("Aumentando o volume para: " + volume);
        //volume = volume +1;
        volume++;
    }

    public void diminuirVolume(){
        System.out.println("Diminuido o volume para: " + volume);
        //volume = volume -1;
        volume--;
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

}