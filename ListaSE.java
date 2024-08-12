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


    public void insertAtEnd(Cell c){
        if(empty()){first = c;}
        else{
            Cell aux = first;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(c);
        }
    }
    
    public void insertOrdered(Cell c) {
        if (empty()) 
            first = c;
         else {
            Cell aux = first;
            Cell prev = null;
            while (aux != null && aux.getValue() < c.getValue()) {
                prev = aux;
                aux = aux.getNext();
            }
            if (prev == null) {
                c.setNext(first);
                first = c;
            } else {
                c.setNext(aux);
                prev.setNext(c);
            }
        }
    }

    public Cell search(int v) {
        if(empty()){return null;}
        else{
            Cell aux = first;
            while(aux != null && aux.getValue() != v){
                aux = aux.getNext();
            }
            return aux;
        }
    }

    public boolean removeAtStart() {
        if(empty()){return false;}
        else{
            Cell aux = first;
            if (aux.getNext() == null) {
                first = null;
            } else {
                first = aux.getNext();
                aux.setNext(null);
            }
            return true;
        }
    }

    public boolean removeAtEnd(){
        if(empty()){return false;}
        else{
            Cell ant = first;
            Cell current = first.getNext();
            if(current != null){
                while(current.getNext() != null){
                    ant = current;
                    current = current.getNext();
                }
                ant.next = null;
            }else{
                current = first;
                first = null;
            }
            return true;
        }
    }

    public boolean removeAtEnd2(){ /*exercise 2: remove w/ one aux reference*/
        if(empty()){return false;}
        else{
            Cell aux = first;
            while(aux.getNext().getNext()!=null){
                aux = aux.getNext();
            }
            aux.setNext(); /*sets next to null*/
            return true;
        }
    }

    public boolean removeSpecific(int v){ /*exercise 3*/
        if(empty()){return false;}
        else{
            Cell aux = first;
            while(aux.getNext().getValue()!=v){
                aux = aux.getNext();
            }
            aux.setNext(aux.getNext().getNext());
            return true;
        }
    }
    
}