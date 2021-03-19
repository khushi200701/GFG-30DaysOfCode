class Solution
{
    static int index=0;
    
    static boolean checktree(int preorder[], int inorder[], int postorder[], int len)
    {
        if(preorder.length !=len ||inorder.length!=len||postorder.length!=len)
         return false;
        TreeNode root=buildTree(preorder,inorder,0,preorder.length-1);
        index=0;
        List<Integer> l=new ArrayList<>();
        postOrder(root,l);
        //System.out.println(l);
        int myPost[]=new int[len];
        for(int i=0;i<len;i++)
          myPost[i]=l.get(i);
        for(int i=0;i<len;i++)
          if(myPost[i]!=postorder[i])
           return false;
          
        return true;
        
       
        
    }
    static void postOrder(TreeNode root,List<Integer> l){
        if(root==null)return;
        
        postOrder(root.left,l);
        postOrder(root.right,l);
        l.add(root.data);
        
    }
    static TreeNode buildTree(int[] pre,int in[],int l,int r){
        if(l>r||index>=pre.length)
        return null;
        
        int idx=0;
        TreeNode root=new TreeNode(pre[index++]);
        for(int i=0;i<in.length;i++)
          {
              if(in[i]==root.data)
              {
                  idx=i;
                  break;
              }
          }
        root.left=buildTree(pre,in,l,idx-1);
        root.right=buildTree(pre,in,idx+1,r);
        return root;
    }
}
class TreeNode
{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}
