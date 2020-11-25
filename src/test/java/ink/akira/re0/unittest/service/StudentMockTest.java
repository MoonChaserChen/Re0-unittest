package ink.akira.re0.unittest.service;

import ink.akira.re0.unittest.service.impl.StudentServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * @author 雪行
 * @date 2020/11/25 11:58 上午
 */
@RunWith(MockitoJUnitRunner.class)
public class StudentMockTest {
    @Mock
    private OuterService outerService;
    @InjectMocks
    private StudentServiceImpl studentService;

    @Before
    public void before() {
        when(outerService.getStudentName(anyLong())).thenReturn("Ergo");
    }

    @Test
    public void testHello() {
        assertEquals("hello:Ergo", studentService.helloStudent(112L));
    }
}
