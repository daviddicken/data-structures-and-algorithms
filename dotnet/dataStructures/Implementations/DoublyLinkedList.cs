using System;
using System.Collections.Generic;
using System.Text;

namespace DataStructures
{
    class DoublyLinkedList<T>
    {
        public Node<T> Head { get; set; }
        public Node<T> Tail { get; set; }

        /// <summary>
        ///Empty DoublyLinkedList
        ///Head is null
        ///Tail is null
        ///Usage: DoublyLinkedList myList = new LinkedList()</T>
        /// </summary>
        public DoublyLinkedList() { }

        /// <summary>
        /// DoublyLinkedList constructor with head node
        /// Usage: DoublyLinkedList list = new LinkedList(value)
        /// </summary>
        /// <param name="value"></param>
        public DoublyLinkedList(T value)
        {
            Node<T> node = new Node<T>(value);
            Head = node;
            Tail = null;
        }

        /// <summary>
        /// Takes in a value and creates a new node with value. Then makes the new node the head of the list and the old head becomes the new heads next. 
        /// Usage: list.Insert(value)
        /// </summary>
        /// <param name="value"></param>
        public void Insert(T value)
        {
            Node<T> node = new Node<T>(value);

            if(Head == null)
            {
                Head = node;
                Tail = node;
            }
            else
            {
                Node<T> tempNode = Head;
                Head = node;
                node.Next = tempNode;
                tempNode.Last = node;
            }

        }

        /// <summary>
        /// Inserts a new node with value passed in to the rear of the list.
        /// Usage: list.InsertTail(value)
        /// </summary>
        /// <param name="value"></param>
        public void InsertTail(T value)
        {
            Node<T> newNode = new Node<T>(value);
            if(Head == null)
            {
                Head = newNode;
            }
            else if(Tail == null)
            {
                Head.Next = newNode;
                newNode.Last = Head;
                Tail = newNode;
            }
            else
            {
                newNode.Last = Tail;
                Tail.Next = newNode;
                Tail = newNode;
            }
        }

        /// <summary>
        /// toString method will return a human readable string representing the values in the list
        /// usage: list.ToString
        /// </summary>
        /// <returns></returns>
        public string toString()
        {
            if (Head == null) return "NULL";

            Node<T> node = Head;
            String str = $"{node.Value} -> ";
            node = node.Next;

            while(node != null)
            {
                str += $"{node.Value} -> ";
                node = node.Next;
            }

            str += "NULL";
            return str;
        }


    }
}
