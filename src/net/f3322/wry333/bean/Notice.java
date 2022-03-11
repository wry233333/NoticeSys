package net.f3322.wry333.bean;

public class Notice {
    private String name;
    private String info;
    private String context;
    private String institute;

    public Notice() {

    }

    @Override
    public String toString() {
        return "Notice{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", context='" + context + '\'' +
                ", institute='" + institute + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }
}
