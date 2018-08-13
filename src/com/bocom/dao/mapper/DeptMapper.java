package com.bocom.dao.mapper;

import java.util.List;

import com.bocom.annotation.MyBatisRepository;
import com.bocom.bean.Dept;

@MyBatisRepository
public interface DeptMapper {
	
	List<Dept> queryDeptList();
	
}
