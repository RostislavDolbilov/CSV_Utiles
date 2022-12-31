package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@ToString
public class Location {
    private String geoname_id;
    private String capital;
    private Language languages;
    private String country_flag;
    private String country_flag_emoji;
    private String country_flag_emoji_unicode;
    private String calling_code;
    private Boolean is_eu;
}
