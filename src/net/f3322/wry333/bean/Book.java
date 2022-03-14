package net.f3322.wry333.bean;

public class Book {
    private String b_id;//书号
    private String name;//书名
    private String publisher;//出版商
    private String author;//作者
    private String date;//出版日期
    private String info;//封面url
    private String context;//图书简介
    private String c_id;//类别

    public Book() {

    }

    /**
     * 书籍自带toString方法
     * @return
     */
    @Override
    public String toString() {
        return "Book{" +
                "b_id='" + b_id + '\'' +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                ", info='" + info + '\'' +
                ", context='" + context + '\'' +
                ", c_id='" + c_id + '\'' +
                '}';
    }


    //BeanUtils所用的getter和setter
    public String getB_id() {
        return b_id;
    }

    public void setB_id(String b_id) {
        this.b_id = b_id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
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

}
