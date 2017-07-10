package com.test.service;

import java.util.List;

import com.common.entity.Test;

public interface TestService {
	/**
	 * @param id
	 * @return
	 */
	Test findTestById(long id);

	/**
	 * @param test
	 * @return
	 */
	Test saveOrUpdate(Test test);

	/**
	 * @param id
	 */
	void deleteTestById(long id);

	/**
	 * @return
	 */
	List<Test> findAllTests();

	/**
	 * @param test
	 * @return
	 */
	Test isTestExist(Test test);

}
