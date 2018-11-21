package model;

public class MenuModel {

    Integer homeimage;
    String hometext1,hometext2;

    public MenuModel(Integer homeimage, String hometext1, String hometext2) {
        this.homeimage = homeimage;
        this.hometext1 = hometext1;
        this.hometext2 = hometext2;
    }

    public Integer getHomeimage() {
        return homeimage;
    }

    public void setHomeimage(Integer homeimage) {
        this.homeimage = homeimage;
    }

    public String getHometext1() {
        return hometext1;
    }

    public void setHometext1(String hometext1) {
        this.hometext1 = hometext1;
    }

    public String getHometext2() {
        return hometext2;
    }

    public void setHometext2(String hometext2) {
        this.hometext2 = hometext2;
    }
}
