import java.io.*;
class copyfile{
public static void main(String args[]) throws IOException
{
int i;
FileInputStream fin = new FileInputStream("A.txt");
FileOutputStream fout = new FileOutputStream("B.txt");
do
{
	i=fin.read();
	if(i!=-1)
	{
		fout.write(i);
		System.out.println((char)i);
}
}
while(i!=-1);
fin.close();
fout.close();
}
}
