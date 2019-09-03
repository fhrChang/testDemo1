package cn.lijun.jpa.dao;

import cn.lijun.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author lijun
 * @date 2019/8/16 10:42
 */
public interface CustomerDao extends JpaRepository<Customer,Long> {

}
