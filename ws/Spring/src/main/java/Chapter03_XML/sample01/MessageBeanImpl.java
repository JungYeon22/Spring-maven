package Chapter03_XML.sample01;


import lombok.Setter;


public class MessageBeanImpl implements MessageBean {
	@Setter
	private String str;

	@Override
	public void showPrintBefore() {
		System.out.println("showPrintBefore 메세지 : " + str);	//핵심코드
	}

	@Override
	public void viewPrintBefore() {
		try {
			Thread.sleep(1000);	//단위 : 1/1000
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("viewPrintBefore 메세지 : " + str);
	}

	@Override
	public void showPrintAfter() {
		System.out.println("showPrintAfter 메세지 : " + str);	//핵심코드
	}

	@Override
	public void viewPrintAfter() {
		try {
			Thread.sleep(1000);	//단위 : 1/1000
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("viewPrintAfter 메세지 : " + str);
	}
	@Override
	public void display() {
		System.out.println("display 메세지 : " + str);

	}


}
