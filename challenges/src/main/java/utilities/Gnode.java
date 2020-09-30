package utilities;

public class Gnode<T>{
    private T value;
    private Gnode<T> behind;
    private Gnode<T> inFront;

    public Gnode(T value) {
        this.value = value;
        this.behind = null;
        this.inFront = null;
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

    public Gnode getBehind() {
        return behind;
    }

    public void setBehind(Gnode behind) {
        this.behind = behind;
    }

    public Gnode getInFront() {
        return inFront;
    }

    public void setInFront(Gnode inFront) {
        this.inFront = inFront;
    }
}
