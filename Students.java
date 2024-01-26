package com.demo.bean;

public class Students {

		
		int id;
		int std;
		String ename;
		String email;
		public Students() {
			// TODO Auto-generated constructor stub
		}
		public Students(int id, int std, String ename,String email) {
			super();
			this.id = id;
			this.std = std;
			this.ename = ename;
			this.email=email;
		}
		public int getStd() {
			return std;
		}
		public void setStd(int std) {
			this.std = std;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		@Override
		public String toString() {
			return "Students [id=" + id + ", std=" + std + ", ename=" + ename + ", email=" + email + "]";
		}
		

		
	}


