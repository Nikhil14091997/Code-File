import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.regex.*;
import java.math.*;
class Reservation
{
	
	/*class Table
	{
		public int capacity;
		public int id;
		Table(int capacity,int id)
		{
			this.capacity = capacity;
			this.id = id;
		}
	}
	*/
	public int getTableId(int requiredCapacity,Map<Integer,Integer> map)
	{
		int response = -1;
		for(Integer i : map.keySet())
		{
			Integer str = map.get(i);
			if(str == requiredCapacity)
			{
				response = str;
				break;
			}
		}
		return response;
	}

	public void getTableWithGivenCapacity(int requiredCapacity,String path,Map<Integer,Integer> map)
	{
		if(/*map.contains*/(requiredCapacity)==4 || requiredCapacity == 2){
			System.out.println("Table Available!!");
			System.out.println("Want to book ? (Yes/No)");
			Scanner sc = new Scanner(System.in);
			String response = sc.next();
			if(response.equals("Yes"))
			{
				int get = getTableId(requiredCapacity,map); // get the id of table with given required capacity
				Book(get); // book the tabe with given id
			}
			else
			{
				System.out.println("Booking Canceled!!");
				System.out.println("Data Deleted from recorded");
				File file = new File(path);
				if(file.delete()) 
		        { 
		            System.out.println("File deleted successfully"); 
		        } 
		        else
		        { 
		            System.out.println("Failed to delete the file"); 
		        } 
			}
		}
		else
		{
			System.out.println("Table of Required Capacity is not Available!!");
		}
	}
	public void Book(int givenID)
	{
		int lul = givenID;
		System.out.println("Booking Done !! \n Booking id(Table) =  "+(givenID+100));
	}
	public static void main(String args[]) throws IOException 
	{
		Map<Integer,Integer> map  = new HashMap<Integer,Integer>();
		map.put(1,4);
		map.put(2,4);
		map.put(3,4);
		map.put(4,4);
		map.put(5,2);
		map.put(6,2);
		map.put(7,2);
		Scanner sc = new Scanner(System.in);
		Reservation res = new Reservation();
		String data0 = "Costumer's Name --> ";
		String data1 = "Costumer's Address --> ";
		String data2 = "Costumer's Table Capacity requirement --> ";
		String data3 = "Chosen cuisine --> ";
		String data4 = " Chosen Booking Time --> ";
		System.out.println("Enter your First name:");
		String text = sc.next();
		FileWriter fw = new FileWriter(text);
		String[] data = new String[5];
		data[0] = text;
		data[0] = data0 + data[0]; 
		System.out.println("Enter the address");
		data[1] = sc.next();
		data[1] = data1 + data[1];
		System.out.println("Enter the table capacity requirement(Only capacity od 2 and 4 are Available):");
		data[2] = sc.next();
		int data21 = Integer.parseInt(data[2]);
		data[2] = data2 + data[2];
		System.out.println("Enter the cuisine:");
		data[3] = sc.next();
		data[3] = data3 + data[3];
		System.out.println("Enter time for booking:");
		data[4] = sc.next();
		data[4] = data4 + data[4]; 
		String enter = "\n";
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<5;i++)
		{
			sb.append(data[i]);
			sb.append(enter);
		}
		//System.out.println(sb.toString());
		String finalEntry = sb.toString();
		for (int i = 0; i < finalEntry.length(); i++){
			fw.write(finalEntry.charAt(i)); 
		}
		String path = "C:\\Users\\nikhil\\Documents\\java programs" ;
		System.out.println(" *****************  Your Entry has been recorded ******************* \n Check your java executable folder your File with your userName(FurstName)");
		res.getTableWithGivenCapacity(data21,path,map);
        fw.close();
		sc.close();

	}
}