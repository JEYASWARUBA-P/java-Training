package Day30;

public class HeapRemove {
    int[] heap ={18,16,8,15,7,2,5,1,4};
    int size = 9;
    void remove(){
        heap[1] = heap[size];
        size--;
        int cur =1;
        while(true){
            int leftchild = 2*cur;
            int rightchild = 2*cur + 1;
            int L = cur;
            if(heap[L] < heap[leftchild]){
                L = leftchild;
            }
            if(heap[L] < heap[rightchild]){
                L = rightchild;
            }
            if(cur == L){
                break;
            }
            int temp = heap[L];
            heap[L] = heap[cur];
            heap[cur] = temp;

            cur = L;

        }
        public void Printheap(){
            for(int )

        }

    }
    
}
