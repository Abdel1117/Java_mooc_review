public class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        return this.edgeLength * edgeLength * this.edgeLength;
    }

    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volums " + this.volume();
    }
}
