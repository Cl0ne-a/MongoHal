package com.apress.mongohal;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
public class Note {
    @Id
    private String id;
    private String itemToBuy;
    private String type;
    private Long price;
    private boolean isBought;
    private LocalDateTime date;

    public Note() {
        this.date = LocalDateTime.now();
    }

    public Note(String itemToBuy, String type, Long price, boolean isBought) {
        this();
        this.itemToBuy = itemToBuy;
        this.type = type;
        this.price = price;
        this.isBought = isBought;
    }
}
