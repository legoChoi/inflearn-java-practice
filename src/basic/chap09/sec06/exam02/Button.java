package basic.chap09.sec06.exam02;

public class Button {

    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void ClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
}
