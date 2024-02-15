package a;

class GraduateStudent extends Student {

	public void computeCourseGrade() {
int total = 0;
	
for (int i = 0; i < NUM_OF_TESTS; i++) {      // Final i kullanabildik dikkat et
total += test[i];								// test arrayini kullandýk
}
	if (total/NUM_OF_TESTS >= 80) {
courseGrade = "Pass";
} 	else {
courseGrade = "No Pass";
}
}
}

