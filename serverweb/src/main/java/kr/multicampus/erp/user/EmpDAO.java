package kr.multicampus.erp.user;

import java.util.ArrayList;

public interface EmpDAO {
	//사원등록을 위한 메소드
	public int insert(EmpDTO user);
	public ArrayList<EmpDTO> select();
	public int delete(String id);
	public EmpDTO read(String id);
	
	
	public EmpDTO login(EmpDTO user);
}
