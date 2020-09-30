package challenges.stacksandqueues.src.main.java.stacksandqueues;

public class Stack {
   public Node top;

    //========== Stack constructor ========
   public Stack() {
      top = null;
   }

  //============ push ====================
   public void push(int num){
      Node node = new Node(num);
      node.setNext(top);

      top = node;

   }

   //========= pop =====================
    public int pop() throws Exception{
       if(top == null){
           throw new Exception("The stack is empty");
       }
       int returnValue = top.getValue();
       top = top.getNext();
       return returnValue;
    }

   //========= peek ====================
    public int peek() throws Exception {
        if (top == null) {
            throw new Exception("Stack is empty");
        }
        return top.getValue();
    }

    //========= isEmpty ================
    public boolean isEmpty(){
       if(top == null) return true;
       return false;
    }

   //========== toString ================
   public String toString(){
       if(top == null){
           return "NULL";
       }
       return toString(top); }
   //------------ helper ----------------
   private String toString(Node currentNode){
    if (currentNode.getNext() == null) {
        return String.format("{%d} -> NULL", currentNode.getValue());
    }
    return String.format("{%d} -> ", currentNode.getValue()) + toString(currentNode.getNext());
   }
}
