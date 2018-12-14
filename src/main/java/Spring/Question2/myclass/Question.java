package Spring.Question2.myclass;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	
	int questionId;
	String question;
	String answers;
	
	List<String> answers1;
	Set<String> answers2;
	Map<Integer,String> answers3;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public List<String> getAnswers1() {
		return answers1;
	}
	public void setAnswers1(List<String> answers1) {
		this.answers1 = answers1;
	}
	public Set<String> getAnswers2() {
		return answers2;
	}
	public void setAnswers2(Set<String> answers2) {
		this.answers2 = answers2;
	}
	public Map<Integer, String> getAnswers3() {
		return answers3;
	}
	public void setAnswers3(Map<Integer, String> answers3) {
		this.answers3 = answers3;
	}
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Question(int questionId, String question, String answers,
			List<String> answers1, Set<String> answers2,
			Map<Integer, String> answers3) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
		this.answers1 = answers1;
		this.answers2 = answers2;
		this.answers3 = answers3;
	}
	
	
	public void answerPrint(){
		
		System.out.println("Question:" + question
				+" Answer :" +answers );
	}
	
	
	public void answer1Print(){
		
		System.out.println("Question:" + question
				+" Answer :" +answers1 );
		
	}
	
	public void answer2Print(){
		
		System.out.println("Question:" + question
				+" Answer :" +answers2 );
	}
	
	public void answer3Print(){
		
		System.out.println("Question:" + question
				+" Answer :" +answers3 );
	}
}
