package test;


public class Block {
	private String Name = "";
	private String BlockHead = "";
	private	String BlockBody = "";
	private	String BlockLeg = "";
	int RaceNumber = 0;
	public Block() {
		
	}
	public Block(String name,String A,String B,String C)
	{
		this.Name=name;
		this.BlockHead=A;
		this.BlockBody=B;
		this.BlockLeg=C;
	}
	public void SetBlock(String A ,String B,String C)
	{
		this.BlockHead=A;
		this.BlockBody=B;
		this.BlockLeg=C;
	}
	String GetHead()
	{
		return BlockHead;
	}
	String GetBody()
	{
		return BlockBody;
	}
	String GetLeg()
	{
		return BlockLeg;
	}
	String GetName()
	{
		return Name;
	}
}
