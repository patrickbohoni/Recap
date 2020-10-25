package fundamentals;

public final class ImmutableClass {
    final int x;
    final String s;

    public ImmutableClass(int x, String s) {
        this.x = x;
        this.s = s;
    }

    public int getX() {
        return x;
    }

    public String getS() {
        return s;
    }
}
