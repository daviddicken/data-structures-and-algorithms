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

                while (nodes.Count != 0)
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