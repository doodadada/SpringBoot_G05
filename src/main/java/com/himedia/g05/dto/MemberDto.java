package com.himedia.g05.dto;

import lombok.*;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString

@Data
@Builder
@AllArgsConstructor
public class MemberDto {
    private String id;
    @Builder.Default
    private String name = "홍길남";
}
