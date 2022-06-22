package test;


public class Racing implements Runnable {
	Block block = new Block();
	Track track = new Track();
	String Result = "";
	public int rank;
	int buff = 0;
	int bufftime = 0;
	public boolean finish=false;
	public Racing(Block A) {
		block = A;
	}
	public void racing()
	{
		track.RacingTrack=track.RacingTrack.deleteCharAt(0);
		track.ReadyTrack += ' ';
		Result = (track.ReadyTrack+block.GetHead()+track.RacingTrack+"\n"
				+track.ReadyTrack+block.GetBody()+track.RacingTrack+"\n"
				+track.ReadyTrack+block.GetLeg()+track.RacingTrack);
	}
	public String Getresult() {
		
		return Result;
	}
	
	public void run() {
		if (!finish)
		{
		if (buff == 0)
		{
			racing();
		}
		else if (buff == 3)//½Ä¨ë
		{
			for (;bufftime>0;bufftime--)
			{
			racing();
			}
			buff = 0;
		}
		else if (buff == 2)//º¢¯d
		{
			bufftime = bufftime-1;
			if (bufftime == 0)buff=0;
		}
		else if (buff == 1)//­Ë°h
		{
			track.ReadyTrack = track.ReadyTrack.substring(0, track.ReadyTrack.length()-bufftime) ;
			track.RacingTrack = track.RacingTrack.insert(0,"     ");
			buff = 0 ; bufftime = 0 ;
		}
		
		switch (track.RacingTrack.charAt(0) )
		{	
		case 'x':	finish = true;
					racing();
					main.Rank += 1;
					main.Report =main.Report + (block.GetName()+"¨ú±o²Ä"+main.Rank+"¦W ");
				break;
		case 'A':  buff = 1;	//A­Ë°h
					bufftime = 5;
					racing();
				break;
		case 'B':	buff = 2;	//Bº¢¯d
					bufftime = 3;
					racing();
				break;
		case 'C' :	buff = 3;
					bufftime = 3;//C½Ä¨ë
				break;
		}
		}
		
	}
}