public class A02_MessageUtil{
    private String message;
    public A02_MessageUtil(String message){
        this.message = message;
    }
    public String printMessage(){
        System.out.println("printMessage: "+message);
        return message;
    }
}