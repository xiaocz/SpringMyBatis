package com.bocom.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bocom.bean.Dept;
import com.bocom.dao.DeptDao;
@Repository
public class DeptDaoImpl implements DeptDao {
	
	private String calssName = this.getClass().getName();
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Autowired
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		System.out.println("==========>>[" + calssName + "]Set property sqlSessionTemplate with " + sqlSessionTemplate);
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<Dept> queryDeptList() {
		return sqlSessionTemplate.selectList("queryDeptList");
	}

}
