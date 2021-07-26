package Homework3;

class LineProgressAware extends ProgressAware {
    private int lineLength;

    public LineProgressAware(int lineLength) {
        if(lineLength >= 0) {
            this.lineLength = lineLength;
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public void showProgress() {
        System.out.printf("Line width is: %d, Progress length is %d%n", lineLength, lineLength);
    }
}
