package classTest;

public class Human {
    private  int age;
    private  int sex;
    private  String name;

    public Human( String name,int age, int sex) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                '}';
    }
    //重写equals 原本equals toSring: com
    @Override
    public boolean equals(Object obj){
        if (obj==null){
            return false;
        }if (obj==this){
            return true;
        }if (obj instanceof  Human){
            Human h=(Human)obj;
            return h.name==this.name&&h.age==this.age&&h.sex==this.sex;
        }return false;

    }
}
