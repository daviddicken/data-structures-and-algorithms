using System;
using System.Collections.Generic;
using System.Text;

namespace Trees
{
    public class BST
    {
        public Node<int> Root { get; set; }
        public int MyProperty { get; set; }
        // Constructors
        public BST() { Root = null; }
        public BST(int value)
        {
            Root = new Node<int>(value);        
        }
        // Methods
        /// <summary>
        /// Add node takes in a int and calls itself recursively passing in the root and the value. The recursive methods base case is when it finds an empty node. If the node it has is not empty then it will compare the nodes value to the value passed in and point the nodes left or right child to a recursive call passing in the left or right child accordingly. Once a empty node is found a new node is created with the value and it is returned to the last recursive call which will now point one of its children to the new node. The stack will continue to pop off until the root is returned to the original call with the new node as one of its leaves.
        /// </summary>
        /// <param name="value">int</param>
        public void Add(int value)
        {
            Root = Add(Root, value);
        }
        private Node<int> Add(Node<int> node, int value)
        {
            if (node == null) return new Node<int>(value);
            if(node.Value > value)
            {
                node.LeftChild = Add(node.LeftChild, value);
            }
            else
            {
                node.RightChild = Add(node.RightChild, value);
            }
            return node;
        }   

        /// <summary>
        /// The contains method takes in a int and recursively calls itself passing in the root node and the int passsed in. It will compare the value passed in to the node value and if they are a match it will return true. If the node value is greater then the value passed in it will recursively call itself passing in the left child and value. If the node value is less then the value passed in a recursive call passing in the right child will be made.
        /// </summary>
        /// <param name="value">int</param>
        /// <returns></returns>
      public bool Contains(int value)
        {
            Node<int> node = Root;

            while(node != null)
            {
                if (node.Value == value) return true;
                if (value > node.Value) node = node.RightChild;
                if (value < node.Value) node = node.LeftChild;
            }
            return false;
        }

    }
}

//==================== ZombieLand ===============
//public bool Contains(int value)
//{
//    return Contains(Root, value);
//}
//public bool Contains(Node<int> node, int value)
//{
//    bool flag = false;
//    if (node == null) return false;
//    if (node.Value == value) return true;
//    if (node.Value > value)
//    {
//        flag = Contains(node.RightChild, value);
//    }
//    else
//    {
//        flag = Contains(node.LeftChild, value);
//    }
//    return flag;
//}

//bool found = false;
//if (node != null)
//    if (node.Value == value)
//        found = true;

//if (!found && node != null)
//    if (node.Value > value)
//    {
//        Contains(node.RightChild, value);
//    }
//    else
//    {
//        Contains(node.LeftChild, value);
//    }
//return found;
//        }

//bool found = false;
//if (node != null)
//    if (node.Value == value)
//        found = true;

//if (!found && node != null)
//    if (node.Value > value)
//    {
//        Contains(node.RightChild, value);
//    }
//    else
//    {
//        Contains(node.LeftChild, value);
//    }
//return found;
//        }