package com.zyh.oa.biz;

import com.zyh.oa.entity.Employee;

public interface GlobalBiz {

    Employee login(String sn,String password);
    void changePassword(Employee employee);

}
