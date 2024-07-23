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

    public Cell2 search(int v){
        if(empty()){return null;}

        else{
            Cell2 aux = head.getNext();
            while (aux!=head&&aux.getValue()!=v) {
                aux = aux.getNext();
            }
            return aux;
        }
    }

    public boolean removeAtStart(){
        if(empty()){ return false;}
        else{
            Cell2 aux = head.getNext();
            head.setNext(aux.getNext());
            aux.getNext().setPrior(head);
            aux.setNext(); //null
            aux.setPrior(null);
            return true;
        }
    }

    public boolean removeAtEnd() {
        if(empty()){ return false;}
        else{
            Cell2 aux = head.getPrior();
            head.setPrior(aux.getPrior());
            aux.getPrior().setNext(head);
            aux.setNext(null);
            aux.setPrior(null);
            return true;
        }
    }

    public void print(){
        Cell2 aux = head;
        while(aux!=null){
            System.out.println("Value = "+aux.getValue());
            aux = aux.getNext();
        }
    }
}
