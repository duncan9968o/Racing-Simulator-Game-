package test;


public class Track {
	public String ReadyTrack = "";
	public StringBuilder RacingTrack = Track.CreateTrack();
	public Track() {
		this.RacingTrack=CreateTrack();
	}
	public static void ClearConsole()
	{
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	public static void divider()
	{
		System.out.println("=========================================================================="
						+"==========================================================================");
	}
	public static StringBuilder CreateTrack()
	{
		String Track="                                                                                                                                             x            ";

		
		int trapamount = (int)(Math.random()*(main.MaxTrapAmount-main.MinTrapAmount))+main.MinTrapAmount;
		for (int i=0;i<trapamount;i++)
		{
			
			int k=(int)(Math.random()*3);
			int randomposition=(int)(Math.random()*110)+11;
			switch (k)
			{
			
			case 0: 
				Track=Track.substring(0,randomposition)+'A'+Track.substring(randomposition+1);
				break;
			case 1: 
				Track=Track.substring(0,randomposition)+'B'+Track.substring(randomposition+1);
				
				break;
			case 2: 
				Track=Track.substring(0,randomposition)+'C'+Track.substring(randomposition+1);
				
				break;
			}
		}
		StringBuilder SettingTrack = new StringBuilder();
		SettingTrack.append(Track);
		return SettingTrack;
	}
	
	
}
