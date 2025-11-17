public class Magpie
{
   public String getGreeting()  {return "Hello, let's talk.";}
   public String getResponse(String statement)
   {
     String response = "";
     if (statement.indexOf("no") >= 0) {
       response = "Why so negative?";
     } else if (statement.indexOf("mother") >= 0
                 || statement.indexOf("father") >= 0
                 || statement.indexOf("sister") >= 0
                 || statement.indexOf("brother") >= 0) {
       response = "Tell me more about your family.";
     } else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0) {
      response = "Tell me more about your pets.";
     } else if (statement.indexOf("Mr.") >= 0) {
      response = "He sounds like a good teacher.";
     } else if (statement.indexOf("Ms.") >= 0) {
      response = "She sounds like a good teacher.";
     } else if (statement.trim().length() == 0){
      response = "There's nothing, try again and type something.";
     }
     else {
       response = getRandomResponse();
     }
     return response;
   }
   private String getRandomResponse()
   {
     final int NUMBER_OF_RESPONSES = 6;
     double r = Math.random();
     int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
     String response = "";

     if (whichResponse == 0) {
       response = "Interesting, tell me more.";
     } else if (whichResponse == 1) {
       response = "Hmmm.";
     } else if (whichResponse == 2) {
       response = "Do you really think so?";
     } else if (whichResponse == 3) {
       response = "You don't say.";
     } else if (whichResponse == 4) {
       response = "Surprising!";
     } else if (whichResponse == 5) {
       response = "Can I go home now?";
     }
     return response;
       }
  }