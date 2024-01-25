/* Create a maven project structure using the maven command. (mvn archetype:generate -DgroupId=MavenEx -DartifactId=DemoMavenProject -DinteractiveMode=false) 
 * Create a Java class “MavenExample.java” that prints “Welcome to Maven”. Compile and run the class using maven command. (mvn exec:java -Dexec.mainClass=
 * "MavenExample") (Do not use any IDE like eclipse. Run it from command line).  */

package anudip.com;

public class MavenExample {
    public static void main(String[] args) {
        System.out.println("Welcome to Maven");
    }
}
