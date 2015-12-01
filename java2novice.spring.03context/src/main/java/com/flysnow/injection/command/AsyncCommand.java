package com.flysnow.injection.command;

/**
 * 一个异步处理命令的实现
 * @author http://flysnow.iteye.com/blog/733785
 */
public class AsyncCommand implements Command {

	/* (non-Javadoc)
	 * 
	 * @see com.flysnow.lookup.command.Command#execute() */
	public Object execute() {
		// 返回自身实例，是为了测试的时候好看出每次返回的不是同一个实例
		return this;
	}

}