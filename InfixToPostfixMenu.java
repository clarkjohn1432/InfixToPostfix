import java.util.*;

public class InfixToPostfixMenu{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String input = "", postFix = "", choice;

      do{         
         System.out.println("\nThis Menu will convert the infix to postfix ");
         System.out.println("[1] Convert infix to postfix ");
         System.out.println("[2] Evaluate postfix ");
         System.out.println("[3] Exit ");
         System.out.print("Select a choice: ");
         choice = scan.nextLine();
         switch(choice){
            case "1":
               try{        
                  System.out.println("Enter Infix Expression: ");
                  input = scan.nextLine().trim().toUpperCase();
                  InfixtoPostfix to = new InfixtoPostfix(input);
                  postFix = to.convert();
                     System.out.println("The Infix Expression: " + input + " converted to postfix: " + postFix);
                  }catch(Exception e){
                     System.out.println("Error!");
                  }
               break;
            case "2":
               try{
                  Evaluate eval = new Evaluate(postFix);
                  System.out.println("Evaluation of " + input + " is " + eval.getResult() + "\n");
                  }catch(Exception e){
                     System.out.println("Error! String can't converted into postfix");
                  }
               break;             
            case "3":
               System.out.println("Thank you!");
               break;         
           default:
               System.out.println("Invalid, Your choice is beyond the choices");   
         }
      } while(choice != "3");
                   
   }
}