public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        smartTv.escolherCanal(35);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Estado Atual: " + smartTv.ligada);
        System.out.println("Volume Atual: " + smartTv.volume);
        System.out.println("Canal Atual: " + smartTv.canal);
    }
}
