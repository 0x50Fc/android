package org.hailong.framework.tasks;

import java.io.File;

public interface ILocalResourceTask {
	/**
	 * ��ȡ��ԴURL
	 * @return
	 */
	public String getResourceUri();
	/**
	 * ����ԴlocalUri����
	 * @param localUri
	 */
	public Object setResourceLocalFile(File localUri);
	
	/**
	 * 
	 * @param obj �������Դ����
	 */
	public void setResourceObject(Object obj);
}
