package sratytaty;

/**
 * Created by RENT on 2017-01-05.
 */
public class Factors {
    int x;
    int y;

    public Factors(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getIloczyn(int i, int i1, int i2) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Factors)) return false;

        Factors factors = (Factors) o;

        if (x != factors.x) return false;
        return y == factors.y;
    }
}

