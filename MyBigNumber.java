import java.util.Scanner;
public class MyBigNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat");
        String a = sc.nextLine();
		System.out.println("Nhap so thu hai");
        String b = sc.nextLine();
        System.out.println(Tong(a,b));
        
    }
    public static String Tong( String str1 , String str2)
    { 			
		int t = 1;
		String Tong = "";
        String a = str1;
        String b = str2;
		int Bonho = 0;
        int Tongso = 0;
        if (a.length() < b.length())
        { 
            String item = b;
            b = a;
            a = item;
        } 
        while (a.length() - t >= 0)
        {
            if (b.length() - t < 0) 
            {
                 Tongso = a.charAt(a.length() - t)-'0' + Bonho;
            } 
			else
            {     
				Tongso = a.charAt(a.length() - t)-'0' + b.charAt(b.length() - t)-'0' + Bonho;
            }
            if (Tongso < 10)
            {
                Bonho = 0;
            } 
			else
            {
                Bonho = 1;
            }
            Tong = Integer.toString(Tongso % 10) + Tong;
            t++ ;
        }
        if (Bonho == 1)
        {
            Tong = Integer.toString(Bonho) + Tong;
        }
        return Tong;
    }  
}