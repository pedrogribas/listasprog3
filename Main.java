public class Main{

    public static void main(String[] args) {
        ListaSE list1 = new ListaSE();

        Cell n = new Cell(10);
        list1.insertAtStart(n);

        list1.print();

        System.out.println();

        n = new Cell(20);
        list1.insertAtEnd(n);

        list1.print();

        System.out.println();

        n = new Cell(5);
        list1.insertOrdered(n);

        list1.print();

        System.out.println();

        n = new Cell(15);
        list1.insertOrdered(n);

        list1.print();

        System.out.println();

        n = new Cell(25);
        list1.insertOrdered(n);

        list1.print();

        System.out.println();

        n = new Cell(30);
        list1.insertOrdered(n);

        list1.print();

        System.out.println();

        n = new Cell(9);
        list1.insertOrdered(n);

        list1.print();

        System.out.println();

        n = new Cell(17);
        list1.insertOrdered(n);

        list1.print();

        System.out.println();

        n = new Cell(36);
        list1.insertOrdered(n);

        list1.print();

        System.out.println();

        n = new Cell(26);
        list1.insertOrdered(n);

        list1.print();

        System.out.println();

        n = new Cell(26);
        list1.insertOrdered(n);

        list1.print();

        System.out.println();

        n = new Cell(1);
        list1.insertOrdered(n);

        list1.print();
    }

}