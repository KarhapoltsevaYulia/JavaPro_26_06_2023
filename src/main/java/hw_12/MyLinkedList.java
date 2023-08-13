package hw_12;
import java.util.*;

public class MyLinkedList<T> implements List<T>, Deque<T> {
    MyNode<T> first;
    MyNode<T> tail;
    int size = 0;

    public MyLinkedList() {

    }
    public MyLinkedList(Collection<? extends T> c) {
        this();
        addAll(size,c);
    }
    @Override
    public boolean addAll(Collection<? extends T> c) {
        Object[] test = c.toArray();
        for (Object o : test) {
            add((T) o);
        }
        return false;
    }
    @Override
    public boolean add(T t) {
        add(size,t);
        return true;
    }
    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        examplIndex(index);
        addAll(c);
        return false;
    }
    @Override
    public void add(int index, T element) {
        MyNode<T> newNode = MyNode.valueOf(element);
        if (index == 0){
            addHead(newNode);
        } else if (index==size){
            addTail(newNode);
        } else {
            examplIndex(index);
            MyNode<T> myNode =examplIndex(index-1);
            newNode.linkNextElem=myNode.linkNextElem;
            myNode.linkNextElem=newNode;
            add(index, (T) newNode);
        }
        size++;
    }
    @Override
    public void addFirst(T t) {
        add(0,t);
    }

    @Override
    public void addLast(T t) {
        add(size,t);
    }

    private MyNode <T> examplIndex(int index) {
        if(exceptionIntex(index)) {
            if (index == size - 1) {
                return tail;
            } else {
                MyNode<T> now = first;
                for (int i = 0; i < index; i++) {
                    now = now.linkNextElem;
                }
                return now;
            }
        }
        return null;
    }
    private boolean exceptionIntex(int index){
        if(!(index >= 0 && index <= size)){
            throw new ArrayIndexOutOfBoundsException("index<0  or index>size");
        }
        return true;
    }
    private void addTail(MyNode<T> newNode) {
        tail.linkNextElem=newNode;
        tail=newNode;
    }

    private void addHead(MyNode<T> newNode) {
        newNode.linkNextElem=first;
        first=newNode;
        if (first.linkNextElem==null){
            tail=first;
        }
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first==null;
    }

    @Override
    public boolean contains(Object o) {
        MyNode<T> now = first;
        for(int i=0; i<size; i++){
            if (now.elem.equals(o)){
                return true;
            }
            now = now.linkNextElem;
        }
        return false;
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        int counter=0;
        Object[] test = c.toArray();
        for (int i=0; i<size; i++) {
            if (contains(test[i])) {
               counter++;
            }
        }
        return counter == test.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListItr(size);
    }

    @Override
    public Iterator<T> descendingIterator() {
        return null;
    }
    @Override
    public Object[] toArray() {
        Object[] test = new Object[size];
        int i = 0;
        MyNode<T> testI;
        for (testI = first; testI != null; testI = testI.linkNextElem)
            test[i++] = testI.elem;
        return test;
    }
    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
    @Override
    public boolean offerFirst(T t) {
        addFirst(t);
        return true;
    }
    @Override
    public boolean offerLast(T t) {
        addLast(t);
        return true;
    }
    @Override
    public T removeFirst() {
        T deleteElement = first.elem;
        first=first.linkNextElem;
        if(first==null){
            tail=null;
        }
        size--;
        return deleteElement;
    }
    @Override
    public T removeLast() {
        T deleteElement = tail.elem;
        MyNode<T> myNode = getRemovedElement(size);
        myNode.linkNextElem = myNode.linkNextElem.linkNextElem;
        tail=myNode;
        size--;
        return deleteElement;
    }

    private MyNode<T> getRemovedElement(int sizeDelete) {
        MyNode<T> now = first;
        for(int i = 0; i<sizeDelete-2; i++){
            now = now.linkNextElem;
        }
        return now;
    }

    @Override
    public T pollFirst() {
        if (isEmpty()) {
            return null;
        } else {
            return removeFirst();
        }
    }

    @Override
    public T pollLast() {
        if (isEmpty()) {
            return null;
        } else {
            return removeLast();
        }
    }

    @Override
    public T getFirst() {
        if(isEmpty()){
            return null;
        } else {
            return first.elem;
        }
    }

    @Override
    public T getLast() {
        if(isEmpty()){
            return null;
        } else {
            return tail.elem;
        }
    }

    @Override
    public T peekFirst() {
        if(isEmpty()){
            return null;
        } else {
            return getFirst();
        }
    }

    @Override
    public T peekLast() {
        if(isEmpty()){
            return null;
        } else {
            return getLast();
        }
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        if (isEmpty()) {
            return false;
        }else {
            remove(o);
        }
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        if (isEmpty()) {
            return false;
        }else {
            remove(o);
        }
        return false;
    }
    @Override
    public T remove() {
        return removeFirst();
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        Object[] test = c.toArray();
        for (int i = 0; i <size ; i++) {
            for (Object o : test) {
                remove(o);
            }
            return true;
        }
        return false;
    }
    @Override
    public boolean remove(Object o) {
        MyNode<T> now = first;
        T deleteElem = null;
            for(int i=0; i<size; i++){
                if (now.elem.equals(o)){
                    deleteElem=remove(i);
                    return true;
                }
                now = now.linkNextElem;
        }  return false;
    }

    @Override
    public T remove(int index) {
        if (exceptionIntex(index)) {
            MyNode<T> now = first;
            T deleteElem = null;
            if (index == 0) {
                deleteElem = removeFirst();
            } else {
                if (index == size - 1) {
                    deleteElem = removeLast();
                } else {
                    for (int i = 0; i < index - 1; i++) {
                        now = now.linkNextElem;
                    }
                    deleteElem = now.linkNextElem.elem;
                    now.linkNextElem = now.linkNextElem.linkNextElem;
                    size--;
                }
            }
            return deleteElem;
        }
        return null;
    }

    @Override
    public boolean offer(T t) {
        return add(t);
    }

    @Override
    public T poll() {
        return remove(0);
    }

    @Override
    public T element() {
        return getFirst();
    }

    @Override
    public T peek() {
        return getLast();
    }

    @Override
    public void push(T t) {
        add(0,t);
    }

    @Override
    public T pop() {
        return removeFirst();
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        Object[] test = c.toArray();
        if (test.length!= 0) {
            MyNode<T> myNode = first;
            for (int i = 0; i < test.length; i++) {
                for (int j = 0; j < size; j++) {
                    if (myNode.elem.equals(test[i])) {
                        continue;
                    } else {
                        remove(test[i]);
                    }
                }
                myNode = myNode.linkNextElem;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        first=tail=null;
        size=0;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        if (exceptionIntex(index)) {
            MyNode<T> myNode = getIndex(index);
            return myNode.elem=element;
        }
        return null;
    }

    private MyNode<T> getIndex(int index) {
        MyNode<T> now = first;
        for(int i=0; i<index; i++){
            now=now.linkNextElem;
        }
        return now;
    }

    @Override
    public int indexOf(Object o) {
        MyNode<T> myNode =first;
        for (int i = 0; i < size; i++) {
            if(myNode.elem.equals(o)){
                return i;
            }
            myNode= myNode.linkNextElem;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        MyNode<T> myNode = tail;
        for (int i = size; i > 0; i--) {
            if(myNode.elem.equals(o)){
                return i;
            }
            myNode.linkNextElem = myNode.linkNextElem.linkNextElem;
            tail=myNode;

        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        return new MyListItr(size);
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return new MyListItr(index);
    }
    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
    private class MyListItr implements ListIterator<T>{
        private MyNode<T> lastReturned;
        private MyNode<T> next;
        private int nextIndex;

        MyListItr(int index) {
            next = (index == size) ? null : new MyNode(index);
            nextIndex = index;
        }
        @Override
        public boolean hasNext() {
            return nextIndex < size;
        }

        @Override
        public T next() {
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        @Override
        public T previous() {
            return null;
        }

        @Override
        public int nextIndex() {
            return nextIndex;
        }

        @Override
        public int previousIndex() {
            return nextIndex-1;
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
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "first=" + first +
                ", last=" + tail +
                ", size=" + size +
                '}';
    }

    private static class MyNode<T>{
        T elem;
        MyNode<T> linkNextElem;

        MyNode(T element) {
            this.elem = element;

        }
        public static <T> MyNode<T> valueOf (T element){
            return new MyNode<>(element);
        }
    }
}
