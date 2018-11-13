public class ModName{
	private static String dir="/InstallDir";
	private static void runcommand(String command) throws IOException{
		Runtime.getRuntime().exec(command);
	}
	//Make sure to keep as constructor class
	public ModName() {
		//Modify as appropriate
		File appdir= new File(dir);
		File launch = new File(dir+"ModJar.jar");
		if(!launch.exists()){
			System.exit();
		else {
			try {
				runcommand("java -jar "+dir+"Launcher.jar");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
