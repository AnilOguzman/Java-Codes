package week1;

public class TV {
	int channel=1;
	int volumeLevel=1;
	
	final boolean ON=true;
	
 	public void setChannel(int newChannel)
	{
		if(newChannel>=1 && newChannel<=120)
		channel=newChannel;
	}
	public void setVolume(int newVolumeLevel)
	{
		if(newVolumeLevel>=1 && newVolumeLevel<=7)
		volumeLevel=newVolumeLevel;
	}
	public void channelUp()
	{
		if(channel<120)
			channel++;
	}
	public void volumeUp()
	{
		if(volumeLevel<7)
			volumeLevel++;
	}
}
