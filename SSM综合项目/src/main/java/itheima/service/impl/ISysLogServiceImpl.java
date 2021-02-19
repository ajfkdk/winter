package itheima.service.impl;

import com.github.pagehelper.PageHelper;
import itheima.dao.ISysLogDao;
import itheima.domain.SysLog;
import itheima.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISysLogServiceImpl implements ISysLogService {
    @Autowired
    private ISysLogDao dao;

    @Override
    public void save(SysLog sysLog) throws Exception {
        dao.save(sysLog);
    }

    @Override
    public List<SysLog> findAll(Integer page, Integer size) throws Exception {
        PageHelper.startPage(page, size);
        List<SysLog> all = dao.findAll();
        return all;

    }


}
