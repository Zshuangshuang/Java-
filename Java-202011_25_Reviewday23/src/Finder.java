/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-25
 * Time: 18:52
 **/

    public class Finder {
        public void qSort(int[] array){
            qSortHelper(array,0,array.length-1);
        }
        public void qSortHelper(int[] array,int lowIndex,int highIndex){
            int size = 0;
            size = highIndex-lowIndex+1;
            if(size <= 1){
                return;
            }
            int keyIndex = partition(array,lowIndex,highIndex);
            qSortHelper(array,lowIndex,keyIndex-1);
            qSortHelper(array,keyIndex+1,highIndex);
        }
        public void swap(int[] array,int x,int y){
            int tmp = array[x];
            array[x] = array[y];
            array[y] = tmp;
        }
        public int partition(int[] array,int lowIndex,int highIndex){
            int key = array[lowIndex];
            int leftIndex = lowIndex;
            int rightIndex = highIndex;
            while(leftIndex < rightIndex){
                while(leftIndex<rightIndex && array[rightIndex]<=key){
                    rightIndex--;
                }
                while(leftIndex<rightIndex && array[leftIndex]>=key){
                    leftIndex++;
                }
                swap(array,leftIndex,rightIndex);
            }
            swap(array,lowIndex,leftIndex);
            return leftIndex;
        }
        public int findKth(int[] a, int n, int K) {
            if(K > n){
                return -1;
            }
            if(n == 0){
                return -1;
            }
            // write code here
            qSort(a);
            return a[K-1];
        }
    }

