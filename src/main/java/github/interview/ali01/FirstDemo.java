package github.interview.ali01;

import org.junit.Test;

import java.util.Stack;

/**
 * @author admin
 * @title: FirstDemo
 * @projectName base_thread
 * @description: TODO
 * @date 2021/1/6 16:21
 */
public class FirstDemo<T> {

    /**
     * 如何实现一个高效的单向链表逆序输出？
     * @param head
     */
    public  void reverse(ListNode<T> head){
        if(head == null || head.next == null){
            return;
        }
        ListNode<T> currentNode = head;
        Stack<ListNode<T>> stack = new Stack<>();
        while(currentNode != null){
            stack.push(currentNode);
            ListNode<T> tempNode = currentNode.next;
            currentNode.next = null;//断开连接
            currentNode = tempNode;
        }
        head = stack.pop();
        currentNode = head;

        while (!stack.isEmpty()){
            currentNode.next = stack.pop();
            currentNode = currentNode.next;
        }
    }

    /**
     * 不带头节点的链表逆序输出
     * @param head
     */
    public  void reverse2(ListNode<T> head){
        if(head == null || head.next == null){
            return;
        }
        ListNode<T> currentNode = head.next;
        ListNode<T>  newHead = head;
        newHead.next = null;//还需要将头节点的下一个节点置空
        ListNode<T> tempNode = head;
        while(currentNode != null){
            tempNode = currentNode.next;//首先把当前链表后移,并进行保存
            currentNode.next = newHead;//然后把新的链表放在当前节点信息的下一个节点
            newHead = currentNode;//然后在复制给新的头节点
            currentNode = tempNode;//最后将保存当前链表的所在节点信息赋值给currentNode
        }
        head = newHead;
        currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.val+"->");
            currentNode=currentNode.next;
        }

    }

    /**
     * 链表逆序输出测试
     * @param args
     */
    @Test
    public void reverseTest(String[] args) {
        ListNode<Integer> head = new ListNode<>(1);
        ListNode<Integer> head2 = new ListNode<>(2);
        ListNode<Integer> head3 = new ListNode<>(3);
        ListNode<Integer> head4 = new ListNode<>(4);
        ListNode<Integer> head5 = new ListNode<>(5);
        ListNode<Integer> head6 = new ListNode<>(6);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        FirstDemo<Integer> firstDemo = new FirstDemo<Integer>();
        firstDemo.reverse2(head);
    }


//    已知 sqrt (2)约等于 1.414，要求不用数学库，求 sqrt (2)精确到小数点后 10 位。
     public static double sqrt(){
        double EPSILON = 0.0000000001;
        double low = 1.4,high = 1.5;
        double mid = (low+high)/2;

        while(high - low > EPSILON){
            if(mid * mid > 2){
                high = mid;
            }else{
                low = mid;
            }
            mid = (high + low) / 2;
        }
        return mid;
     }

    public static void main(String[] args) {
        System.out.println( sqrt());
    }



}
class ListNode<T>{
    T val;
    public ListNode(T val){
        this.val = val;
    }

    ListNode<T> next;
}
