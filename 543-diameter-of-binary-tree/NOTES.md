aproach 1;
class DiaPair{
int ht;
int dia;
}
public int diameterOfBinaryTree(TreeNode node) {
DiaPair res = new DiaPair();
res = diameter2(node);
return res.dia;
}
public  DiaPair diameter2(TreeNode node){
if (node == null){
DiaPair base = new DiaPair();
base.ht = -1;
base.dia = 0;
return base;
}
​
DiaPair lp = diameter2(node.left);
DiaPair rp = diameter2(node.right);
​
DiaPair mp = new DiaPair();
mp.ht = Math.max(lp.ht,rp.ht)+1;
​
int factEitherSide = lp.ht + rp.ht + 2;
mp.dia = Math.max(factEitherSide,Math.max(lp.dia, rp.dia));
​
return mp;
}