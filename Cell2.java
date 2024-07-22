public class Cell2{
    int value;
    Cell2 next = null;
    Cell2 prior = null;

    public Cell2(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public Cell2 getNext() {
        return next;
    }
    public void setNext(Cell2 next) {
        this.next = next;
    }

    public void setNext(){
        this.next = null;
    }

    public Cell2 getPrior() {
        return prior;
    }
    
    public void setPrior(Cell2 prior) {
        this.prior = prior;
    }

    
}