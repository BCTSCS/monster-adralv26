public class MagpieRunner { 
public static void main(String[] args)
   {
     Magpie maggie = new Magpie();

     System.out.println(maggie.getGreeting());
     System.out.println(maggie.getResponse("My mother and I talked last night."));
     System.out.println(maggie.getResponse("I said no!"));
     System.out.println(maggie.getResponse("What are you"));
     System.out.println(maggie.getResponse("asdfghjkl;"));
     System.out.println(maggie.getResponse("My dog is cute."));
     System.out.println(maggie.getResponse("My cat runs around all the time!"));
     System.out.println(maggie.getResponse("My favorite teacher is Ms. Orsun."));
     System.out.println(maggie.getResponse(" "));




   }
}