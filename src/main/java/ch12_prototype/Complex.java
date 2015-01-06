package ch12_prototype;

import java.util.Date;

public class Complex implements Cloneable {
    private String complexInfo;

    private Date date;

    public Complex(String complexInfo) {
        this.complexInfo = complexInfo;
    }

    public String getComplexInfo() {
        return complexInfo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = new Date(date.getTime());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Complex tmp = (Complex) super.clone();
        return tmp;
    }
}