package com.ustglobal.mailsystem.dao;

import java.util.List;

import com.ustglobal.mailsystem.bean.MailBean;
import com.ustglobal.mailsystem.bean.UserBean;

public interface MailDAO {

	public boolean userRegister(UserBean bean);
	public UserBean login(String email, String password);
	public List<MailBean> getAllMail(int from_id);
	public boolean sendMail(String subject, String msg, int to_id, int from_id);
	public boolean deleteMail(int mid);
	public boolean draftMail(String subject, String msg, UserBean to, UserBean from);
	public UserBean searchByEmail(String email);
	public boolean changePassword(String email, String password);
//	public List<MailBean> mailSentbox(int from_id);
//	public List<MailBean> mailDeleted(int form_id);
//	public List<MailBean> mailDraftbox(int from_id);
	
}
