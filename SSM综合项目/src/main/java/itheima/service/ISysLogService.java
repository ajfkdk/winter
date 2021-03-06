package itheima.service;

import itheima.domain.SysLog;
import org.springframework.stereotype.Component;

import java.util.List;


public interface ISysLogService {

    public void save(SysLog sysLog) throws Exception;

    public List<SysLog> findAll(Integer page, Integer size) throws Exception;
}
