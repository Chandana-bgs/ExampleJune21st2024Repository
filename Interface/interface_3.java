package Interface;

interface Univerciity{
    void showUnivercityname(String name);//2
}
interface Collegee{
    abstract void showclgname(String name);
}
class BMEEngineeringg implements Collegee{

    public void showUniversityname(String name)
    {
        System.out.println("The university name:"+name);
    }
    void showcityname(String name)
    {       //have a method inside the class
        System.out.println("THe city name:"+name);

    }
    @Override
    public void showclgname(String name)
    {
        System.out.println("the college name:"+name);
    }
}
public class interface_3 {
    public static void main(String[] args) {
        BMEEngineering b=new BMEEngineering();
        b.showUniversityname("VTU");
        b.showcityname("Bangalaore");
        b.showclgname("BCU");
    }
}
