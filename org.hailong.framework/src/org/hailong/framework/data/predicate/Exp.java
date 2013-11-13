package org.hailong.framework.data.predicate;

import org.hailong.framework.data.IDataEntityRawData;


public class Exp {
	
	protected Exp(){
		
	}
	
	/**
	 * ��
	 * @param exp
	 * @return
	 */
	public Exp and(Exp exp){
		return new ExpAnd(this,exp);
	}
	
	/**
	 * ��
	 * @param exp
	 * @return
	 */
	public Exp or(Exp exp){
		return new ExpOr(this,exp);
	}
	
	/**
	 * ��
	 * @return
	 */
	public Exp not(){
		return new ExpNot(this);
	}
	
	public boolean result(IDataEntityRawData data){
		return false;
	}
	
	public String sql(String prefix,String suffix){
		return "";
	}
}
