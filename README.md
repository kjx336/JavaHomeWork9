 JavaHomeWork9
���̳߳������
===============
������������������
------
* ��д����ʵ�������߳̽����ӡ�Լ������֡�Ҫ��ֱ�ʹ��Thread���Runnable�ӿڶ����߳��ࡣ

* ���������̣߳��ֱ��ڴ�ӡ�Լ�ʵ������ʱ�������5���ӣ�Ȼ���ٴ��ظ��������̣�ֱ�����û���ֹʱΪֹ��

### ��д����ʵ�������߳̽����ӡ�Լ������֡�Ҫ��ֱ�ʹ��Thread���Runnable�ӿڶ����߳��ࡣ

ʹ��һ��Thread���һ��Runnable�ӿ�ʵ���������̣����н����ӡ�Լ����߳���

### ���������̣߳��ֱ��ڴ�ӡ�Լ�ʵ������ʱ�������5���ӣ�Ȼ���ٴ��ظ��������̣�ֱ�����û���ֹʱΪֹ��

������ҵ�ѵ����ڡ������������룬�ʹ�ӡ�Լ���ʵ������ʱ�䡣�������뻹��򵥣��ڲ�����������ʱ�䷽�棬ʹ�û�ȡʱ����ķ�ʽ���н�������̹߳�����¼��ǰʱ������߳̿�ʼ����ʱ��¼��ǰʱ��������ֵ��ӡ������

����
------
### ��������̻߳���
Thread��RunnableĿǰ����������࣬�պ�����ѧϰʱ��Ľ�������֪��<br>Thread�����߳���̳�Thread�࣬�����߳�������run��start��wait�ȷ���������д��<br>Runnable������Ҫʵ����ӿ�

### �����̵߳���������
�½�״̬->ִ��start��������->����״̬->ִ��run��������->����״̬��ϵͳ���ȣ���ȡcpu����Դ��->run������������->����״̬<br>����������״̬ʱ������ʹ��sleep��˯�ߣ���suspend�����𣩵ȷ���������𣬽�������״̬���ó�cpu����Դ<br>����ʹ��stop������destroy��������ǿ�н�������ֹ

### ����javaʱ���
Java�У���ȡʱ�����ָ��Ϊ��
```
System.currentTimeMillis()
```
��Ҫע����ǣ�javaʱ�����long���ͣ������Ǿ�ȷ�����뼶�ġ���Ҫ�����þ����任:
```
((float)(System.currentTimeMillis())/1000)
```
�Ͼ���Ҫ�����룬���������ֳ����߳�֮����ȵ��µ����Ӧ�ò��ᳬ��1�룬���Ի��ǵ��Ȱ�ʱ������float�ͣ��ٳ�1000��
<br>*Signed-off-by: ң������kzx <kjx336@163.com>*