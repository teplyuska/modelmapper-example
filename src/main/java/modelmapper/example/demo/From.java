package modelmapper.example.demo;

import java.time.LocalDateTime;

public class From {
    private String identifier;
    private LocalDateTime createdDate;

    public From() {
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
