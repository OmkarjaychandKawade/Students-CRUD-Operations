package com.demo.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.bean.Students;
import com.demo.config.SpringJDBCConfig;
import com.demo.dao.StudentsDAOImpl;

public class TestMain {

		public TestMain() {
			// TODO Auto-generated constructor stub
		}
		public static void main(String[] args) {
			
			ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringJDBCConfig.class);
			System.out.println("context loaded");
			
			StudentsDAOImpl studsDao = ctx.getBean(StudentsDAOImpl.class);
			
			
			boolean option=true;
			while (option) {
				Scanner sc=new Scanner (System.in);
				System.out.println("Choose the correct option");
				System.out.println("1.Insert");
				System.out.println("2.Update");
				System.out.println("3.delete");
				System.out.println("4.All Students");
				System.out.println("5.Exit");
				int choice=sc.nextInt();
				switch (choice) {
				
				case 1:
					System.out.println("Enter students id");
					int id=sc.nextInt();
					
					System.out.println("Enter students name");
					String name =sc.next();

					System.out.println("Enter students std");
					int std=sc.nextInt();
					
					System.out.println("Enter students email");
					String email=sc.nextLine();
					
					
					
					Students e=new Students(id,std,name,email);
					
					int rows=studsDao.insertStudents(e);//
					
					System.out.println(rows + "inserted");
					
					break;
					
				case 2:
					
					System.out.println("Enter students id");
					int id1=sc.nextInt();
					
					
					System.out.println("Enter students std");
					int std1=sc.nextInt();
					
					
					Students eudate=new Students();
					
					eudate.setId(id1);
					
					eudate.setId(id1);
					eudate.setStd(std1);
					
					int rows1=studsDao.updateStudents(eudate);
					
					System.out.println(rows1 + "Updated");
					
					break;
					
					
				case 3:
					
					System.out.println("Enter students id");
					int id2=sc.nextInt();
					
					Students edelete=new Students();
					edelete.setId(id2);
					
	              int rows2=studsDao.deleteStudents(edelete);
					
					System.out.println(rows2 + "delete");
					
					break;
					

				case 4:
					System.out.println("All students");
					
					Students empAll=new Students();
	                    List<Students> list=studsDao.getAllStudents();
	                    for(Students e1:list) {
	                    	System.out.println(e1);
	                    }
	                    break;
	                    
	                    
				                case 5:
				                option=false;
				                
				           
				                break;
				}

			}
			}
				
			}
			





