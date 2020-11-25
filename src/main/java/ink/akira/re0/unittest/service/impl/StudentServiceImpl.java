package ink.akira.re0.unittest.service.impl;

import ink.akira.re0.unittest.service.OuterService;
import ink.akira.re0.unittest.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * implementation of student service
 *
 * @author 雪行
 * @date 2020/11/25 11:24 上午
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private OuterService outerService;

    @Override
    public String helloStudent(long studentId) {
        return "hello:" + outerService.getStudentName(studentId);
    }
}
