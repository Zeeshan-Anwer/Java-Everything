package specialcase;


	import java.util.Scanner;
	class objectpasresult
	{
		public static void main(String[] args) {
			Scanner obj=new Scanner(System.in);
			int i,n;
			System.out.print("Enter Size of Students=");
			n=obj.nextInt();
			first student[]=new first[n];
			
			for(i=0;i<n;i++)
			{
				student[i]=new first();
				student[i].get();
			}
			for(i=0;i<n;i++)
			student[i].show();
		}
	}

	class first
	{
		String name=new String();
		int phy;
		int chem;
		int math;
		int total;

		
			void get()
			{
				Scanner obj=new Scanner(System.in);
				System.out.println("Enter Your Name=");
				name=obj.nextLine();
				System.out.println("Enter Your Physics Marks=");
				phy=obj.nextInt();
				System.out.println("Enter Your Chemistry Marks=");
				chem=obj.nextInt();
				System.out.println("Enter Your Math Marks=");
				math=obj.nextInt();

			}
			void show()
			{
				total=phy+chem+math;
				System.out.println(name+phy+chem+math+total);
			}

	}

