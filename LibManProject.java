import java.util.Scanner;
public class LibManProject
{
	public static void main(String arg[])
	{
		char r;
		do
		{
			
		System.out.print("********** Libray Management System **********");
		System.out.print("\n\t Press 1 to add Book ");
		System.out.print("\n\t Press 2 to issue a Book ");
		System.out.print("\n\t Press 3 to return a Book: ");
		System.out.print("\n\t Press 4 to print complete issue details ");
		System.out.print("\n\t Press 5 to exit ");
		
		Scanner obj1=new Scanner(System.in);
		System.out.print("\n\t Enter any number: ");
		int a=obj1.nextInt();
		switch(a)
		{
			case 1:
				Library ss=new Library();
				ss.add();
				break;
			
			case 2:
				Library tt=new Library();
				tt.iss();
				break;
				
			case 3:
				Library uu=new Library();
				uu.ret();
				break;
				
			case 4:
				Library vv=new Library();
				vv.detail();
				break;
				
			case 5:
				Library add=new Library();
				add.exit();
				break;
				
			default:
				System.out.print("\n\t Invalid Number ");
		}
		System.out.print("\n\t You want to select next option Y/N: ");
		r=obj1.next().charAt(0);
		}
		while(r=='y'||r=='Y');
		if(r=='n'||r=='N')
		{
			Library z=new Library();
			z.exit();
		}
		
	}
}
class Library
{
	static String str,b,date;
	static int a,c;
	void add()
	{
		System.out.print("Enter the Name, Prize and Book_No: ");
		Scanner obj2=new Scanner(System.in);
		String str=obj2.nextLine();
		float price=obj2.nextInt();
		int Bookno=obj2.nextInt();
		System.out.print("\n\t Your Details are "+  str  +  price  +  Bookno);
	}
	void iss()
	{
		Scanner obj3=new Scanner(System.in);
		System.out.print("\n\t Book Name: ");
		str=obj3.nextLine();
		System.out.print("\n\t book_Id: ");
		a=obj3.nextInt();
		obj3.nextLine();
		System.out.print("\n\t Issue Date: ");
		b=obj3.nextLine();
		System.out.print("\n\t Total number of book issued: ");
		c=obj3.nextInt();
		obj3.nextLine();
		System.out.print("\n\t Return book date: ");
		date=obj3.nextLine();
	}
	int getid()
	{
		return a;
	}
	void ret()
	{
		System.out.print("\n\t enter Student_name & Book_Id: ");
		Scanner c =new Scanner(System.in);
		String name=c.nextLine();
		int bookid=c.nextInt();
		if(a==bookid)
		{
			System.out.print("Total Details: ");
			System.out.print("Book Name:: "+Library.str);
			System.out.print("Book Id:: "+Library.a);
			System.out.print("Issue Date:: "+Library.b);
			System.out.print("Total Number of Book Issued:: "+Library.c);
			System.out.print("Book Return date:: "+Library.date);
		}
		else
		{
			System.out.print("Wrong Id, Plz enter correct id: ");
		}
	}
	void detail()
	{
		System.out.print("Book Name:: "+Library.str);
		System.out.print("Book Id:: "+Library.a);
		System.out.print("Issue Date:: "+Library.b);
		System.out.print("Total Number of Book Issued:: "+Library.c);
		System.out.print("Book Return date:: "+Library.date);
	}
	void exit()
	{
		System.exit(0);
	}
}
