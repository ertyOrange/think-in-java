/**
 * 
 */
/**
 * @author yy263
 *
 */
package baseArithmetic;


public class baseArithmetic {
	
	public static void main(String[] args) {
		
	}
	

//���ַ�����
public static int search(int[] arr, int key){
    int start=0;
    int end=arr.length-1;
    while (start<=end)
    {
        int mid = (end+start)/2;
        if (key<arr[mid])
        {
            end=mid-1;
        }else if (key>arr[mid]){
            start=mid+1;
        }else {
            return mid;
        }
    }
    return -1;
}

//����
public static void swap(int[] arr, int i, int j){
    //��ͨ
//    int tmp=arr[i];
//    arr[i]=arr[j];
//    arr[j]=tmp;

    //λ����
    arr[i]^=arr[j];
    arr[j]^=arr[i];
    arr[i]^=arr[j];
}

//�������� ����
public static void insertSort(int[] a) {
    int i, j, insertNote;// Ҫ���������
    for (i = 1; i < a.length; i++) {// ������ĵڶ���Ԫ�ؿ�ʼѭ���������е�Ԫ�ز���
        insertNote = a[i];// ���������еĵ�2��Ԫ��Ϊ��һ��ѭ��Ҫ���������
        j = i - 1;
        while (j >= 0 && insertNote < a[j]) {
            a[j + 1] = a[j];// ���Ҫ�����Ԫ��С�ڵ�j��Ԫ��,�ͽ���j��Ԫ������ƶ�
            j--;
        }
        a[j + 1] = insertNote;// ֱ��Ҫ�����Ԫ�ز�С�ڵ�j��Ԫ��,��insertNote���뵽������
    }
}

//ð������ ����
public static void select(int[] arr){
    for (int i=0; i<arr.length-1; i++)
    {
        for (int j=0; j<arr.length-1-i;j++)
        {
            if (arr[j]>arr[j+1])
            {
                int tmp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tmp;
            }
        }
    }
}

// ѡ����������
public static void selectSort(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        int tmp = arr[i];
        int index=i;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j]<tmp) {
                tmp=arr[j];
                index=j;
            }
        }
        if (index!=i) {
            //����
            arr[i]=arr[index]; 
            arr[index]=tmp;
        }
    }
}

//ȥ��
public static void searchRepeatIndex(int[] arr){
    for (int i = 0; i < arr.length-1; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i]==arr[j]) {
                System.out.println("�ظ�Ԫ���±�:"+i);
                break;//ȥ�������Բ����ظ�����
            }
        }
    }
}
}