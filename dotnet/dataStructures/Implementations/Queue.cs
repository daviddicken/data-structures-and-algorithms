using System;
using System.Collections.Generic;
using System.Text;

namespace DataStructures
{
    public class Queue<T>
    {
        public Node<T> Front { get; set; }
        public Node<T> Rear { get; set; }

        public Queue()
        {
            Front = null;
            Rear = null;
        }

        /// <summary>
        /// EnQueue takes in a generic value and creates a new node to hold that value. It then places it at the end of the Queuepointing the new nodes next to the rear and then reasigning the newnode to be the rear 
        /// </summary>
        /// <param name="val">takes in a generic value</param>
        public void EnQueue(T val)
        {
            Node<T> node = new Node<T>(val);

            if(Front == null)
            {
                Front = node;
                Rear = node; 
            }
            else
            {
                node.Next = Rear;
                Rear = node;
            }
        }

        /// <summary>
        /// DeQueue removes the node from the front of the Q and returns the value that was found in that node
        /// </summary>
        /// <returns>A generic value</returns>
        public T DeQueue()
        {
            if (Front == null) throw new NullReferenceException("The Queue is empty.");

            T returnVal = Front.Value;

            // if only one node was in the list
            if(Front == Rear)
            {
                Front = null;
                Rear = null;
                return returnVal;
            }
    
            Node<T> currentNode = Rear.Next;
            Node<T> lastNode = Rear;

            while(currentNode.Next != null)
            {
                lastNode = currentNode;
                currentNode = currentNode.Next;
            }

            // If only two nodes were present in the list 
            if (lastNode == Rear) 
            {
                Front = lastNode;
                Rear = lastNode;
                Front.Next = null;
                return returnVal;
            }

            lastNode.Next = null;
            Front = lastNode;
            return returnVal;
        }

        /// <summary>
        /// Peek returns the value found in the front of the Q without modifying the Q
        /// </summary>
        /// <returns>generic value</returns>
        public T Peek()
        {
            if (Front == null) throw new NullReferenceException("The Queue is empty.");
            return Front.Value;
        }

        /// <summary>
        /// IsEmpty checks if the front node is null and returns a bool
        /// </summary>
        /// <returns>Boolean</returns>
        public bool IsEmpty() => Front == null;

    }
}
