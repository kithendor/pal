public class MyClass {
    public static void main(String args[]) {
         int[] arr = new int[] { 2, 5, 8 };
        
        System.out.println("Asdddsad");
        
        int ekp = 8;
        int max = 8;
        boolean vrethike = false;
        boolean next = false;
        
     
        while(ekp<=80000 && vrethike==false)
        {
          
         
            for(int i=0;i<3;i++)
            {
                if(ekp % arr[i] != 0)
                {
                    next = true;
                    break;
                }
            }
            
            if(next==true)
            {
                ekp+=8;
                next = false;
            }
            else
            {
                vrethike=true;
            }
        }
        
        System.out.println(ekp);
    }
}
