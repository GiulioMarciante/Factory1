public class ShapeFactory {

    public static Shape getShape(Tipo tipo){
        Shape shape = null;

        switch(tipo){
            case CERCHIO -> shape = new Cerchio();
            case RETTANGOLO -> shape = new Rettangolo();
            case QUADRATO -> shape = new Quadrato();
        }
        return shape;
    }
}
