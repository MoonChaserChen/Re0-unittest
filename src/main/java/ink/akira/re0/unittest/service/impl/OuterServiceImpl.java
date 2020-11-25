package ink.akira.re0.unittest.service.impl;

import ink.akira.re0.unittest.service.OuterService;
import org.springframework.stereotype.Service;

/**
 * implementation of outservice
 *
 * @author 雪行
 * @date 2020/11/25 11:33 上午
 */
@Service
public class OuterServiceImpl implements OuterService {
    @Override
    public String getStudentName(long studentId) {
        throw new UnsupportedOperationException();
    }
}
