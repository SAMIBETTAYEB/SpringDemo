/**
 * Created by Bettayeb on 5/18/2017.
 */
public class Person {
    private int id;
    private String name;

    public Person(){}

    public Person(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id+" - "+name;
    }
}
