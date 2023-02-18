public class ArrayCRUD{
    int arr[];
    int currentSize;
    public ArrayCRUD(int n){
        this.arr=new int[n];
        this.currentSize=0;
    }
    public void insert(int index,int item){
        if(index>currentSize){
            System.out.println("zIndex can not be greater then current size");
        
        }
        for(int i=currentSize;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=item;
        currentSize++;
        System.out.println("element added");
        return;


    }
    public void delete(int index){
        if(currentSize==0){
            System.out.println("Array is empty ");
            return;
        }
        for(int i=index;i<currentSize-1;i++){
            arr[i]=arr[i+1];
            arr[currentSize-1]=0;
            currentSize--;
            System.out.println("Elemenet remove");
        }


    }
    void Search(int item){
        for(int i=0;i<=currentSize;i++){
            if(arr[i]==item){
                System.out.println("Array index is : "+i);

            }
        }

    }
    void update(int index,int item){
        arr[index]=item;

    }
    void print(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayCRUD obj=new ArrayCRUD(5);
        obj.insert(0, 10);
        obj.insert(1, 20);
        obj.insert(2, 30);
        obj.insert(3, 40);
        obj.insert(1, 11);
        obj.delete(2);
        obj.Search(10);
        obj.update(0, 60);
        obj.print();
    }
}
