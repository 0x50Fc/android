package org.hailong.framework.tasks;

import java.io.File;

import org.hailong.framework.ITask;

public interface IResourceTask extends ITask {
	/**
	 * ��ȡ��ԴURL
	 * @return
	 */
	public String getResourceUri();
	/**
	 * �ж��Ƿ��ܹ�����
	 * @return
	 */
	public boolean isNeedDownload();
	/**
	 * �Ƿ�ǿ������
	 * @return
	 */
	public boolean isForceDownload();
	/**
	 * ����ԴlocalUri����
	 * @param localUri
	 * @return �������
	 */
	public Object setResourceLocalFile(File localUri);
	
	/**
	 * 
	 * @param obj �������Դ����
	 */
	public void setResourceObject(Object obj);
	
	/**
	 * ��Դ��С
	 */
	public double getResourceSize();
}