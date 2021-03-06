package ink.akira.re0.unittest.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * 测试StudentService
 *
 * @author 雪行
 * @date 2020/11/25 11:28 上午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class HelloServiceTest {
    @Resource
    private HelloService helloService;

    @Test
    public void testHello() {
        String erGo = helloService.hello("ErGo");
        assertNotNull(erGo);
    }
}
