import java.util.*;
public class ipcalc
{
    public static Scanner input= new Scanner(System.in);

    public static int[] ip;
    public static int[] bits,cidr,network,broadcast,subnet;
    public static void main(String[]args)
    {
        int x;

        ip          = new int[4];
        
        System.out.print("Enter IP Address: ");
        ip[0] = input.nextInt();
        ip[1] = input.nextInt();
        ip[2] = input.nextInt();
        ip[3] = input.nextInt();
        System.out.print("Enter number of network/s: ");
        x = input.nextInt();
        bits        = new int[x];
        cidr        = new int[x];
        network     = new int[x];
        broadcast   = new int[x];
        subnet      = new int[x];
        
        ipClass();
        loop(x);
        traverse(x);
    }
    public static String ipClass()
    {
        if(ip[0]<=127)
            return "A";
        if(ip[0]>127 && ip[0]<=191)
            return "B";
        if(ip[0]>191 && ip[0]<=223)
            return "C";
        else
            return "IP class not programmed or invalid IP";  
    }
    public static void loop(int xx)
    {
        for(int y=0;y<xx;y++)
        {
            System.out.print("Enter number of hosts: ");
            int host = input.nextInt();
            bits[y] = borrowedBits(host);
            cidr[y] = cidrCalc(bits[y]);
            
            
            
            
            
            
            
            
            
        }
        
    }
    public static int borrowedBits(int host)
    {
        int borrowed = 2;
        double power=0;
    
            while(power<host)
            {
                power = Math.pow(2,borrowed);
                borrowed++;
            }
          
        return  borrowed-1;
    }
    public static int cidrCalc(int xx)
    {
        int cidr = 32-bits[xx];
        return cidr;        
    }
    
    
    public static void traverse(int xx)
    {
        for(int y=0;y<xx;y++)
        {
            System.out.println(bits[y]+"\t\t"+cidr[y]);
        }
    }
}