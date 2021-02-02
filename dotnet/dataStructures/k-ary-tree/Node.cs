using System;
using System.Collections.Generic;
using System.Text;

namespace k_ary_tree
{
    public class Node<T>
    {
        public T Value { get; set; }
        public List<Node<T>> Kids { get; set; }

        public Node() 
        { Kids = new List<Node<T>>(); }
        
        public Node(T value) 
        { 
            Value = value;
            Kids = new List<Node<T>>();
        }
    }
}
