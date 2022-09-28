package sec2;

public class Audio implements RemoteControl{
	private int volume;

	public int getVolume() {return volume;}
	@Override
	public void turnOn() {
		System.out.println("Radio 전원을 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Radio 전원을 끕니다.");	
	}
	@Override
	public void setVolume(int volume) {this.volume = volume;
		if(volume>RemoteControl.MAX_VOLUME){
			this.volume=RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME){
			this.volume=RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
		System.out.println("현재Radio 볼륨 :"+this.volume);
	}
}