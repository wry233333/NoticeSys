package net.f3322.wry333.bean;

public class BookClasses {
    private String c_id;

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookClasses{" +
                "c_id='" + c_id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public BookClasses() {
    }
}
