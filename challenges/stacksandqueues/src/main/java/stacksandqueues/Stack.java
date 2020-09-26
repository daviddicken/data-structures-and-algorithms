package stacksandqueues;

public class Stack {
   public Node top;

   //========== Stack constructor ========
   public Stack() {
      this.top = null;
   }

  //============ push ====================
   public void push(int num){
      Node node = new Node(num);
      node.setNext(top);
      top = node;
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
    return String.format("{%d} -> ", currentNode.getNext()) + toString(currentNode.getNext());
   }
}
