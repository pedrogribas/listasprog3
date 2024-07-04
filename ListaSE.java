public class ListaSE{
    Cell first;

    public ListaSE() {
        this.first = null;
    }

    public boolean empty(){
        return first==null;
    }

    public void insertAtStart(Cell c){
        c.setNext(first);
        first = c;
    }

    public void print(){
        Cell aux = first;
        while(aux!=null){
            System.out.println("Value = "+aux.getValue());
            aux = aux.getNext();
        }
    }
    
}