package com.example.annotation.controller;



import com.example.annotation.entity.LoginRequest;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api")
public class LoginController {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> login(@RequestBody LoginRequest loginRequest) {
        Map<String, Object> response = new HashMap<>();

        log.info(loginRequest.toString());
        // 假设进行一些验证和处理
        //Todo 验证数据库中是否有相同的数据
        if ("123@qq.com".equals(loginRequest.getEmail())) {
            response.put("success", true);
            response.put("message", "登录成功");
            return ResponseEntity.ok(response);
        } else {
            response.put("success", false);
            response.put("message", "无效的邮箱");
            return ResponseEntity.badRequest().body(response);
        }
    }

}
