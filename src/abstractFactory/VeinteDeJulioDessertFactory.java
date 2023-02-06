package abstractFactory;

public class VeinteDeJulioDessertFactory implements DessertFactory{

    @Override
    public Cake createCake() {
        Cake veinteDeJulioCake = new VeinteDeJulioCake();
        System.out.println("Added cake to veinte de julio package");
        return veinteDeJulioCake;
    }

    @Override
    public Cookie createCookie() {
        Cookie veinteDeJulioCookie = new VeinteDeJulioCookie();
        System.out.println("Added cookie to veinte de julio package");
        return veinteDeJulioCookie;
    }

    @Override
    public Pie createPie() {
        Pie veinteDeJulioPie = new VeinteDeJulioPie();
        System.out.println("Added pie to veinte de julio package");
        return veinteDeJulioPie;
    }
}
