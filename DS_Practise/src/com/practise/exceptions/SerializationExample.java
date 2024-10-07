package com.practise.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String address;

	public SerializationExample(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {
	
		SerializationExample s1 = new SerializationExample("ravi", "pune");
		String fileName = "C:\\Users\\004KDG744\\output.txt";
		
		try {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		System.out.println("Object saved in file");
		
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
