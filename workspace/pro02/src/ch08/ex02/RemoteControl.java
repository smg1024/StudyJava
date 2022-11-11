package ch08.ex02;

public interface RemoteControl {
	// 변수 : public static final 상수
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	
	// 함수 : public abstract 함수
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
