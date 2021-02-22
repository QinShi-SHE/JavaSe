package qinshi.day17.linked_03;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName LinkedContainer
 * @Date 2021/1/22 14:18
 */
/*
1.定义一个add方法，添加数据
2.构造方法，创建对象
3.获取个数的方法
4.toString获取数据
 */
public class LinkedContainer {
    Node first;//2.链表顶端
    int size;

    public void add(Object obj){
        Node node = new Node(obj); //每次添加数据封装成一个Node对象
        if(first == null){//3.如果是第一次添加数据,应该将第一个节点放到链表顶端first
            first = node;
        }else{//4.二次，三次 及之后新的数据添加到链表尾部，挂在最后一个Node对象后面
            Node temp = first;
            //temp.next == null;表示最后一个节点
            //temp.next != null;表示还有下一个节点,所以需要遍历
            while(temp.next != null){
                temp = temp.next;//把下一个节点地址值给到temp，temp最终指向最后一个节点
            }
            temp.next = node;//最新的节点挂到链表末尾
        }
        size++;
    }

    @Override
    public String toString() {
        Node temp = first;//遍历链表取出每个节点中data字段保存的值
        StringBuilder sb = new StringBuilder("[");
        while(temp != null){
            if(temp.next!=null){//中间的追加,
                sb.append(temp.data).append(",");
            }else{
                sb.append(temp.data).append("]");
            }
            temp = temp.next;
        }
        return sb.toString();
    }

    //节点类
    class Node{
        //可以存放任意类型的数据
        private Object data;
        //用于保存下一个节点的地址值
        private Node next;

        public Node(Object data){
            this.data=data;
        }
    }
}

