package week1;

public class week1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1=new TV();
		System.out.println("default volume of TV1:"+tv1.volumeLevel+"\ndefault channel of TV1:"+tv1.channel);
		tv1.setChannel(3);
		tv1.setVolume(4);
		System.out.println("new volume of TV1:"+tv1.volumeLevel+"\nnew channel of TV1:"+tv1.channel);
		tv1.channelUp();
		System.out.println("updated channel of TV1:"+tv1.channel);
		
		TV tv2=new TV();
		tv2.setChannel(50);
		tv2.setVolume(2);
		System.out.println("new volume of TV2:"+tv2.volumeLevel+"\nnew channel of TV2:"+tv2.channel);
		tv2.channelUp();
		System.out.println("updated channel of TV2:"+tv2.channel);
	}

}
