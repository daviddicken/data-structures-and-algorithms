using System;

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
        /// Add method takes in a generic value. It then check if the root 
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

        public bool Contains(T value)
        {
            return true;
        }
    }
}
