public class ListDE {
    Cell2 first;

    public ListDE() {
        this.first = null;
    }

    public boolean empty(){
        return first==null;
    }

    public void insertAtEnd(Cell2 c) {
        if(empty()){first=c;}
        else{
            Cell2 aux = first;
            while(aux.getNext()!=null){
                aux = aux.getNext();
            }
            aux.setNext(c);
            c.setPrior(aux);
        }
    }

    public void insertAtStart(Cell2 c){
        if(!empty()){
            c.setNext(first);
            first.setPrior(c);
        }

        first = c;
    }

    public Cell2 search(int v){
        if(empty()){return null;}
        else{
            Cell2 aux = first;

            while(aux!=null && aux.getValue()!=v){
                aux = aux.getNext();
            }
            return aux;
        }
    }

    public boolean removeAtStart(){
        if(empty()){
            return false;
        }else{
            Cell2 aux = first;
            if(aux.getNext()!=null){first=null;}
            else{
                first.setPrior(null);
                first = aux.getNext();
                aux.setNext(); //null
            }
            return true;
        }
    }

    public boolean removeAtEnd(){
        if(empty()){return false;}
        else{
            Cell2 aux = first;
            while(aux.getNext()!=null){
                aux = aux.getNext();
            }
            
        }
    }
}
