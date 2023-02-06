package abstractFactory;

public class ValentinesCookie implements Cookie{

    @Override
    public boolean isDoughReady() {
        return false;
    }

    @Override
    public int amountInBatch() {
        return 0;
    }
}
