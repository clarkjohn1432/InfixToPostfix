public class Evaluate{
   private String postfix;
     
   public Evaluate(String p){
      postfix = p;
   }
   
   public double getResult(){
      Stacklist s = new Stacklist();
      double ans = 0;
      for(int i = 0; i < postfix.length(); i++){
         char ch = postfix.charAt(i);
         if(Character.isDigit(ch)){
            s.push(ch + "");
         }
         else{
            double val2 = Double.parseDouble(s.pop());
            double val1 = Double.parseDouble(s.pop());
            
            switch(ch){
               case '*':
                  ans = val1*val2;
                  break;
               case '/':
                  ans = val1/val2;
                  break;
               case '+':
                  ans = val1+val2;
                  break;
               case '-':
                  ans = val1-val2;
                  break;
            }
            s.push(ans + " ");
         }
      }
     return Double.parseDouble(s.pop());
   }
}