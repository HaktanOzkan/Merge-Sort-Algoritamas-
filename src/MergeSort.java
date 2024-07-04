import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] dizi = {12, 11, 15, 9, 7, 2, 5, 6, 1, 22, 29};
		System.out.println("Sirasiz Dizi: " + Arrays.toString(dizi));

        mergeSort(dizi);

        System.out.println("Sirali Dizi: " + Arrays.toString(dizi));
	}
	
	public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return; // Dizi zaten s�ral� ya da bo�sa i�lem yapmaya gerek yok
        }

        // Diziyi ikiye b�leriz
        int middle = array.length / 2;
        int[] left = new int[middle];
        int[] right = new int[array.length - middle];
        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, middle, right, 0, right.length);
        

        // Her iki yar�y� da s�ralar�z (�zyineleme kullanarak)
        mergeSort(left);
        mergeSort(right);

        // S�ralanm�� yar�lar� birle�tiririz
        merge(array, left, right);
    }
	
	public static void merge2(int[] result, int[] left, int[] right) {
		int i= 0;
		int j= 0;
		int k= 0;
		while (i<left.length && j<right.length) {
			if(left[i] <= right[j]) {
				result[k++] = left[i++];
			} else {
				result[k++] = right[i++];
			}
		}
		
		while(i<left.length) {
			result[k++] = left[i++];
		}
		while(j<right.length) {
			result[k++] = right[j++];
		}
	}
	
	private static void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // �ki yar�y� kar��la�t�rarak birle�tiririz
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Geriye kalan elemanlar� ekleriz
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

}
