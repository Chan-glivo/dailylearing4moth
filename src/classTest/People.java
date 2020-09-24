package classTest;

public  class People {
    private  String name;
    private   String sex;

    public People(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void change(){
        System.out.println("唱歌");
    }
    public  void  tiaowu(){
        System.out.println("跳舞");
    }

}
