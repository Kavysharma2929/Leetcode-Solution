class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr=new  ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                arr.add(temp.val);
                temp=temp.next;
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            curr.next=new ListNode(arr.get(i));
            curr=curr.next;
        }
        return dummy.next;
    }
}