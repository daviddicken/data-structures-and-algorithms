package utilities;

public class Gqueue {
    Gnode<String> front;
    Gnode<String> back;

    //===== Constructor =======
    public Gqueue(){
        this.front = null;
        this.back = null;
    }
    //========

    //======== enQ ===================
    public void enqueue(String type){

        Gnode<String> newNode = new Gnode<>(type);

        if(front == null){
            front = newNode;
        }else{
            newNode.setLast(back);
            back.setNext(newNode);
        }
        back = newNode;
    }
    //======== deQ (get the animal that has been here longest =====
    public String dequeue(){
        if(front == null){
            return "Sorry we are all out of dogs and cats";
        }
        String returnAnimal = front.getValue();
        front.getNext().setLast(null);
        front = front.getNext();

        return returnAnimal;
    }

    //======== deQ (animal getter) ====
    public String dequeue(String type){

        if(type == "cat" || type == "dog") {
            if (front == null) {
                return "We are all out of pets.";
            }
            Gnode<String> thisNode = front;
            while (thisNode != null) {
                if (thisNode.getValue() == type) {

                    if(thisNode.getNext() == null && thisNode.getLast() == null){
                        String returnValue = thisNode.getValue();
                        front = null;
                        back = null;
                        return returnValue;
                    }
                    if(thisNode.getNext() == null){
                        thisNode.getLast().setNext(null);

                        back = thisNode.getLast();
                        return thisNode.getValue();

                    }else if(thisNode.getLast() == null){

                        thisNode.getNext().setLast(null);

                        front = thisNode.getNext();
                        return thisNode.getValue();

                    }else {
                        //set the next pointer of the node behind this node to this nodes next node
                        thisNode.getLast().setNext(thisNode.getNext());
                        //set the pointer of the node in front of this node to this nodes last node
                        thisNode.getNext().setLast(thisNode.getLast());
                        return thisNode.getValue();
                    }
                }
                thisNode = thisNode.getNext();
            }
            return String.format("Sorry we are all out of %s's", type);
        }else {
            return null;
        }

    }

    //========= toString ==============
    public String toString(){
        if(front == null){
            return "NULL";
        }
        return toString(front);
    }
    //------------ helper ----------------
    private String toString(Gnode currentNode){

        if (currentNode.getNext() == null) {
            return currentNode.getValue() + " <-> BACK";
        }
        return currentNode.getValue() + " <-> " + toString(currentNode.getNext());
    }


}
