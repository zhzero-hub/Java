class FibonacciNode {
    int key;        //结点
    int degree;     //度       
    FibonacciNode left;      //左兄弟       
    FibonacciNode right;     //右兄弟       
    FibonacciNode parent;    //父结点       
    FibonacciNode child;     //第一个孩子结点       
    boolean marked; //是否被删除第1个孩子  
    
    public FibonacciNode() {
        key = degree = 0;
        left = right = parent = child = null;
        marked = false;
    }

    public FibonacciNode(int _key) {
        key = _key;
        degree = 0;
        left = right = parent = child = null;
        marked = false;
    }

};



public class FibonacciHeap {

    public static void main(String []args) {
        
    }
}