import java.util.Scanner;
public class UseCaseEstmate {
static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("Unadjusted Use Case Points are " +(UseCasePointCount() + ActorPointCount()));
//System.out.println("Technical Complexity Factor is " +TechnicalComplexityFactor ());
//System.out.println("Environment Factor is " +EnvironmentFactor ());
 System.out.println("Use Case Point for the project is " +(UseCasePointCount() + ActorPointCount())*TechnicalComplexityFactor ()*EnvironmentFactor ());
	}
public static int UseCasePointCount (){
	int UseCasePoint = 0;
		System.out.println("How many complex use cases?");
		UseCasePoint += Integer.parseInt(in.nextLine())*15;
		System.out.println("How many average use cases?");
		UseCasePoint += Integer.parseInt(in.nextLine())*10;
		System.out.println("How many simple use cases?");
		UseCasePoint += Integer.parseInt(in.nextLine())*5;
		return UseCasePoint;	
}
public static int ActorPointCount (){
	int ActorPoint = 0;
		System.out.println("How many complex actors?");
		ActorPoint += Integer.parseInt(in.nextLine())*3;
		System.out.println("How many average actors?");
		ActorPoint += Integer.parseInt(in.nextLine())*2;
		return ActorPoint;	
}
public static double TechnicalComplexityFactor (){
	double TFactor = 0;
		System.out.println("Please give assessment value between 0 & 5 of 13 technical complexity factors");
		System.out.println("1. Distributed System");
		TFactor += Integer.parseInt(in.nextLine())*2;
		System.out.println("2. Performance objective");
		TFactor += Integer.parseInt(in.nextLine())*2;
		System.out.println("3. End-user efficiency");
		TFactor += Integer.parseInt(in.nextLine())*1;
		System.out.println("4. Complex processing");
		TFactor += Integer.parseInt(in.nextLine())*1;
		System.out.println("5. Reusable code");
		TFactor += Integer.parseInt(in.nextLine())*1;
		System.out.println("6. Easy to install");
		TFactor += Integer.parseInt(in.nextLine())*0.5;
		System.out.println("7. Easy to use");
		TFactor += Integer.parseInt(in.nextLine())*0.5;
		System.out.println("8. Portable");
		TFactor += Integer.parseInt(in.nextLine())*2;
		System.out.println("9. Easy to change");
		TFactor += Integer.parseInt(in.nextLine())*1;
		System.out.println("10. Concurrent use");
		TFactor += Integer.parseInt(in.nextLine())*1;
		System.out.println("11. Security");
		TFactor += Integer.parseInt(in.nextLine())*1;
		System.out.println("12. Access for 3rd party");
		TFactor += Integer.parseInt(in.nextLine())*1;
		System.out.println("13. Training needs");
		TFactor += Integer.parseInt(in.nextLine())*1;
		return 0.6 + 0.01*TFactor;	
}
public static double EnvironmentFactor (){
	double EFactor = 0;
		System.out.println("Please give assessment value between 0 & 5 of 8 environment factors");
		System.out.println("1. Familiar with development process");
		EFactor += Integer.parseInt(in.nextLine())*1.5;
		System.out.println("2. Application experience");
		EFactor += Integer.parseInt(in.nextLine())*0.5;
		System.out.println("3. Object-oriented experience");
		EFactor += Integer.parseInt(in.nextLine())*1;
		System.out.println("4. Lead analyst capability");
		EFactor += Integer.parseInt(in.nextLine())*0.5;
		System.out.println("5. Motivation");
		EFactor += Integer.parseInt(in.nextLine())*1;
		System.out.println("6. Stable requirements");
		EFactor += Integer.parseInt(in.nextLine())*2;
		System.out.println("7. Part-time staff");
		EFactor += Integer.parseInt(in.nextLine())*-1;
		System.out.println("8. Difficult programming language");
		EFactor += Integer.parseInt(in.nextLine())*-1;
		return 1.4 + -0.03*EFactor;	
}
}
