using System;
using System.Collections.Generic;
using System.Text;

namespace DataStructures
{
    public class LinkedList<T>
    {
        public Node<T> Head { get; set; }

        /// <summary>
        ///Empty LinkedList
        ///Head is null
        ///Usage: LinkedList myList = new LinkedList()</T>
        /// </summary>
        public LinkedList() { }

        /// <summary>
        /// LinkedList constructor with head node
        /// Usage: LinkedList list = new LinkedList(value)
        /// </summary>
        /// <param name="value"></param>
        public LinkedList(T value)
        {
            Node<T> node = new Node<T>(value);
            Head = node;
        }

        public bool includes(T val)
        {
            Node<T> cn = Head;
            while (cn != null)
            {
                if (cn.Value.Equals(val)) return true;
                cn = cn.Next;
            }
            return false;
        }

        /// <summary>
        /// Inserts new node to head of list and points the new head next to the old head node.
        /// Usage: list.Insert(value)
        /// </summary>
        /// <param name="value"></param>
        public void Insert(T value)
        {
            Node<T> node = new Node<T>(value);
            node.Next = Head;
            Head = node;
        }

        /// <summary>
        /// Prints human readable linked list values to console
        /// Usage: list.Print()
        /// </summary>
        public void Print()
        {
            Node<T> cn = Head;

            while( cn != null)
            {
                Console.Write($"{cn.Value} -> ");
                cn = cn.Next;
            }
            Console.WriteLine("NULL");
        }

        /// <summary>
        /// Recursive example of print method. Plan to come back and convert to a toString
        /// Usage: list.PrintR()
        /// </summary>
        /// <param name="node"></param>
        public static String str = "";
        public String toString()
        {
            str = "";
            return toString(Head);
        }
        public String toString(Node<T> node)
        {
            if (node == null)
            {
              return str += "NULL";
            }

            str += node.Value + " -> ";
            return toString(node.Next);
        }
    }

    //============= ZombieLand ===============
   /* public void PrintR(Node<T> node)
    {
        if (node == null)
        {
            Console.WriteLine("NULL");
        }

        Console.WriteLine($"{node.Value} -> ");
        PrintR(node.Next);
    }
   */
}
