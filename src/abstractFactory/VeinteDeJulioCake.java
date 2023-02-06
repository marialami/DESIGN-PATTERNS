package abstractFactory;

public class VeinteDeJulioCake implements Cake{

    @Override
    public boolean isDecorated() {
        return false;
    }

    @Override
    public int tiers() {
        return 0;
    }
}
