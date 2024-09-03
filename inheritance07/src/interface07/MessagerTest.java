package interface07;

public class MessagerTest {
	public static void main(String[] args) {
		
		IPhoneMessager iphone = new IPhoneMessager();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("메신저 최소 문자 크기" + Messenger.MIN_SIZE);
		System.out.println("메신저 최대 문자 크기" + Messenger.MAX_SIZE);
		
		iphone.setLogin(true);
		iphone.getMessage();
		iphone.setMessage("Hello");
		iphone.clearMessage();
		
		galaxy.setLogin(true);
		galaxy.getMessage();
		galaxy.setMessage("hi");
		galaxy.changeKeyboard();
		
		galaxy.fileDounload();
		galaxy.fileUpload();
		
		iphone.draw_textBox();
		iphone.draw_subminButton();
	}

}
