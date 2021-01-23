using System;
using System.Collections.Generic;
using System.Text;

namespace DataStructures
{
    public class Stack<T>
    {
        public Node<T> Top { get; set; } 

        //Constructor
        public Stack()
        {
            Top = null;
        }

        /// <summary>
        /// Pushes a new node with value that was passed in to the top of the stack
        /// </summary>
        /// <param name="value">Generic Value</param>
       public void Push(T value)
        {
            Node<T> node = new Node<T>(value);
            node.Next = Top;
            Top = node;
        }

        /// <summary>
        /// Peek returns the value at the top of the stack leaving the stack intact
        /// </summary>
        /// <returns>What ever value type is held in the top node</returns>
        public T Peek()
        {
            if (Top == null) throw new NullReferenceException("The Stack is empty.");
            return Top.Value;
        }
        /// <summary>
        /// Pop returns the value found in the top node and removes that node from the stack
        /// </summary>
        /// <returns>The value found in the top node</returns>
        public T Pop()
        {
            if (Top == null) throw new NullReferenceException("The Stack is empty.");
            T returnVal = Top.Value;
            Top = Top.Next;
            return returnVal;
        }

        /// <summary>
        /// IsEmpty checks if the top node on the stack is null. If it is it returns true otherwise it returns false
        /// </summary>
        /// <returns>boolean</returns>
        public bool IsEmpty() => Top == null;
        
    }
}
