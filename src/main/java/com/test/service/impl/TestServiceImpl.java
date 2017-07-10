package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.entity.Test;
import com.test.repository.TestRepository;
import com.test.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestRepository testRepository;

	@Override
	public Test findTestById(long id) {
		return testRepository.findOne(id);
	}

	@Override
	public Test saveOrUpdate(Test test) {
		return testRepository.save(test);
	}

	@Override
	public void deleteTestById(long id) {
		testRepository.delete(id);
	}

	@Override
	public List<Test> findAllTests() {
		return testRepository.findAll();
	}

	@Override
	public Test isTestExist(Test test) {
		// TODO Auto-generated method stub
		return null;
	}

}
