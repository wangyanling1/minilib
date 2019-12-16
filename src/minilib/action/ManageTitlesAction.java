package minilib.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import minilib.dao.ManageTitlesDao;
import minilib.vo.Title;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;


public class ManageTitlesAction  extends ActionSupport{
	private Title book;

	public Title getBook(){
		return book;
	}
	
	public void setBook(Title book) {
		this.book = book;
	}


	public String findTitle() throws Exception{
		System.out.println("******book.find******");
		ManageTitlesDao mt = new ManageTitlesDao();
		List allTitlesList = mt.findAll();
		HttpServletRequest request=ServletActionContext.getRequest();
    	request.setAttribute("allTitlesList",allTitlesList );
    	System.out.println("******findAllTitles******");
    	return "querybook";
	}
	
 	public String addTitle() throws Exception{
		String restadd = INPUT;
		ManageTitlesDao mtadd = new ManageTitlesDao();
		mtadd.saveTitle(book);
		System.out.println(restadd);
		restadd = "addbook";
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("message", "添加成功请继续添加！");
		System.out.println("******add******"+book.getTypeid()+book.getTitle());
		return restadd;
	}
	
 	public String findName() throws Exception{
 		ManageTitlesDao mt = new ManageTitlesDao();
 		List allTitlesList = mt.findAll();
 		HttpServletRequest request=ServletActionContext.getRequest();
    	request.setAttribute("allTitlesList",allTitlesList );
    	System.out.println("******QueryTitlesByAuthorName******");
    	return "querybook";
 	}	
 	//查找全部书目
	public String findAllTitles() throws Exception{
		String rest = INPUT;
		ManageTitlesDao mt = new ManageTitlesDao();//实例化一个对象
		List allTitlesList = mt.findAll();//调用结果集的方法
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("alltitlesList",allTitlesList);
		rest = "querybook";
		System.out.println("******findAllTitles******");
		return rest;
	}
	
	public String findBookType() throws Exception{
		String restType=INPUT;
		//调用业务
		ManageTitlesDao mttype=new ManageTitlesDao();
		List allTypeList = mttype.findBookType();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("alltypeList", allTypeList);
		restType="booktype";
		System.out.println("******findbooktype******");
		return restType;
	}
	public String findType()throws Exception{
		System.out.println("******findtype********");
		String resttype = INPUT;
		System.out.println(resttype);
		ManageTitlesDao mt = new ManageTitlesDao();
		List booktype = mt.findBook(resttype);		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("booktype", booktype);
		System.out.println("****findit*********");
		resttype="resttype";
		return  resttype;
	}

}
