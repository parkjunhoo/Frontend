package kr.multicampus.erp.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.CustomerVO;
import fw.DBUtil;

public class EmpDAOImpl implements EmpDAO{

	@Override
	public int insert(EmpDTO user) {
		String sql = "insert into myemp values(?,?,?,?,?,1000,?)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt =  con.prepareStatement(sql);
			ptmt.setString(1, user.getDeptno());
			ptmt.setString(2, user.getName());
			ptmt.setString(3, user.getId());
			ptmt.setString(4, user.getPass());
			ptmt.setString(5, user.getAddr());
			ptmt.setString(6, user.getGrade());
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}

	@Override
	public ArrayList<EmpDTO> select() {
		ArrayList<EmpDTO> result = new ArrayList<EmpDTO>();
		String sql = "select * from myemp";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		EmpDTO emp = null;
		try {
				con=DBUtil.getConnect();
				ptmt = con.prepareStatement(sql);
				rs =  ptmt.executeQuery();
				
				while(rs.next()) {
					emp = new EmpDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7));
					result.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		
		
		return result;
	}

	@Override
	public int delete(String id) {
		int result = 0;
		
		String sql = "delete from myemp where id=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		
		EmpDTO emp = null;
		try {
				con=DBUtil.getConnect();
				ptmt = con.prepareStatement(sql);
				
				ptmt.setString(1, id);
				
				result = ptmt.executeUpdate();
				
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt, con);
		}
		
		return result;
	}

	@Override
	public EmpDTO read(String id) {
		System.out.println(id);
		String sql = "select * from myemp where id=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		EmpDTO emp = null;
		try {
				con=DBUtil.getConnect();
				ptmt = con.prepareStatement(sql);
				ptmt.setString(1, id);
				
				rs =  ptmt.executeQuery();
				rs.next();
				emp = new EmpDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7));
			}catch (SQLException e) {
			e.printStackTrace();
			}finally {
				DBUtil.close(rs, ptmt, con);
			}
		
		System.out.println(emp.getName());
		return emp;
	}
	
	public EmpDTO login(EmpDTO user) {
		String sql = "select * from myemp where id=? and pass=?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		EmpDTO emp = null;
		try {
				con=DBUtil.getConnect();
				ptmt = con.prepareStatement(sql);
				ptmt.setString(1, user.getId());
				ptmt.setString(2, user.getPass());
				
				rs =  ptmt.executeQuery();
				rs.next();
				emp = new EmpDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7));
			}catch (SQLException e) {
			e.printStackTrace();
			}finally {
				DBUtil.close(rs, ptmt, con);
			}
		
		System.out.println(emp.getName());
		return emp;
	}
	
	
	
}
