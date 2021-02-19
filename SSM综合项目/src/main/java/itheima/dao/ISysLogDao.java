package itheima.dao;

import itheima.domain.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISysLogDao {
    @Insert("insert into `ssm2`.`syslog` (`visitTime`, `username`, `ip`, `url`, `executionTime`, `method`) values (#{visitTime}, #{username}, #{ip}, #{url}, #{executionTime}, #{method})")
    public void save(SysLog sysLog) throws Exception;

    @Select("SELECT * FROM syslog")
    List<SysLog> findAll();
}
