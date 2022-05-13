package com.korea.main;

import com.korea.controller.FrontController;
import com.korea.domain.BookDAO;
import com.korea.dto.BookDTO;
import com.korea.view.GUIViewer;
import com.korea.view.Viewer;

public class Main {

	public static void main(String[] args) {
		
		//1 BookDAO-BookDTO TEST
		
//		BookDTO dto = new BookDTO("1010", "열혈C언어", "윤성우", "오렌지미디어", 0);
//		BookDAO dao = new BookDAO();
//		
//		dao.Insert(dto); //성공 여부 확인
		
//        2 Controller - Service - DAO 확인
		
//		FrontController controller = new FrontController();
//		
//		BookDTO dto = new BookDTO("2020", "이것이자바냐?", "홍길동", "00미디어", 0);
//		controller.SubControllerEX("BOOK", 2, dto); //서비스명,작업번호,전달단위
//		
		
		// View - Controller
		Viewer view1 = new Viewer();
		GUIViewer gui =  new GUIViewer();
		view1.LoginMenu();
		
		//view1.BookMenu();
		
		
		
		//4 View - LoginController
		
		
	}
}
