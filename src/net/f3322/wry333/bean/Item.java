package net.f3322.wry333.bean;
//借阅项
public class Item {
    private String l_id;//借阅项编号
    private String id;//借阅用户id
    private String b_id;//借阅书籍的id
    private String return_date;//约定还书日期
    private String borrow_date;//借阅书籍日期
    private String rel_date;//实际还书日期
    private String b_name;//图书名称

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getL_id() {
        return l_id;
    }

    public void setL_id(String l_id) {
        this.l_id = l_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getB_id() {
        return b_id;
    }

    public void setB_id(String b_id) {
        this.b_id = b_id;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getBorrow_date() {
        return borrow_date;
    }

    public void setBorrow_date(String borrow_date) {
        this.borrow_date = borrow_date;
    }

    public String getRel_date() {
        return rel_date;
    }

    public void setRel_date(String rel_date) {
        this.rel_date = rel_date;
    }

    public Item() {
    }

    @Override
    public String toString() {
        return "Item{" +
                "l_id='" + l_id + '\'' +
                ", id='" + id + '\'' +
                ", b_id='" + b_id + '\'' +
                ", return_date='" + return_date + '\'' +
                ", borrow_date='" + borrow_date + '\'' +
                ", rel_date='" + rel_date + '\'' +
                '}';
    }
}
