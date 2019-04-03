public abstract class Vehicle {

    protected int price;
    protected String colour;

    protected Engine engine;
    protected Tyre tyre;

    public Vehicle(int price, String colour, Engine engine, Tyre tyre){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyre = tyre;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public int getPrice() {
        return this.price;
    }






}
