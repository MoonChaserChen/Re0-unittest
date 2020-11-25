package ink.akira.re0.unittest.service.impl;

import ink.akira.re0.unittest.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author 雪行
 * @date 2020/11/25 11:54 上午
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello: " + name;
    }
}
