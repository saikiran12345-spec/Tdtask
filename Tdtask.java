import java.lang.*;
import java.util.*;
public class Tdtask 
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        if(str.charAt(0)=='A'&&str.charAt(1)=='A')
        {
            //str.deleteCharAt(0);
            str=charRemoveAt(str,0);
            str=charRemoveAt(str,0);
        }
        else if(str.charAt(1)=='A')
       {
            str=charRemoveAt(str, 1);
       }
       else if(str.charAt(0)=='A')
       {
           str=charRemoveAt(str, 0);
       }
        System.out.print(str);
    }
    public static String charRemoveAt(String s,int pos)
    {
        return s.substring(0, pos)+ s.substring(pos + 1);
    }
    
}