package Interface;

interface Univercity{
    void showUnivercityname(String name);//2
}
interface College{
    abstract void showclgname(String name);
}
class BMEEngineering implements University,College{//multiple interface

    @Override
    public void showUniversityname(String name)
    {
        System.out.println("The university name:"+name);
    }
    void showcityname(String name){       //have a method inside the class
        System.out.println("THe city name:"+name);
    }

    @Override
    public void showclgname(String name) {
        System.out.println("the college name:"+name);
    }
}
public class interface_2 {
    public static void main(String[] args) {
        BMEEngineering b=new BMEEngineering();
        b.showUniversityname("VTU");
        b.showcityname("Bangalaore");
        b.showclgname("BCU");
    }
}
