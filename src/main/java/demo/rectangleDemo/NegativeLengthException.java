package demo.rectangleDemo;

public class NegativeLengthException extends GeometryException{
    double value;

    public NegativeLengthException(double value, String msg) {
        super(msg);
        this.value = value;
    }


}
