package com.demo.juc;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;

@SpringBootApplication
public class AtomicApplication {
	// 原子更新基本类型类
	static AtomicInteger atomicInteger = new AtomicInteger(1);

	// 原子更新数组类
	static int[] value = new int[] { 1, 2 };
	static AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(value);

	// 原子更新引用类型
	public static AtomicReference<User> atomicUserRef = new AtomicReference();
	static class User {
		private String name;
		private int old;
		public User(String name, int old) {
			this.name = name;
			this.old = old;
		}
		public String getName() {
			return name;
		}
		public int getOld() {
			return old;
		}
	}


	public static void main(String[] args) {
		// 原子更新基本类型类
		System.out.println(atomicInteger.getAndIncrement());
		System.out.println(atomicInteger.get());

		// 原子更新数组类
		atomicIntegerArray.getAndSet(0, 3);
		System.out.println(atomicIntegerArray.get(0));
		System.out.println(value[0]);

		//原子更新引用类型
		User user = new User("zhangsan", 16);
		atomicUserRef.set(user);
		User updateUser = new User("lisi", 18);
		atomicUserRef.compareAndSet(user, updateUser);
		System.out.println(atomicUserRef.get().getName());
		System.out.println(atomicUserRef.get().getOld());

		//		1
		//		2
		//		3
		//		1
		//		lisi
		//		18
	}
}
