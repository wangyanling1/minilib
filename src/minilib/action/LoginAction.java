/*package minilib.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import minilib.vo.User;

import org.apache.struts2.ServletActionContext;

public class LoginAction {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute() throws Exception{
		//验证用户名、密码
		if(user.getUsername().equals("guan") && user.getUserpass().equals("123456")){
			//将用户名写入session
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			session.setAttribute("username", user.getUsername());			
			return "menu";
		}
		else
			return "login";
	}

}
*/

package minilib.action;
	import javax.servlet.http.HttpServletRequest;
	import minilib.vo.User;
	import javax.servlet.http.HttpSession;
	import org.apache.struts2.ServletActionContext;
	import com.opensymphony.xwork2.ActionSupport;
	public class LoginAction extends ActionSupport{
		private User user;
		
		public User getUser(){
			return user;
		}
		public void setUser(User user){
			this.user=user;
		}

		public String execute() throws Exception{
			//验证用户名和密码
			if(user.getUsername().equals("admin")&&(user.getUserpass().equals("123456"))){
				//将用户名写入session
				HttpServletRequest request=ServletActionContext.getRequest();
				HttpSession session=request.getSession();
				session.setAttribute("username",user.getUsername());	
				return "menu";
			}
			else{
				return "login";
			}
		}

	}

