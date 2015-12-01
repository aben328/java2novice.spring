package com.flysnow.injection.command;

/**
 * 下面定义Command接口和其实现类AsyncCommand。 一个命令接口
 */
public interface Command {
	/**
	 * 执行命令
	 * @return
	 */
	public Object execute();
}