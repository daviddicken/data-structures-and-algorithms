using System;
using System.Collections;
using System.Collections.Generic;

//using DataStructures;



namespace Trees
{
    public class Tree<T>
    {
        public Node<T> Root { get; set; }
        public int size { get; set; }

        // Constructor
        public Tree() { Root = null; }
        public Tree(T value)
        {
            Root = new Node<T>(value);
            size = 1;
        }

        // Methods
        public T[] InOrder()
        {
            List<T> list = new List<T>();
            InOrder(Root, list);
            return list.ToArray();
        }
        private List<T> InOrder(Node<T> node, List<T> list)
        {
            if (node == null) return list;

            InOrder(node.LeftChild, list);
            list.Add(node.Value);
            InOrder(node.RightChild, list);

            return list;
        }

        public T[] PreOrder()
        {
            List<T> list = new List<T>();
            PreOrder(Root, list);
            return list.ToArray();
        }
        private List<T> PreOrder(Node<T> node, List<T> list)
        {
            if (node == null) return list;

            list.Add(node.Value);
            InOrder(node.LeftChild, list);
            InOrder(node.RightChild, list);

            return list;
        }

        public T[] PostOrder()
        {
            List<T> list = new List<T>();
            PostOrder(Root, list);
            return list.ToArray();
        }
        private List<T> PostOrder(Node<T> node, List<T> list)
        {
            if (node == null) return list;

            PostOrder(node.LeftChild, list);
            PostOrder(node.RightChild, list);
            list.Add(node.Value);

            return list;
        }


        //---------- Add node --------------
        /// <summary>
        /// Add node takes in a generic value creates a new tree node and finds the next open spot on the tree to place it.
        /// </summary>
        /// <param name="value">generic value</param>
        public void addNode(T value)
        {
            Node<T> newNode = new Node<T>(value);
            if(Root == null)
            {
                Root = newNode;
                size = 1;
            }
            else
            {
                Node<T> currnetNode = Root;
                Queue<Node<T>> nodes = new Queue<Node<T>>();
                nodes.Enqueue(currnetNode);

                while (nodes.Peek() != null)
                {
                    currnetNode = nodes.Dequeue();

                    if(currnetNode.LeftChild == null)
                    {
                        currnetNode.LeftChild = newNode;
                        size++;
                        break;
                    }
                    else
                    {
                        nodes.Enqueue(currnetNode.LeftChild);
                    }
                    if(currnetNode.RightChild == null)
                    {
                        currnetNode.RightChild = newNode;
                        size++;
                        break;
                    }
                    else
                    {
                        nodes.Enqueue(currnetNode.RightChild);
                    }
                }
            }
        }
    }
}
//======================= ZombieLand ==================
//if (node == null)
//{
//    T[] arr = new T[size];
//    int counter = 0;
//    foreach (T t in list)
//    {
//        arr[counter] = t;
//        counter++;
//    }
//    return arr;

////public ArrayList InOrder()
////{
////    ArrayList list = new ArrayList();
////    return InOrder(Root, list);
////}
////private ArrayList InOrder(Node<T> node, ArrayList list)
////{
////    if (node == null) return list;

////    InOrder(node.LeftChild, list);
////    list.Add(node.Value);
////    InOrder(node.RightChild, list);

////    return list;
////}
//---------------------
//public T[] InOrder()
//{
//    T[] arr = new T[size];
//    int index = 0;

//    return InOrder(Root, arr, index);
//}
//private T[] InOrder(Node<T> node, T[] arr, int index)
//{
//    if (node == null) return arr;

//    InOrder(node.LeftChild, arr, index);
//    arr[index] = node.Value;
//    index++;
//    InOrder(node.RightChild, arr, index);

//    return arr;
//}

//public T[] PreOrder()
//{
//    T[] arr = new T[size];
//    int index = 0;

//    return PreOrder(Root, arr, index);
//}
//private T[] PreOrder(Node<T> node, T[] arr, int index)
//{
//    if (node == null) return arr;

//    arr[index] = node.Value;
//    index++;
//    PreOrder(node.LeftChild, arr, index);
//    PreOrder(node.RightChild, arr, index);

//    return arr;
//}

//public T[] PostOrder()
//{
//    T[] arr = new T[size];
//    int index = 0;

//    return PostOrder(Root, arr, index);
//}
//private T[] PostOrder(Node<T> node, T[] arr, int index)
//{
//    if (node == null) return arr;

//    PostOrder(node.LeftChild, arr, index);
//    PostOrder(node.RightChild, arr, index);
//    arr[index] = node.Value;
//    index++;

//    return arr;
//}