package minilib.dao;
import minilib.vo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import minilib.util.DBUtil;
import minilib.vo.Title;

public class ManageTitlesDao {
	

	
	public List findBookType()
	throws InstantiationException,IllegalAccessException,ClassNotFoundException,SQLException
	{
		List list = new ArrayList();
		try {
		Connection conn=DBUtil.getConnection();
		if(conn==null){
			System.out.println("数据库连接失败！");
		}
		String sql="select codeid,codename from code_booktype group by codeid";
		System.out.println("===sql==="+sql);
		PreparedStatement pre=conn.prepareStatement(sql);
		
		//获得查询图书结果集
		ResultSet rs = pre.executeQuery(sql);
		
		while(rs.next()){
			CodeBookType booktype = new CodeBookType();
			booktype.setCodeId(rs.getString(1));
			booktype.setCodeName(rs.getString(2));
			list.add(booktype);
		}
		rs.close();
		pre.close();
		conn.close();
		}catch(InstantiationException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
		e.printStackTrace();
		}catch(ClassNotFoundException e){
		e.printStackTrace();
		}catch(SQLException e){
		e.printStackTrace();
		}
		return list;
	}
	
	public void saveTitle(Title book)
	throws InstantiationException,IllegalAccessException,ClassNotFoundException,SQLException
	{
		
		List list = new ArrayList();
		try{
			Connection conn = (Connection)DBUtil.getConnection();
 			/*if(conn==null){
				System.out.println("数据库连接失败！");
			}*/
		
		String sql = "insert into t_book(typeid,title)  values ('"+book.getTypeid()+"',"+"'"+book.getTitle()+"')";
		System.out.println("saveTitlesql="+sql);
		
		//执行插入操作
		Statement stmt;
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		stmt.close();
		conn.close();
		}
		catch(InstantiationException e){
			e.printStackTrace();
			}catch(IllegalAccessException e){
			e.printStackTrace();
			}catch(ClassNotFoundException e){
			e.printStackTrace();
			}catch(SQLException e){
			e.printStackTrace();
			}
	}

	//查询所有图书
	public List findAll(){

		List list = new ArrayList();
		try{
			Connection conn = DBUtil.getConnection();
			if(conn==null){
				System.out.println("数据库连接失败！");
			}
		String sql = "select * from t_book order by bookid";
		PreparedStatement psmt = conn.prepareStatement(sql);
		//获得结果集
		ResultSet rs = psmt.executeQuery();
		while(rs.next()){
			Title title = new Title();
			title.setIsbn(rs.getString(3));
			title.setTitle(rs.getString(5));
			title.setAuthors(rs.getString(6));
			title.setPressid(rs.getString(8));
			list.add(title);
		}
		rs.close();
		psmt.close();
		conn.close();
		}
		catch(InstantiationException e){
			e.printStackTrace();
			}catch(IllegalAccessException e){
			e.printStackTrace();
			}catch(ClassNotFoundException e){
			e.printStackTrace();
			}catch(SQLException e){
			e.printStackTrace();
			}
		return list;
	}
	public List findBook(String book)
	{
		List list = new ArrayList();
		try{
			Connection conn = DBUtil.getConnection();
			if(conn==null){
				System.out.println("数据库连接失败！");
			}
	//	String sql = "select * from t_book where title='计算机系统结构'";
	//	String sql = "select * from t_book where title like '%"+ book +"%'";
		String sql = "select * from t_book where title like '%系统%'";
		System.out.println("sql"+sql);
		PreparedStatement psmt = conn.prepareStatement(sql);
		//获得结果集
		ResultSet rs = psmt.executeQuery();
		while(rs.next()){
			Title title = new Title();
			title.setIsbn(rs.getString(3));
			title.setTitle(rs.getString(5));
			title.setAuthors(rs.getString(6));
			title.setPressid(rs.getString(8));
			list.add(title);
		}
		rs.close();
		psmt.close();
		conn.close();
		}
		catch(InstantiationException e){
			e.printStackTrace();
			}catch(IllegalAccessException e){
			e.printStackTrace();
			}catch(ClassNotFoundException e){
			e.printStackTrace();
			}catch(SQLException e){
			e.printStackTrace();
			}
		return list;
	}
	
	
}
