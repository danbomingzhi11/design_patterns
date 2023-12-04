package structural.flyweight;

// 颜色枚举
public enum Color {
    WHITE("白色"),
    BLACK("黑色");

    

    public final String color;
    Color(String color) {
        this.color = color;
    }
}
