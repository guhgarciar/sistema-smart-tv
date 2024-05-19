public class SmartTv{
    boolean ligada = true;
    int volume = 25;
    int canal = 10;

    public void ligarTv(){
        ligada = true;
    }
    public void desligarTv(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("O volume foi aumentado para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("O volume foi diminuido para: " + volume);
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void escolherCanal(int novoCanal){
        canal = novoCanal;
    }
}