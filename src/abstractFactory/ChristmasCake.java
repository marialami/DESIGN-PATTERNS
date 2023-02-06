package abstractFactory;

public class ChristmasCake implements Cake{

    @Override
    public boolean isDecorated() {
        return false;
    }

    @Override
    public int tiers() {
        return 0;
    }
}
