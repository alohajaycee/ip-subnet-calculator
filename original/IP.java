import java.util.*;

public class IP
{
    public static Scanner input = new Scanner (System.in);
    public static int[] ip;
    public static int host;
    
    public static void main(String[]args)
    {
        getIP();
        borrowedBits();
        cidr(borrowedBits(bits));
    }
    public static void getIP()
    {
        ip = new int[4];
        System.out.print("Enter IP address ( separate with space only): ");
        ip[0]=input.nextInt();
        ip[1]=input.nextInt();
        ip[2]=input.nextInt();
        ip[3]=input.nextInt();
    }
    public static String checkIP()
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
    public static void subnetCalc(int cidr)
    {
        int x=0;
        int counter=0;
        int total=0;
        int subnet;
        int[] bits = {128,64,32,16,8,4,2,1};
        if(checkIP().equals("C"))
        {
            while(counter!=cidr)
            {
                for(x=0; x<8;x++)
                {
        
                    if(cidr==counter)
                        break;
                    else
                        counter++;
                }
            }
           
            while(x<8)
            {
                total += bits[x];
                x++;
            }
        subnet = 255-total;
     
        System.out.println(subnet);    
        }
    }
    public static void networkNo()
    {
        int net;
        int[] bits = {128,64,32,16,8,4,2,1};
        System.out.print("Enter number of host: ");
        net = input.nextInt();
        
        
        
    }
    public int borrowedBits(int bits)
    {
        

        bits = 2;
        System.out.print("Number of host: ");
        host = input.nextInt();
        double power=0;
    
            while(power<host)
            {
                power = Math.pow(2,bits);
                bits++;
            }
          
        return bits-1;
        
        
    }
    public int  cidr(int x)
    {
        cidr = 32-x;
        return cidr;
    }

    
}