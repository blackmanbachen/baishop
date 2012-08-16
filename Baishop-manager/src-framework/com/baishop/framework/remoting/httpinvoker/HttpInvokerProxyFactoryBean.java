package com.baishop.framework.remoting.httpinvoker;


/**
 * 扩展HttpInvokerProxyFactoryBean
 * @author Linpn
 */
public class HttpInvokerProxyFactoryBean 
			extends org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean {
	
	private String prefix;
	
	
	/**
	 * 设置URL前缀
	 * @param prefix URL前缀
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	/**
	 * 设置URL
	 */
	@Override
	public void setServiceUrl(String serviceUrl) {
		super.setServiceUrl(this.prefix + serviceUrl);
	}

}
