package edu.kh.todoList.service;

import java.util.Map;

public interface TodoListService {

	/** 할 일 목록 반환 서비스
	 * @return todoList + 완료 개수
	 */
	Map<String, Object> todoListFullView() throws Exception;

}
