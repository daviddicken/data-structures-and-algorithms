using System;
using System.Collections;
using System.Collections.Generic;

namespace k_ary_tree
{
    public class KTree<T>
    {
        public Node<T> Root { get; set; }
        public int KidsAllowed { get; set; } // Children allowed per node


        public KTree(int kidsAllowed) 
        { KidsAllowed = kidsAllowed; }
        
        public KTree(int kidsAllowed, T value) 
        {
            KidsAllowed = kidsAllowed;
            Root = new Node<T>(value);
        }

        // Methods
        /// <summary>
        /// Add method takes in a generic value. It then check if the root is null if it is the roots value gets set to the value passed in. If not it will check if the root can still have children if it can a new node is created aadded
        /// </summary>
        /// <param name="value"></param>
        public void Add(T value)
        {
            bool notPlaced = true;
            if (Root == null)
            {
                Root = new Node<T>(value);
                notPlaced = false;
            }
            var rand = new Random();
            Node<T> curentNode = Root;

            while(notPlaced)
                if(curentNode.Kids.Count < KidsAllowed)
                {
                    Node<T> newNode = new Node<T>(value);
                    curentNode.Kids.Add(newNode);
                    notPlaced = false;
                }
                else
                {
                    int index = rand.Next(curentNode.Kids.Count);
                    curentNode = curentNode.Kids[index];
                }
        }

        /*Algo: get current node value
         * if current node kids.count > 0 
         * put kids in q
         * pop kids list off of q 
         * for each node in list
         * get value
         * check if kids count > 0
         * if so put kids in q
         */
        /// <summary>
        /// Contains takes in a generic value a searches each node in the k-ary-tree if a match is found ture is returned if not false will be returned.
        /// </summary>
        /// <param name="value">Generic value</param>
        /// <returns>Boolean</returns>
        public bool Contains(T value)
        {
            if (Root == null) return false;
            if (Root.Value.Equals(value)) return true;
            if(Root.Kids.Count > 0)
            {
                Node<T> currentNode = Root;
                Queue dayCare = new Queue();
                dayCare.Enqueue(currentNode.Kids);
                while(dayCare.Count != 0)
                {
                    List<Node<T>> children = (List<Node<T>>)dayCare.Dequeue();
                    foreach(Node<T> node in children)
                    {
                        if (node.Value.Equals(value)) return true;
                        if (node.Kids.Count > 0)
                            dayCare.Enqueue(node.Kids);
                    }
                }
            }          
            return false;
        }

        public KTree<string> FizzBuzz()
        {

        }
    }
}
