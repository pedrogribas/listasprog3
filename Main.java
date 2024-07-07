public class Main{

    public static void main(String[] args) {
        ListaSE list1 = new ListaSE();
        Cell cell1 = new Cell(10);
        Cell cell2 = new Cell(20);
        Cell cell3 = new Cell(30);

        list1.insertAtStart(cell1);
        list1.insertAtStart(cell2);
        list1.insertAtStart(cell3);

        list1.print();

        Cell cell4 = new Cell(5);
        list1.insertAtEnd(cell4);
        System.out.println();
        list1.print();
        
        Cell cell5 = new Cell(15);
        list1.insertInMiddle(cell5);

        System.out.println();

        list1.print();

        list1.removeSpecific(20);

        System.out.println();
        list1.print();

        list1.removeAtEnd2();
        System.out.println();
        list1.print();

        list1.removeAtEnd2();
        System.out.println();
        list1.print();

    }

}