public class Main {
    public static void main(String[] args) {
        SingleWayOneList singleList = new SingleWayOneList();
        singleList.add(1);
        singleList.add(2);
        singleList.add(3);
        singleList.display();
        singleList.removeLast();
        singleList.display();

        DoubleWayList doubleList = new DoubleWayList();
        doubleList.add(1);
        doubleList.add(2);
        doubleList.add(3);
        doubleList.display();
        doubleList.removeLast();
        doubleList.display();
    }
}
