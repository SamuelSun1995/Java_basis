package com.ujs.innerclass;

/**
 * �ڲ���
 * @author SUN
 *	https://blog.csdn.net/hacker_zhidian/article/details/82193100
 */
public class TestInnerClass {
	public static void main(String[] args) {
		StaticInnerClassTest mStaticInnerClassTest = new StaticInnerClassTest();
	}
}

/**
 * 
1.��ͨ�ڲ���
	�ڲ��������Է����ⲿ����������з���Ȩ�޵��ֶΣ�ͬʱ���ⲿ�����Ҳ����ͨ���ڲ���Ķ�������������
�ڲ����ж�������з���Ȩ�޵��ֶΡ�
2.��̬�ڲ���

3.�����ڲ���

4.�ֲ��ڲ���


�ڲ����Ƕ��:
�ڲ����Ƕ�ף���Ϊ�ڲ������ٶ����ڲ��࣬���������ڲ���ķ���Ƕ�ȥ���ǱȽϺ��ʣ�
��ͨ�ڲ��ࣺ���������ǿ��԰�������һ���ⲿ�����ͨ��Ա�����������ڲ����Զ�����ͨ�ڲ��ࣨǶ�׵���ͨ�ڲ��ࣩ�������޷����� static ���ε��ڲ��࣬�������޷��ڳ�Ա�����ж��� static ���͵ı���һ������ȻҲ���Զ��������ڲ���;ֲ��ڲ��ࣻ

��̬�ڲ��ࣺ��Ϊ�����������ⲿ���������ڣ�������ȫ���Խ����ó�����ȥ���������� static �ؼ��֣�������һ���������࣬����ھ�̬�ڲ����ڲ����Զ�����ͨ�ڲ��࣬Ҳ���Զ��徲̬�ڲ��࣬ͬʱҲ���Զ��� static ��Ա��

�����ڲ��ࣺ����ͨ�ڲ���һ�����������ͨ�ڲ���ֻ������������ڲ�����ʹ�ã�����ľֲ��ڲ���ֻ���ڶ�Ӧ��������ʹ�ã�

�ֲ��ڲ��ࣺ�������ڲ���һ��������Ƕ�׶�����ڲ���ֻ���ڶ�Ӧ��������ʹ�á�

�ڴ�й¶����ָ���ڴ��д���һЩ���ڴ�ռ���Ա����յĶ�����ΪĳЩԭ����û�б����գ���˲������ڴ�й¶��
���Ӧ�ó���Ƶ�������ڴ�й¶���ܻ���������صĺ�����ڴ��п��õĿռ䲻�㵼�³��������������������ϵͳ
��������

��α����ڴ�й©��
	1.���þ�̬�ڲ���;���ʹ�þ�̬�ڲ���;
	2.����һЩ�Զ�����Ķ������� static �ؼ������Σ����������Ķ������������ȷʵӦ�úܳ���;
	3.ΪĳЩ��������ͣ��ṩһ����������������Ҫ�����յ�ʱ�����ں����������е�һЩС����ķ���;

*/