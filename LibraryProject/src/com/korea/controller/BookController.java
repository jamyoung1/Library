package com.korea.controller;


import com.korea.dto.BookDTO;
import com.korea.dto.DTO;
import com.korea.service.BookService;

public class BookController implements SubController {
   BookService service = new BookService();
	
	@Override
	public boolean execute(int num, DTO dto) {
		BookDTO bdto = (BookDTO)dto;
		//1 조회 ,2 삽입,3 수정,4 삭제
		
		if(num==1) {
			
		}else if(num==2){
			service.Insert(bdto);
		}else if(num==3){
			
		}else if(num==4){
			
		}
		return false;
	}
      
}
