
class Solution {
    public int pairSum(ListNode head) {
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> a=new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        int length=a.size();
        for(int i=0;i<=length/2-1;i++){
            int sum=(int)a.get(i)+(int)a.get(length-i-1);
            if(sum>max)
                max=sum;
        }
        return max;
    }
}
