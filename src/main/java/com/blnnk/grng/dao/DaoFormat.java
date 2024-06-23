package com.blnnk.grng.dao;

import java.util.List;

import org.springframework.ui.Model;

import com.blnk.grng.dto.PetDto;


public interface DaoFormat<E, T> {
	
	public int delete(T id);
	public List<E> findAll();
	public E findById(T id);
}
