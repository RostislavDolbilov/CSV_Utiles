package model;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@ToString
public class FullTransaction {
    private String id;
    private String userId;
    private String name;
    private String amount;
    private String ip;
    private String type;
    private String continent_code;
    private String continent_name;
    private String country_code;
    private String country_name;
    private String region_code;
    private String region_name;
    private String city;
    private String zip;
    private String latitude;
    private String longitude;
    private Location location;

    public FullTransaction(List<String> strings) {
    }
}
