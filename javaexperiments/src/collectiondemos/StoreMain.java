package collectiondemos;

public class StoreMain {
    public static void main(String[] args) {
        Store<Integer> store=new Store<>();
        store.add(100);
        Integer element =store.getElement();
    }
}
