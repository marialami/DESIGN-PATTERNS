package abstractFactory;

public class ValentinesCake implements Cake{

    @Override
    public boolean isDecorated() {
        return false;
    }

    @Override
    public int tiers() {
        return 0;
    }
}
