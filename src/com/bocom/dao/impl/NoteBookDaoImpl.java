package com.bocom.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bocom.bean.NoteBook;
import com.bocom.dao.NoteBookDao;
@Repository
public class NoteBookDaoImpl implements NoteBookDao{
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Autowired
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<NoteBook> queryNoteBookList() {
		return sqlSessionTemplate.selectList("CN_NOOTBOOK_MAPPING.findNotebooks");
	}

}
