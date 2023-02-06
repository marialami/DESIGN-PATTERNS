package strategy;

public class MalteadaEnAgua implements SaborMalteada{
    @Override
    public void realiceMalteada() {
        System.out.println("Se realizo la malteada en agua");
    }
}
