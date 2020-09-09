package pl.bartoszchodyla;

/**
 * Created by "Bartosz Chodyla" on 2020-09-09.
 */
public class Account {

    private boolean active;

    public Account() {
        this.active = false;
    }

    public boolean isActive() {
        return this.active;
    }

    public void activate() {
        this.active = true;
    }
}
