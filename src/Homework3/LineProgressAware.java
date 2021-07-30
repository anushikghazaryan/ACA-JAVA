package Homework3;

class LineProgressAware extends ProgressAware {
    private final int lineLength;

    public LineProgressAware(int lineLength) {
        if(lineLength >= 0) {
            this.lineLength = lineLength;
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public void showProgress(int seconds) {
        super.showProgress(seconds);
    }

    @Override
    void print(float p) {
        super.print(p);
    }
}
