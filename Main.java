public class Main{

    public static void main(String[] args) {
        q2();
    }
    public static void q1(){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        ListaSE listaQ1 = new ListaSE();
        for (int i : numbers) {
            Cell c = new Cell(i);
            listaQ1.insertAtEnd(c);
        }        
        listaQ1.print();
    }
    public static void q2() {
        
        int[] numbers = {10,9,8,7,434,5,4,3,2,1};
        ListaSE listaQ1 = new ListaSE();
        for (int i : numbers) {
            Cell c = new Cell(i);
            System.out.println(i);
            listaQ1.insertOrdered(c);
        }      
        listaQ1.print();
    }
}