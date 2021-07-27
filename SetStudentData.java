package com.encap;

public class SetStudentData {
StudentVO setStudentData() {
	StudentVO svo=new StudentVO();
	svo.setSid(105);
	svo.setName("Ram");
	svo.setGender("Male");
	svo.setAge(21);
	svo.setCity("Hyderabad");
	return svo;
}
}
