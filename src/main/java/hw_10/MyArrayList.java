package hw_10;

import java.util.*;
import java.util.function.Consumer;

public class MyArrayList<T>implements List<T> {
    private static final int CAPACITY_LENGTH_MY_ARRAY_LIST =10;
    public Object[] myArrayList;
    public Object[] myArrayListDefault={};
    private int lenghtMyArrayList;
    public int length;
    public int size;

    public MyArrayList(){
        this.myArrayList= new Object[CAPACITY_LENGTH_MY_ARRAY_LIST];
        this.lenghtMyArrayList = CAPACITY_LENGTH_MY_ARRAY_LIST;
    }

    public MyArrayList(int lenghtMyArrayList) {
        if (lenghtMyArrayList<0){
            throw new IllegalArgumentException("Enter value  < 0 lenghtMyArrayList: "+
                    lenghtMyArrayList);
        } else {
            if (lenghtMyArrayList == 0){
                this.myArrayList = new Object[CAPACITY_LENGTH_MY_ARRAY_LIST];
            } else {
                this.myArrayList = new Object[lenghtMyArrayList];
            }
        }
    }
    public MyArrayList(Collection<? extends T> c) {
        Object[] testArray = c.toArray();
        if (testArray.length!=0) {
            this.myArrayList=new Object[size];;
            if (testArray.getClass()==this.myArrayList.getClass()) {
                this.myArrayList = testArray;
            }
            else {
               System.arraycopy(testArray,0,this.myArrayList,0, testArray.length);
            }
        }else {
           myArrayList = myArrayListDefault;
        }
    }
    private void add (T t, Object[] myArrayList, int size){
        if (size==myArrayList.length){
            this.myArrayList=increaseList(myArrayList,size);
            this.myArrayList[this.size] = t;
            this.size++;
        }else {
            this.myArrayList[this.size] = t;
            this.size++;
        }
    }
    private Object[] increaseList(Object[] myArrayList, int size){
        int newLength = this.myArrayList.length*2;
        myArrayList= Arrays.copyOf(myArrayList,newLength);
        return myArrayList;
    }
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size != 0;
    }

    @Override
    public boolean contains(Object o) {
        for(int i=0; i < this.size; i++){
            if (this.myArrayList[i].equals(o)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        int counter=0;
        Object[] test = c.toArray();
        if (test.length!=0 && (test.getClass()==this.myArrayList.getClass())) {
            for (int i = 0; i < this.size; i++) {
                for (Object o : test) {
                    if (this.myArrayList[i].equals(o)) {
                        counter++;
                        if (counter == test.length - 1) {
                            return true;
                        }
                    }
                }
            }
        } else throw new NullPointerException("Arrays == 0");
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator(0);
    }

    @Override
    public Object[] toArray() {
        return  Arrays.copyOf(myArrayList, size);
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        if (a.length!=0){
            return (T1[]) Arrays.copyOf(myArrayList, size, a.getClass());
        }
        return null;
    }

    @Override
    public boolean add(T t) {
        add(t,myArrayList,size);
        return true;
    }

    @Override
    public void add(int index, T element) {
        int counter = size;
        if (index<0) throw new ArrayIndexOutOfBoundsException();
        if((counter++)>=this.myArrayList.length) {
            increaseList(myArrayList,size);
            elementInsertionAdd(index,element);
        } else {
            elementInsertionAdd(index,element);
        }
    }
    private Object elementInsertionAdd(int index, T element ){
        Object[] test= new Object[size];
        System.arraycopy(this.myArrayList,index,test,0,size-index);
        this.myArrayList[index] = element;
        System.arraycopy(test,0,this.myArrayList,index+1,test.length);
        size++;
        return this.myArrayList;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        Object[] test = c.toArray();
        int newLength = this.size + test.length;
        while (newLength>=this.myArrayList.length){
            this.myArrayList=increaseList(myArrayList,size);
        }
        System.arraycopy(test,0,this.myArrayList,this.size,test.length);
        this.size= this.size+test.length;
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        examplIndex(index);
        Object[] testOld=Arrays.copyOfRange(this.myArrayList, index,this.size);
        addAll(c);
        System.arraycopy(testOld,0,this.myArrayList,this.size+1,testOld.length);
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        Object[] test = c.toArray();
        if (test.length!=0) {
            for (int i = 0; i < test.length; i++) {
                remove(test[i]);
                if (i == test.length) return true;
            }
        } else throw new NullPointerException(" delete collection length == 0");
        return false;
    }
    @Override
    public T remove(int index) {
        examplIndex(index);
        Object test=this.myArrayList[index];
        deleteElement(index);
        return (T) test;
    }
    @Override
    public boolean remove(Object o) {
        int testIndex;
        for(int i=0; i<this.size; i++){
            if (this.myArrayList[i].equals(o)){
                testIndex=i;
                deleteElement(testIndex);
                return true;
            }
        }
        return false;
    }
    private void deleteElement(int index){
        int newLength = this.size-index;
        System.arraycopy(this.myArrayList,index+1,this.myArrayList,index,newLength);
        this.size--;
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        Object[] test= c.toArray();
        int counter=0;
        if (test.length!=0){

                for (int i = 0; i < test.length; i++) {
                    for (int j=0; j < this.myArrayList.length-1; j++){
                        if((test[i].equals(this.myArrayList[j]))) {
                        this.myArrayList[j]=null;
                    }
                }
            }
        } else throw new NullPointerException("Retain Collection length =0");
        return false;
    }

    @Override
    public void clear() {
        this.myArrayList = myArrayListDefault;
        this.size=0;
    }

    @Override
    public T get(int index) {
        examplIndex(index);
        return (T) this.myArrayList[index];
    }

    @Override
    public T set(int index, T element) {
        examplIndex(index);
        Object test= this.myArrayList[index];
        this.myArrayList[index]=element;
        return (T) test;
    }
    private void examplIndex(int index){
        if (index<0) throw new ArrayIndexOutOfBoundsException("Index < length");
        if (index>this.myArrayList.length) throw new ArrayIndexOutOfBoundsException("Index > length");
    }

    @Override
    public int indexOf(Object o) {
        if (isEmpty()) {
            for (int i=0; i<this.size; i++){
                if (this.myArrayList[i].equals(o)) {
                    return i+1;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (isEmpty()) {
            for (int i=this.size-1; i>=0; i--) {
                if (this.myArrayList[i].equals(o)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        MyIterator myIterator = new MyIterator(0);
        return (ListIterator<T>) myIterator;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException(index);
        return  new MyIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        if (isEmpty()) {
            Object[] tList = Arrays.copyOfRange(this.myArrayList, fromIndex,toIndex);
            List<T> tList1 = new ArrayList<>(tList.length);
            return  tList1;
        }else throw new NullPointerException("SubList Array == 0");
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "myArrayList=" + Arrays.toString(myArrayList) +
                '}';
    }
    private class MyIterator implements ListIterator<T>{
        int indexNow=size;
        int indexMyArray;

        public MyIterator(int indexMyArray) {
            this.indexMyArray = indexMyArray;
        }

        @Override
        public boolean hasNext() {
            if(size==lenghtMyArrayList) return false;
            else return true;
        }

        @Override
        public T next() {
            if (hasNext())
                throw new NoSuchElementException();
            Object[] iteratorArray = MyArrayList.this.myArrayList;
            indexNow++;
            return (T)iteratorArray ;
        }

        @Override
        public boolean hasPrevious() {
            return indexNow!=0;
        }

        @Override
        public T previous() {
            Object[] iteratorArray;
            if (hasPrevious()) {
                iteratorArray = MyArrayList.this.myArrayList;
                indexNow--;
            } else throw new NoSuchElementException();
            return (T) iteratorArray;
        }

        @Override
        public int nextIndex() {
            return indexNow;
        }

        @Override
        public int previousIndex() {
            return indexNow--;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(T t) {

        }

        @Override
        public void add(T t) {

        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            ListIterator.super.forEachRemaining(action);
        }
    }
}
