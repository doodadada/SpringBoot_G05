package com.himedia.g05;

import com.himedia.g05.dto.MemberDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestController {
    @Test
    public void testmethod() {
//        MemberDto mdto = new MemberDto("scott","감자");
        //@Builder 사용
        // 1. 직관적인 코딩이 그낭해서 좋음
        // 2. 뭔가 빼먹으면 null로 들어감
        MemberDto mdto = MemberDto.builder()
                .id("scott")
                .build();
        System.out.println("id = " + mdto.getId());
        System.out.println("name = " + mdto.getName());
        System.out.println(mdto);
    }
}
