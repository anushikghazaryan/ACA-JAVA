package Homework3;

public class ProgressAware {
    private boolean visibility;

    public ProgressAware() {
        this.visibility = false;
    }

    public void showProgress() {
        this.visibility = true;
        System.out.println("progress is visible");
    }

    public void hideProgress() {
        this.visibility = false;
        System.out.println("progress isn't visible");
    }

    public boolean isProgressVisible() {
        return this.visibility
                ;
    }

    public void showProgress(int seconds) {

    }
}