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
        }

        /// <summary>
        /// Takes in a value and creates a new node with value. Then makes the new node the head of the list and the old head becomes the new heads next. 
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


    }
}
