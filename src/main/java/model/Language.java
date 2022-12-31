package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@ToString
public class Language {
    private String code;
    private String name;
}
