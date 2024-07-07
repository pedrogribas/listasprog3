import java.util.Arrays;

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

    public void insertInMiddle(Cell c) { /*exercise 1*/
        if(empty()){first = c;}
        else{
            insertAtEnd(c);
            int[] arr = sort();
            while(!empty()){
                removeAtEnd();
            }
            for(int i = 0; i<arr.length; i++){
                Cell c1;
                insertAtEnd(c1 = new Cell(arr[i]));
            }
        }
    }

    private int[] sort(){
        int[] sortArr = new int[0];
        int count = 1;
        if(empty()){System.out.println("nothing to sort here");}
        else{
            Cell aux = first;
            while(aux.getNext()!=null){
                aux = aux.getNext();
                count+=1;
            }
            sortArr = new int[count];
            aux = first;
            for(int i=0; i<sortArr.length; i++){
                sortArr[i] = aux.getValue();
                aux = aux.getNext();
            }
            Arrays.sort(sortArr);
        }
        return sortArr;
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