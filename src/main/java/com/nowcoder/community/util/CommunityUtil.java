package com.nowcoder.community.util;

import org.springframework.util.DigestUtils;
import org.thymeleaf.util.StringUtils;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class CommunityUtil {
    public static String generateUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
    public static String md5(String key) {
        if (StringUtils.isEmpty(key)) {
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }
}
