package desafios;

import java.util.ArrayList;
import java.util.List;

/*
	Write a function that groups a string into parentheses clusters. Each cluster should be balanced.

	Examples
		split("()()()") ➞ ["()", "()", "()"]
		
		split("((()))") ➞ ["((()))"]
		
		split("((()))(())()()(()())") ➞ ["((()))", "(())", "()", "()", "(()())"]
		
		split("((())())(()(()()))") ➞ ["((())())", "(()(()()))"]
		
	Notes
		All input strings will only contain parentheses.
		Balanced: Every opening parents ( must exist with its matching closing parents ) in the same cluster.
 */
public class ParenthesesClusters {

	public List<String> split(String parentheses){
		int countOpen = 0;
		int countClose = 0;
		String cluster = "";
		
		List<String> clusters = new ArrayList<>();
		
		for(int i = 0; i < parentheses.length(); i++) {
			
			if(parentheses.charAt(i) == '(') {
				cluster += parentheses.charAt(i);
				countOpen++;
			}else {
				cluster += parentheses.charAt(i);
				countClose++;
			}
			
			if(countOpen != 0 && countOpen == countClose) {
				clusters.add(cluster);
				countOpen = 0;
				countClose = 0;
				cluster = "";
			}
		}
		
		return clusters;
	}
	
	public static void main(String[] args) {
		ParenthesesClusters parathesesClusters = new ParenthesesClusters();
		
		String parentheses = "((()))(())()()(()())";
		List<String> clusters = parathesesClusters.split(parentheses);
		
		System.out.println(clusters);
		
	}

}
