package Homework3;

public class CircleProgressAware extends ProgressAware{
    @Override
    public void showProgress() {
        super.showProgress();
    }

    @Override
    void print(float p) {
        System.out.println( (int) (p * 360 / 100)+ "*" +
                "");
    }
}
