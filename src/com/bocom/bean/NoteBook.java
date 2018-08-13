package com.bocom.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class NoteBook implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 笔记本ID
	 */
	private String cnNotebookId;
	/**
	 * 用户ID
	 */
	private String cnUserId;
	/**
	 * 笔记本类型ID
	 */
	private String cnNotebookTypeId;
	/**
	 * 笔记本名称
	 */
	private String cnNotebookName;
	/**
	 * 笔记本描述
	 */
	private String cnNotebookDesc;
	/**
	 * 创建时间
	 */
	private Timestamp cnNotebookCreatetime;
	
	/**
	 * @return	the cnNotebookId
	 */
	public String getCnNotebookId() {
		return cnNotebookId;
	}
	/**
	 * @param cnNotebookId
	 * 		the cnNotebookId to set
	 */
	public void setCnNotebookId(String cnNotebookId) {
		this.cnNotebookId = cnNotebookId;
	}
	/**
	 * @return	the cnUserId
	 */
	public String getCnUserId() {
		return cnUserId;
	}
	/**
	 * @param cnUserId
	 * 		the cnUserId to set
	 */
	public void setCnUserId(String cnUserId) {
		this.cnUserId = cnUserId;
	}
	/**
	 * @return	the cnNotebookTypeId
	 */
	public String getCnNotebookTypeId() {
		return cnNotebookTypeId;
	}
	/**
	 * @param cnNotebookTypeId
	 * 		the cnNotebookTypeId to set
	 */
	public void setCnNotebookTypeId(String cnNotebookTypeId) {
		this.cnNotebookTypeId = cnNotebookTypeId;
	}
	/**
	 * @return	the cnNotebookName
	 */
	public String getCnNotebookName() {
		return cnNotebookName;
	}
	/**
	 * @param cnNotebookName
	 * 		the cnNotebookName to set
	 */
	public void setCnNotebookName(String cnNotebookName) {
		this.cnNotebookName = cnNotebookName;
	}
	/**
	 * @return	the cnNotebookDesc
	 */
	public String getCnNotebookDesc() {
		return cnNotebookDesc;
	}
	/**
	 * @param cnNotebookDesc
	 * 		the cnNotebookDesc to set
	 */
	public void setCnNotebookDesc(String cnNotebookDesc) {
		this.cnNotebookDesc = cnNotebookDesc;
	}
	/**
	 * @return	the cnNotebookCreatetime
	 */
	public Timestamp getCnNotebookCreatetime() {
		return cnNotebookCreatetime;
	}
	/**
	 * @param cnNotebookCreatetime
	 * 		the cnNotebookCreatetime to set
	 */
	public void setCnNotebookCreatetime(Timestamp cnNotebookCreatetime) {
		this.cnNotebookCreatetime = cnNotebookCreatetime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NoteBook [cnNotebookId=" + cnNotebookId + ", cnUserId="
				+ cnUserId + ", cnNotebookTypeId=" + cnNotebookTypeId
				+ ", cnNotebookName=" + cnNotebookName + ", cnNotebookDesc="
				+ cnNotebookDesc + ", cnNotebookCreatetime="
				+ cnNotebookCreatetime + "]";
	}
	
	
}
