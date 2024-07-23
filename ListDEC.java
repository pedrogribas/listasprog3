public class ListDEC {
    Cell2 head;

    public ListDEC() {
        head = new Cell2(-1);
        head.setNext(head);
        head.setPrior(head);
    }

    public boolean empty(){return head.getNext()==head;}

    public void insertAtEnd(Cell2 c){
        if(empty()){
            head.setNext(c);
            c.setNext(head);
            c.setPrior(head);
            head.setPrior(c);
        }
        else{
            Cell2 aux = head.getPrior();
            aux.setNext(c);
            c.setPrior(aux);
            head.setPrior(c);
            c.setNext(head);
        }
    }

    public void insertAtStart(Cell2 c){
        Cell2 aux = head.getNext();
        head.setNext(c);
        c.setPrior(head);
        c.setNext(aux);
        aux.setPrior(c);
    }

    
}
