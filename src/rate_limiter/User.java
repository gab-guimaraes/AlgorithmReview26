package rate_limiter;

import java.util.UUID;

public class User {
    /*  pros:
            - unique across systems
            - no coordination needed
        cons:
            - bigger than long (16 bytes)
            - slower indexing in DB
            - less human-friendly */
    private final UUID id;
    private boolean authenticated;

    public User(boolean authenticated){
        id = UUID.randomUUID();
        this.authenticated = authenticated;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public UUID getId() {
        return id;
    }

    public void authenticate() {
        this.authenticated = true;
    }

    public void unauthenticate() {
        this.authenticated = false;
    }
}
