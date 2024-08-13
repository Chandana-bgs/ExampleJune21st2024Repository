package Interface;

interface University{
    void showUniversityname(String name);//2
}
class BMSEngineering implements University{

    @Override
    public void showUniversityname(String name) {
        System.out.println("The university name:"+name);
    }
    void showcityname(String name){       //have a method inside the class
        System.out.println("THe city name:"+name);
    }
}

public class interface_1 {
    public static void main(String[] args) {
        BMSEngineering b=new BMSEngineering();
        b.showUniversityname("VTU");
        b.showcityname("Bangalaore");
    }
}
