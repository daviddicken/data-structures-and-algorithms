package utilities;

public class Gnode<T>{
    private T value;
    private Gnode<T> next;
    private Gnode<T> last;

    public Gnode(T value) {
        this.value = value;
        this.next = null;
        this.last = null;
    }

    //========= toString ===========================
    public String toString(){
        String returnString = "value = " + value;

        //return String.format("value = %T", value);
        return returnString;
    }

    //========= Getters & Setters ==================

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Gnode getNext() {
        return next;
    }

    public void setNext(Gnode next) {
        this.next = next;
    }

    public Gnode getLast() {
        return last;
    }

    public void setLast(Gnode last) {
        this.last = last;
    }
}
