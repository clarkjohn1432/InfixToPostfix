public class Stacklist{
   public class StackNode{
      String data;
      StackNode tail;
   
      public StackNode(String data){
         this.data = data;
         tail = null;
      }
   }
   private StackNode top;
   private int count;
   
   public Stacklist(){
      top = null;
      count = 0;
   }
   
   public boolean isEmpty(){
      return count == 0;
   }
   
   public boolean push(String data){
      StackNode node= new StackNode(data);
      node.tail = top;
      top = node;
      count++;
      return true;
   } 
   
   public String pop(){
      if(!isEmpty()){
         String data = top.data;
         top = top.tail;
         count--;
         return data;
      }
      return null;
   }
   
   public String peek(){
      if(!isEmpty()){
         return top.data;
      }
      return null;
   }
   
   public int getCount(){
      return count;
   }
   
   public void display(){
      if(!isEmpty()){
         StackNode temporary = top;
         while (temporary != null){
            System.out.println(temporary.data);
            temporary = temporary.tail;
         }
         System.out.println();
      }else{
         System.out.println("Stack is empty...");
      }
   }
}