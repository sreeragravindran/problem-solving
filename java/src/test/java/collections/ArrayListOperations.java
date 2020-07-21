package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations {

    // does array list shift elemens on removal?
    List<Object> list;

    public  ArrayListOperations(){
        this.list = new ArrayList<>();
    }

    public void Add(Object element){
        this.list.add(element);
    }

    public void remove(Object element){
        this.list.remove(element);
    }


}
