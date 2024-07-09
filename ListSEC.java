public class ListSEC{
    private Cell head;

    public ListSEC() {
        Cell head = new Cell(-1);
        head.setNext(head);
        this.head = head;
    }

    public void insertAtStart(Cell c){
        c.setNext(head.getNext());
        head.setNext(c);
    }
    

    public void insertAtEnd(Cell c) {
        if(empty()){
            head.setNext(c);
            c.setNext(head);
        }else{
            Cell aux = head.getNext();
            while(aux.getNext()!=head){
                aux = aux.getNext();
            }
            aux.setNext(c);
            c.setNext(head);
        }
    }

    public boolean removeAtEnd(){
        if(empty()){return false;}
        else{
            Cell aux = head.getNext();
            while(aux.getNext().getNext()!=head){
                aux = aux.getNext();
            }
            Cell aux2 = aux.getNext();
            aux.setNext(head);
            aux2.setNext();
            return true;
        }        
    }

    public boolean removeAtStart() {
        if(empty()){return false;}
        else{
            Cell aux = head.getNext();
            head.setNext(aux.getNext());
            aux.setNext(); //points to null
            return true;
        }
    }
     
    public boolean empty(){
        return (head.getNext()==head);
    }

    public Cell search(int v){
        if(empty()){return null;}
        else{
            Cell aux = head.getNext();
            while(aux.getNext()!=head && aux.getValue()!=v){
                aux = aux.getNext();
            }
            return aux;
        }
    }
    
}