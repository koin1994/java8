package sec2;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메서드 : 선언만
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메서드 : 선언과 구현 내용을 기술
	default void setMute(boolean mute){
		if(mute){
			System.out.println("*** 음소거 ***");
		}else{
			System.out.println("*** 음소거 해제***");
		}
	}
	//정적 메서드 : 선언과 구현 내용을 기술하고, 객체 생성없이 직접 공유데이터로 간주하며 활용
	static void changeBattery(){
		System.out.println("----건전지 교체 요망---");
	}
}
