public static void ExecuteScript(String script) throws Throwable {
	ScriptEngineManager mgr = new ScriptEngineManager();
	ScriptEngine engine = mgr.getEngineByName(“AppleScript”);
	engine.eval(script);
}
