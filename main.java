package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

	


public class main {
	
	
	public static int Rank=0;
	public static String Report="";
	static int MaxTrapAmount=0;
	static int MinTrapAmount=0;
	static void now(String ... StrArr) {
			Track.ClearConsole();
			for (int i = 0;i < StrArr.length;i++)
			{
			System.out.println(StrArr[i]);
			Track.divider();

			}

			}
	static void now(String str)
	{
		System.out.println(str);
		Track.divider();
	}
			
	
	public static void main(String[] args) throws InterruptedException   { 
		Scanner input = new Scanner(System.in);
		
		int BlockAmount ;
		String str = "███";
		System.out.printf("******** 設定 ********\n");
		System.out.printf("選手數量 =>");
		BlockAmount = input.nextInt();
		System.out.printf("陷阱最小數量 =>");
		MinTrapAmount=input.nextInt();
		System.out.printf("陷阱最大數量 =>");
		MaxTrapAmount=input.nextInt();
		input.nextLine();
		    
		Block[] BlockPlayer = new Block[BlockAmount];
		Racing[] racing = new Racing[BlockAmount];
		System.out.println("是否需要設定選手名稱(是請輸入y，否則隨意輸入)");
		char YN ;
		YN = input.next().charAt(0);
		input.nextLine();
		if (YN=='y' || YN=='Y')
		{
			for (int i=0;i<BlockAmount;i++)
			{
				
				System.out.printf("選手名稱 =>");
				String BlockName;
				BlockName = input.nextLine();
				BlockPlayer[i] = new Block(BlockName,str,"█"+(char)('A'+i)+"█",str);
				racing[i]=new Racing(BlockPlayer[i]);
			}
		}
		else
		{
			for (int i=0;i<BlockAmount;i++)
			{
				String BlockName=((char)('A'+i)+"方塊選手");
				BlockPlayer[i] = new Block(BlockName,str,"█"+(char)('A'+i)+"█",str);
				racing[i]=new Racing(BlockPlayer[i]);
			}
		}
		
		
		
		

		while(Rank != BlockAmount)
		{
			Thread[] thread= new Thread[BlockAmount];
			for (int i=0;i<BlockAmount;i++)
			{
				
				thread[i]=new Thread(racing[i]);
				
			}

			try {
				for (int i=0;i<BlockAmount;i++)
				{
					thread[i].start();
					
				}
			

			}
			finally {

			Track.ClearConsole();
			for (int i=0;i<BlockAmount;i++)	
				now(racing[i].Getresult());								 

			System.out.println("");
			Thread.sleep(150);
			}
		}
		Track.ClearConsole();
		for (int i=0;i<BlockAmount;i++)	
			now(racing[i].Getresult());	

		System.out.println(Report);

		
			

		
		
		
		
		
	}
}
