    public class MultDemo  
    {  
      
      public static void main(String[] args)  
    {  
    //System.out.print("   ");
    
    for (int j = 1; j <= 9; j++)  
    System.out.print("  " + j + "\t");  
    System.out.print('\n');
    System.out.println("--------------------------------------------------------------------------------------");
      
    for (int i = 1; i <= 9; i++)  
       
    {  
    System.out.print("" + i + "|");  
    for (int j = 1; j <= 9; j++)  
    {  
    String tableFormat = "";  
      
    if (i * j < 10)  
    {  
    tableFormat += "  " + i * j;  
    System.out.print(tableFormat + "\t");  
    }  
    else   
    {  
    tableFormat += " " + i * j;  
    System.out.print(tableFormat + "\t");  
    }  
    }  
    System.out.print('\n');  
    }  
    }  
       
    }  