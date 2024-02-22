package collectiondemos;

public class Store<T> {
    private T value;

    public void add(T element){
        this.value=element;
    }
    public  T   getElement(){
        return value;
    }


}
