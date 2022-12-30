package model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@ToString
@JsonPropertyOrder({"id", "userId", "name", "amount", "ip"})
public class Transaction {
    private String id;
    private String userId;
    private String name;
    private String amount;
    private String ip;
}
