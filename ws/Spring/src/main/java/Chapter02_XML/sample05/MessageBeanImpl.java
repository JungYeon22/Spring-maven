package Chapter02_XML.sample05;

public class MessageBeanImpl implements MessageBean{
    private String name;
    private String phone;
    private Outputter outputter;

    public MessageBeanImpl(String name) {
        this.name = name;
        System.out.println("MessageBeanImpl(String name)");
    }

    public void setPhone(String phone) {
        this.phone = phone;
        System.out.println("setPhone(String phone)");
    }

    public void setOutputter(Outputter outputter) {
        this.outputter = outputter;
        System.out.println("setOutputter(Outputter outputter)");
    }

    @Override
    public void helloCall() {
        outputter.output("나의 이름 :" + name + " /  핸드폰 번호 :" + phone);
        System.out.println("helloCall()");
    }
}
