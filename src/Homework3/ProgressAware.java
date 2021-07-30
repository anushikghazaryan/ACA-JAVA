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
        return this.visibility;
    }

    public void showProgress(int seconds) {
        long start = System.currentTimeMillis();
        long fix = start;
        long current = start;

        while(current - fix <= seconds * 1000L) {
            if(current - start >= 100) {
                start = System.currentTimeMillis();
                float proc = (current - fix) / 1000f / seconds * 100;
                print(proc);
            }
            current = System.currentTimeMillis();
        }
    }

    void print(float p) {
        System.out.println(p);
    }
}