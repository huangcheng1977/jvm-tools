import org.gridkit.jvmtool.SJK;


public class gc {

	public static void main(String[] args) {
		String[] cmd = new String[args.length + 1];
		System.arraycopy(args, 0, cmd, 1, args.length);
		cmd[0] = "gc";
		SJK.main(cmd);
	}
	
}