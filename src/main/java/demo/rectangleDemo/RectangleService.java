package demo.rectangleDemo;

import java.util.ArrayList;
import java.util.List;

public class RectangleService {
    List<Rectangle> rectangleList = new ArrayList<>();

    public void add(Rectangle r){
        rectangleList.add(r);

    }
    public List<Rectangle> getRectangleList(){
        return rectangleList;
    }
}
