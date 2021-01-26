using System;
using System.Collections.Generic;
using System.Text;


namespace DataStructures
{
    public class PsuedoQueue<T>
    {
        public Stack<T> StackA { get; set; }

        public PsuedoQueue() 
        {
            StackA = new Stack<T>();
        }

        public Node<T> EnQueue(T value)
        {
            if (StackA.IsEmpty())
            {
                StackA.Push(value);
                return StackA.Top;
            }
            Stack<T> temp = new Stack<T>();

            while (!StackA.IsEmpty())
                temp.Push(StackA.Pop());

            StackA.Push(value);

            while (!temp.IsEmpty())
                StackA.Push(temp.Pop());

            return StackA.Top;
        }

        public T DeQueue()
        {
            if (StackA.IsEmpty()) throw new NullReferenceException("The Queue is empty.");
            return StackA.Pop();
        }
       
    }
}
