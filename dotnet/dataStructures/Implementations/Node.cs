using System;
using System.Collections.Generic;
using System.Text;

namespace DataStructures
{
    public class Node<T>
    {
        public T Value { get; set; }
        public Node<T> Next { get; set; }
        public Node<T> Last { get; set; }

        // Constructor
        /// <summary>
        /// Constuctor for a Node
        /// Usage: Node<T> node = new Node()
        /// </summary>
        /// <param name="value"></param>
        public Node(T value)
        {
            Value = value;
            Next = null;
            Last = null;
        }


    }
}
