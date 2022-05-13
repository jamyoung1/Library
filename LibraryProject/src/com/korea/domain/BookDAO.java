package com.korea.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.korea.dto.BookDTO;

public class BookDAO extends DAO{

			public BookDAO() { }//생성자 끝
	
	//도서 정보 조회(num:1)		
	public void Select() {
		
	}
			
	//도서 정보 추가(num:2)
	public boolean Insert(BookDTO dto) {
		try {
			pstmt=conn.prepareStatement("insert into book_tbl values(?,?,?,?,?)");
			pstmt.setString(1, dto.getBook_Code());
			pstmt.setString(2, dto.getBook_Name());
			pstmt.setString(3, dto.getBook_Author());
			pstmt.setString(4, dto.getPublisher());
			pstmt.setInt(5, dto.getIsRental());
			int result = pstmt.executeUpdate();
			
			if(result!=0) {
				return true;    //성공
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}
			
	//도서 정보 수정(num:3)
	public void Update() {
	
	}
			
	//도서 정보 삭제(num:4)
	public void Delete() {		
		
	}
}
