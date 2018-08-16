package buffer;
import java.util.Scanner;
import java.io.*;
public class Bufferstreams {

	private static BufferedInputStream bis;
	private static BufferedOutputStream bos;
	private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		System.out.println("Enter the file name with path you want to copy: ");
		String file1;
		file1 = sc.nextLine();
		String file2;
		System.out.println("Enter the file name of new file with extension: ");
		file2 = sc.nextLine();
		try
		{
			File f1 = new File(file1);
			File f2 = new File(file2);
			
			FileInputStream fis = new FileInputStream(f1);
			bis = new BufferedInputStream(fis);
			
			FileOutputStream fos = new FileOutputStream(f2);
			bos = new BufferedOutputStream(fos);
			
			int k;
			while ((k = bis.read()) != -1)
			{
				bos.write(k);
			}
		}
		catch (Exception e) {System.out.println(e);}
	}

}
