
public class Timer {

    private ClockHand hundredthsHand;
    private ClockHand handSeconds;

    public Timer() {
        this.hundredthsHand = new ClockHand(100);
        this.handSeconds = new ClockHand(60);
    }

    public void advance() {

        this.hundredthsHand.advance();
        if (this.hundredthsHand.value() == 0) {
            this.handSeconds.advance();
        }
    }

    public String toString() {
        return this.handSeconds + ":" + this.hundredthsHand;
    }
}
