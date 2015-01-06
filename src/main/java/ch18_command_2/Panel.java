package ch18_command_2;

public class Panel {
    private String color = "빨강";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        System.out.println(this.color + " 에서 " + color + " 로 색깔 바뀜.");
        this.color = color;
    }
}
