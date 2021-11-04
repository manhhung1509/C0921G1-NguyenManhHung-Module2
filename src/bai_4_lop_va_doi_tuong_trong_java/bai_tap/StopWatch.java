package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long calculate() {
        return this.endTime - this.startTime;
    }

    public static void selectionSort(int... a) {
        int tempt;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] < a[i]) {
                    tempt = a[j];
                    a[j] = a[j];
                    a[i] = tempt;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        StopWatch.selectionSort(array);
        stopWatch.stop();
        System.out.println("result = " + stopWatch.calculate());
    }

}
