package interface07;

public class IPhoneMessager extends GraphcIOS implements Messenger {

	@Override
	public String getMessage() {
		return "iphone";
	}

	@Override
	public void setMessage(String msg) {
		System.out.println("iphone에서 메시지를 설정합니다 : " + msg);

	}
	
	public void clearMessage() {
		System.out.println("좌우로 흔들어 문자열을 지웁니다.");
	}
}
