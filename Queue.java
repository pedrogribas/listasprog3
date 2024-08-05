public class Queue{
    private Cell front;
    private Cell back;
    
    public Queue() {
        this.front = null;
        this.back = null;
    }

    public Cell getFront() {
        return front;
    }

    public void setFront(Cell front) {
        this.front = front;
    }

    public Cell getBack() {
        return back;
    }

    public void setBack(Cell back) {
        this.back = back;
    }

    public boolean empty(){
        return front==back;
    }

    public void addToQueue(Cell c){
        this.back.setNext(c);
        setBack(c.getNext());
        this.back.setNext(null);
    }
    
    public Cell removeFromQueue() throws Exception{
        Cell i = null;

        if(empty()){
            throw new Exception("empty queue");
        }else{
            i = front.getNext();
            front.setNext(i.getNext());
            i.setNext(null);
            if(back == i){
                setBack(front);
            }
        }
        return i;
    }

    public void display() throws Exception{
        if(empty()){throw new Exception("empty queue");}
        else{
            Cell aux = front.getNext();
            while (aux != null) {
                System.out.println(aux.getValue());
                aux = aux.getNext();
            }
        }
    }
}