
package testcompiler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;



public class TestCompiler {


public static void main(String[] args) {

    try{
            Scanner scanner = new Scanner(new File("myfile.txt"));
            int [] tall = new int [100];

            for(int i=0;i<8;i++)
            {
                if(i==0)
                {
                    scanner.nextInt();
                }
               tall[i] = scanner.nextInt();
            }
            for(int j=0;j<8;j++)
            {
                System.out.println(tall[j]);
            }
    }
catch(Exception ex)
        {
        
        }


		
   
}
}
   
