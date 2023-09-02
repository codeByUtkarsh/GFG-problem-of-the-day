class Solution{
    ArrayList<Integer> al;
    public int getCount(Node node, int bud)
    {
        //code here 
        int count =0;
        al = new ArrayList<>();
        visLeaf(node,0);
        Collections.sort(al);
        for(int i=0;i<al.size();i++){
            if(bud-al.get(i)>=0){
                count++;
                bud-=al.get(i);
            }else{
                return count;
            }
        }
        return count;
        
    }
    void visLeaf(Node node,int level){
        if(node==null){
            return;
        }
        level++;
        
        if(node.left==null && node.right==null){
            al.add(level);
            return;
        }
        
        visLeaf(node.left,level);
        visLeaf(node.right,level);
        
    }
}