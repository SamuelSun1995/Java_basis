package com.ujs.singlemode;
/**
 * ����ʽ����
 * @author SUN
 * ��һ������һ���������費��Ҫ�õ�ʵ����Ҫȥ����ʵ���������������ʱ��ʹ�����ʵ��������һ�ֿռ任ʱ��
 * ����������Ϊһ���������ԣ����������ı��ʡ�������ȫ��Ҫ����
 */
public class EHan {
	
	//˽�о�̬ʵ��(����һ��ʼ��new)
	private final static EHan mEHan = new EHan();
	
	/**
	 * ����Ϊfinal�ı�������������������ʱ�Ѿ���ֵ�� ��ʲô��˼�أ�
	���ǣ��������final��static��Ա�������ڹ�����������顢����ֱ�Ӷ��帳ֵ��
	�����final static ��Ա����������ֱ�Ӹ�ֵ �����ھ�̬������и�ֵ��Ȼ��ֱ�Ӹ�ֵ��̬������и�ֵ�ͱ�ɶ���ģʽ��
	��������ģʽ�в�����final����
	 */
	
	
	//˽�л����췽��
	private EHan() {}
	
	//����һ����̬���з���
	public static EHan getInstance() {
		return mEHan;
	}
}
/**	������ص�ʱ��ͳ�ʼ�����ʵ������������ʵ�������ף�������һ����
*	�ˣ����ʵ���п���û�б�ʹ��;ͬʱҲû���κε��쳣����;
**/