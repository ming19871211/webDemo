package com.mqm.biz.model;

import java.util.Date;

public class User {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.USER_ID
	 * @mbg.generated
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.ORGAN_ID
	 * @mbg.generated
	 */
	private String organId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.DEPT_ID
	 * @mbg.generated
	 */
	private String deptId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.USER_NAME
	 * @mbg.generated
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.REAL_NAME
	 * @mbg.generated
	 */
	private String realName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.USER_PASSWORD
	 * @mbg.generated
	 */
	private String userPassword;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.USER_POSITION
	 * @mbg.generated
	 */
	private String userPosition;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.USER_TELEPHONE
	 * @mbg.generated
	 */
	private String userTelephone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.USER_MOBILE
	 * @mbg.generated
	 */
	private String userMobile;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.USER_EMAIL
	 * @mbg.generated
	 */
	private String userEmail;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.ORGAN_ADMIN
	 * @mbg.generated
	 */
	private Short organAdmin;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.SUPERVISOR
	 * @mbg.generated
	 */
	private Short supervisor;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.USER_STATE
	 * @mbg.generated
	 */
	private Short userState;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.DELETE_FLAG
	 * @mbg.generated
	 */
	private Short deleteFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.USER_MEMO
	 * @mbg.generated
	 */
	private String userMemo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.CREATE_TIME
	 * @mbg.generated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.CREATE_USERID
	 * @mbg.generated
	 */
	private String createUserid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.CREATE_USERNAME
	 * @mbg.generated
	 */
	private String createUsername;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.LAST_MODIFY_TIME
	 * @mbg.generated
	 */
	private Date lastModifyTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.LAST_MODIFY_USERID
	 * @mbg.generated
	 */
	private String lastModifyUserid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SYS_USER.LAST_MODIFY_USERNAME
	 * @mbg.generated
	 */
	private String lastModifyUsername;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.USER_ID
	 * @return  the value of SYS_USER.USER_ID
	 * @mbg.generated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.USER_ID
	 * @param userId  the value for SYS_USER.USER_ID
	 * @mbg.generated
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.ORGAN_ID
	 * @return  the value of SYS_USER.ORGAN_ID
	 * @mbg.generated
	 */
	public String getOrganId() {
		return organId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.ORGAN_ID
	 * @param organId  the value for SYS_USER.ORGAN_ID
	 * @mbg.generated
	 */
	public void setOrganId(String organId) {
		this.organId = organId == null ? null : organId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.DEPT_ID
	 * @return  the value of SYS_USER.DEPT_ID
	 * @mbg.generated
	 */
	public String getDeptId() {
		return deptId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.DEPT_ID
	 * @param deptId  the value for SYS_USER.DEPT_ID
	 * @mbg.generated
	 */
	public void setDeptId(String deptId) {
		this.deptId = deptId == null ? null : deptId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.USER_NAME
	 * @return  the value of SYS_USER.USER_NAME
	 * @mbg.generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.USER_NAME
	 * @param userName  the value for SYS_USER.USER_NAME
	 * @mbg.generated
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.REAL_NAME
	 * @return  the value of SYS_USER.REAL_NAME
	 * @mbg.generated
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.REAL_NAME
	 * @param realName  the value for SYS_USER.REAL_NAME
	 * @mbg.generated
	 */
	public void setRealName(String realName) {
		this.realName = realName == null ? null : realName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.USER_PASSWORD
	 * @return  the value of SYS_USER.USER_PASSWORD
	 * @mbg.generated
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.USER_PASSWORD
	 * @param userPassword  the value for SYS_USER.USER_PASSWORD
	 * @mbg.generated
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword == null ? null : userPassword.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.USER_POSITION
	 * @return  the value of SYS_USER.USER_POSITION
	 * @mbg.generated
	 */
	public String getUserPosition() {
		return userPosition;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.USER_POSITION
	 * @param userPosition  the value for SYS_USER.USER_POSITION
	 * @mbg.generated
	 */
	public void setUserPosition(String userPosition) {
		this.userPosition = userPosition == null ? null : userPosition.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.USER_TELEPHONE
	 * @return  the value of SYS_USER.USER_TELEPHONE
	 * @mbg.generated
	 */
	public String getUserTelephone() {
		return userTelephone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.USER_TELEPHONE
	 * @param userTelephone  the value for SYS_USER.USER_TELEPHONE
	 * @mbg.generated
	 */
	public void setUserTelephone(String userTelephone) {
		this.userTelephone = userTelephone == null ? null : userTelephone.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.USER_MOBILE
	 * @return  the value of SYS_USER.USER_MOBILE
	 * @mbg.generated
	 */
	public String getUserMobile() {
		return userMobile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.USER_MOBILE
	 * @param userMobile  the value for SYS_USER.USER_MOBILE
	 * @mbg.generated
	 */
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile == null ? null : userMobile.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.USER_EMAIL
	 * @return  the value of SYS_USER.USER_EMAIL
	 * @mbg.generated
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.USER_EMAIL
	 * @param userEmail  the value for SYS_USER.USER_EMAIL
	 * @mbg.generated
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail == null ? null : userEmail.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.ORGAN_ADMIN
	 * @return  the value of SYS_USER.ORGAN_ADMIN
	 * @mbg.generated
	 */
	public Short getOrganAdmin() {
		return organAdmin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.ORGAN_ADMIN
	 * @param organAdmin  the value for SYS_USER.ORGAN_ADMIN
	 * @mbg.generated
	 */
	public void setOrganAdmin(Short organAdmin) {
		this.organAdmin = organAdmin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.SUPERVISOR
	 * @return  the value of SYS_USER.SUPERVISOR
	 * @mbg.generated
	 */
	public Short getSupervisor() {
		return supervisor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.SUPERVISOR
	 * @param supervisor  the value for SYS_USER.SUPERVISOR
	 * @mbg.generated
	 */
	public void setSupervisor(Short supervisor) {
		this.supervisor = supervisor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.USER_STATE
	 * @return  the value of SYS_USER.USER_STATE
	 * @mbg.generated
	 */
	public Short getUserState() {
		return userState;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.USER_STATE
	 * @param userState  the value for SYS_USER.USER_STATE
	 * @mbg.generated
	 */
	public void setUserState(Short userState) {
		this.userState = userState;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.DELETE_FLAG
	 * @return  the value of SYS_USER.DELETE_FLAG
	 * @mbg.generated
	 */
	public Short getDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.DELETE_FLAG
	 * @param deleteFlag  the value for SYS_USER.DELETE_FLAG
	 * @mbg.generated
	 */
	public void setDeleteFlag(Short deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.USER_MEMO
	 * @return  the value of SYS_USER.USER_MEMO
	 * @mbg.generated
	 */
	public String getUserMemo() {
		return userMemo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.USER_MEMO
	 * @param userMemo  the value for SYS_USER.USER_MEMO
	 * @mbg.generated
	 */
	public void setUserMemo(String userMemo) {
		this.userMemo = userMemo == null ? null : userMemo.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.CREATE_TIME
	 * @return  the value of SYS_USER.CREATE_TIME
	 * @mbg.generated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.CREATE_TIME
	 * @param createTime  the value for SYS_USER.CREATE_TIME
	 * @mbg.generated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.CREATE_USERID
	 * @return  the value of SYS_USER.CREATE_USERID
	 * @mbg.generated
	 */
	public String getCreateUserid() {
		return createUserid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.CREATE_USERID
	 * @param createUserid  the value for SYS_USER.CREATE_USERID
	 * @mbg.generated
	 */
	public void setCreateUserid(String createUserid) {
		this.createUserid = createUserid == null ? null : createUserid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.CREATE_USERNAME
	 * @return  the value of SYS_USER.CREATE_USERNAME
	 * @mbg.generated
	 */
	public String getCreateUsername() {
		return createUsername;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.CREATE_USERNAME
	 * @param createUsername  the value for SYS_USER.CREATE_USERNAME
	 * @mbg.generated
	 */
	public void setCreateUsername(String createUsername) {
		this.createUsername = createUsername == null ? null : createUsername.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.LAST_MODIFY_TIME
	 * @return  the value of SYS_USER.LAST_MODIFY_TIME
	 * @mbg.generated
	 */
	public Date getLastModifyTime() {
		return lastModifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.LAST_MODIFY_TIME
	 * @param lastModifyTime  the value for SYS_USER.LAST_MODIFY_TIME
	 * @mbg.generated
	 */
	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.LAST_MODIFY_USERID
	 * @return  the value of SYS_USER.LAST_MODIFY_USERID
	 * @mbg.generated
	 */
	public String getLastModifyUserid() {
		return lastModifyUserid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.LAST_MODIFY_USERID
	 * @param lastModifyUserid  the value for SYS_USER.LAST_MODIFY_USERID
	 * @mbg.generated
	 */
	public void setLastModifyUserid(String lastModifyUserid) {
		this.lastModifyUserid = lastModifyUserid == null ? null : lastModifyUserid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SYS_USER.LAST_MODIFY_USERNAME
	 * @return  the value of SYS_USER.LAST_MODIFY_USERNAME
	 * @mbg.generated
	 */
	public String getLastModifyUsername() {
		return lastModifyUsername;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SYS_USER.LAST_MODIFY_USERNAME
	 * @param lastModifyUsername  the value for SYS_USER.LAST_MODIFY_USERNAME
	 * @mbg.generated
	 */
	public void setLastModifyUsername(String lastModifyUsername) {
		this.lastModifyUsername = lastModifyUsername == null ? null : lastModifyUsername.trim();
	}
}