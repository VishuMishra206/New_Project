20import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user date");
		String userdate=sc.next();
   // LocalDateTime dat1=LocalDateTime.now();
    //System.out.println("before formatting : " + dat1);
    DateTimeFormatter fmtdate= DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
    //String formattedDate = dat1.format(fmtdate);
    //System.out.println("after formatting : " + formattedDate);
	}

}









