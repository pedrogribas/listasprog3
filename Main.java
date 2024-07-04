public class Main{

    public static void main(String[] args) {
        ListaSE list1 = new ListaSE();
        Cell cell1 = new Cell(10);
        Cell cell2 = new Cell(20);
        Cell cell3 = new Cell(30);

        list1.insertAtStart(cell3);
        list1.insertAtStart(cell2);
        list1.insertAtStart(cell1);

        list1.print();
    }

}