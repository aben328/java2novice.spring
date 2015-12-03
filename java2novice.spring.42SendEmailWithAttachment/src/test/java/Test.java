import java.io.File;

/**
 * CLASSPATH文件的绝对路径获取测试<br>
 * 总结<br>
 * 使用工程相对路径是靠不住的。<br>
 * 使用CLASSPATH路径是可靠的。<br>
 * 对于程序要读取的文件，尽可能放到CLASSPATH下，这样就能保证在开发和发布时候均正常读取。<br>
 * @author leizhimin 2010-1-18 9:33:02
 */
public class Test {
	// classpath的文件路径
	private static String cp = "/a.txt";

	public static void main(String[] args) {
		// 当前类的绝对路径
		System.out.println(Test.class.getResource("/").getFile());
		// 指定CLASSPATH文件的绝对路径
		System.out.println(Test.class.getResource(cp).getFile());
		// 指定CLASSPATH文件的绝对路径
		File f = new File(Test.class.getResource(cp).getFile());
		System.out.println(f.getPath());
	}
}