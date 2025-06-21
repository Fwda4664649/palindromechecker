public class Main {//main function

// This is one way of checking if its a palindrome or not
  //here we take the input string and and initialize another empty string to rverse it using for loop char by char and store it in the empty string
  //and then we check if both are equal say yes else no
  //here we have created a string return type function
    public static String palcheck(String x)
    {
         String q = "";
         for(int i=x.length()-1;i>=0;i--)
         {
            q = q + x.charAt(i);
            
         }
         System.out.println(q);
         if(x.equals(q))
         {
            return "yes";
         }
         else{
            return "no";
         }
    }
//this is another way
  //here we check first and last chars if true we give a signal and if that signal is there we say "no" else "yes"

    public static void palcheckalt(String x)
    {
        int l = x.length();
        int k=0;
        for(int i=0;i<=l/2;i++)
        {
            if(x.charAt(i)!=x.charAt(l-i-1))
            {
                k++;

            }
           
        }
        if(k>1){
            System.out.println("No");

        }
        else{
            System.out.println("Yes");
        }
    }
  //From here(main) , the compiler starts reading code
    public static void main(String[] args)
    {
        palcheckalt("malayalam");//here we have called a function now the compiler will check for this function
    }
}
