import java.net.URL;

public class Info {

    // Name of City
    private String name;

    //Info of City
    private String info;

    public Info(String name, String info){
        this.setName(name);
        this.setInfo(info);
    }

    //Encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}

