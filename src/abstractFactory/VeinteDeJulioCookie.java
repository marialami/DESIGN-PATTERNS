package abstractFactory;

public class VeinteDeJulioCookie implements Cookie{

    @Override
    public boolean isDoughReady() {
        return false;
    }

    @Override
    public int amountInBatch() {
        return 0;
    }
}
