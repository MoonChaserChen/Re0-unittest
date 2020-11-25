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
public class StudentServiceTest {
    @Resource
    private StudentService studentService;

    @Test
    public void testNewStudent() {
        String erGo = studentService.newStudent("ErGo");
        assertNotNull(erGo);
    }

    @Test
    public void testHello() {
        String hello = studentService.helloStudent(112L);
        assertNotNull(hello);
    }
}
