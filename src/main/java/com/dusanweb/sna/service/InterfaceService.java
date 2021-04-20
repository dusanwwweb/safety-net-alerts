package com.dusanweb.sna.service;

import java.util.List;

public interface InterfaceService<T> {
	
	public List<T>getList();
	public T create(T t);
	public void delete(T t);
	public T update(T t);
	//public T getByFullName(String firstName, String lastName);
	//public List<T> getByAddress(String address);

}
