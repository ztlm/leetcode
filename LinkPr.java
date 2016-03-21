package cn.sun.leetcode;


public class LinkPr {
	public class ListNode {
		int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	
	
	 public ListNode oddEvenList(ListNode head) {
		 if( head==null || head.next==null )
		        return head;
		 
		 ListNode firstEven = head.next;
		    ListNode lastOdd = head;
		    ListNode cur = head;
		    int n=1;
		    
		    while(true){

		        if(n%2==1)
		            lastOdd = cur;

		        if(cur.next == null){
		            lastOdd.next = firstEven;
		            break;
		        }

		        ListNode nextNode = cur.next;
		        cur.next = cur.next.next;
		        cur = nextNode;
		        System.out.println(lastOdd.next.val);
		        	        
		        n++;
		    }
		    return head;	    
	    }
	 
	 public ListNode ReverseList(ListNode head) {
			if(head==null || head.next==null) return head;
	        ListNode pre=head;
	        ListNode temp=pre.next;
	        head.next=null;
	        while(temp!=null){
	            ListNode current=temp.next;
	            temp.next=pre;
	            pre=temp;
	            temp=current;
	        }
			return pre;
	    }
	  
	
	 
	 
	 public static void main(String[] args) {
		 LinkPr list=new LinkPr();
		 LinkPr.ListNode node=list.new ListNode(1);
		 LinkPr.ListNode node1=list.new ListNode(2);
		 LinkPr.ListNode node2=list.new ListNode(3);
		 LinkPr.ListNode node3=list.new ListNode(4);
		 node.next=node1;
		 node.next.next=node2;
		 node.next.next.next=node3;
		 list.oddEvenList(node);	
		
	}
	
}
