import java.util.ArrayList;

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

    public void insertInMiddle(Cell c) {
        if(empty()){first = c;}
        else{
            Cell aux = first;
        }
    }

    public void sort(){
        if(empty()){System.out.println("nothing to sort here");;}
        else{
                Cell aux = first;
            while(aux!=null){
                aux = aux.getNext();
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
                ant.getNext();
            }else{
                current = first;
                first = null;
            }
            return true;
        }
    }
    
}