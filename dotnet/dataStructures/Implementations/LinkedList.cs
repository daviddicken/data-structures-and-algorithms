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
        //================= Methods ======================

        /// <summary>
        /// Kth from the end method one takes in an integer and returns the value at the node that is that many spots from the end of the list. The end of the list begins counting at 0.
        /// Algorithm: declare a counter and iterate through the list until null is reached. 
        /// Incrementing the counter for each node passed through.
        /// Check that number passed in is not greater then counter
        /// Get the difference between counter and k
        /// Iterate through the list again the difference times
        /// return the value found at that node 
        /// Usage: list.kthFromEnd(int)
        /// </summary>
        /// <param name="k"></param>
        /// <returns></returns>
        /// //Method One
        public T KthFromEnd(int k)
        { 
            if (Head == null) throw new Exception("The list is empty");
            if (k < 0) throw new Exception("Number passed in needs to be greater then -1");
            
            Node<T> currentNode = Head;
            int counter = -1;
            while(currentNode != null)
            {
                counter++;
                currentNode = currentNode.Next;
            }
            if (counter < k) throw new Exception("Your search number is longer then the list");
            currentNode = Head;
            int numToGo = counter - k;

            for (int i = 0; i < numToGo; i++)
            {
                currentNode = currentNode.Next;
            }
            return currentNode.Value;          
        }

        /// <summary>
        /// This kth from the end uses two nodes to step through the list. The first node starts iterating through the list and a counter is also incremented each iteration. When the counter is greater then the number passed in the second node starts iterating through the list. When the first node reaches null then the method will return the value that is found at the second node.
        /// </summary>
        /// <param name="k"></param>
        /// <returns></returns>
        public T KthFromEnd2(int k)
        {
            if (Head == null) throw new Exception("The list is empty");
            if (k < 0) throw new Exception("Number passed in needs to be greater then -1");

            Node<T> lead = Head;
            Node<T> follow = Head;
            int counter = 0;

            while(lead != null)
            {
                if (counter > k) follow = follow.Next;
                counter++;
                lead = lead.Next;
            }

            if (k > counter) throw new Exception("Number passed in is greater then length of the list.");
            return follow.Value;
        }

        /// <summary>
        ///  InsertAfter takes in a value to add and a value to search for. It will create a new node with the first value and search through the list for the second value. If it finds the second value it places the new node in the list after the searched value.
        ///  Usage: list.InsertAfter(newValue, valueToSearch);
        /// </summary>
        /// <param name="value"></param>
        /// <param name="target"></param>
        public void InsertAfter(T value, T target)
        {
            Node<T> newNode = new Node<T>(value);
            Node<T> currentNode = Head;
            bool found = false;

            while (currentNode != null)
            {
                if (currentNode.Value.Equals(target))
                {
                    newNode.Next = currentNode.Next;
                    currentNode.Next = newNode;
                    found = true;
                    Console.WriteLine($"{target} was found and {value} was added after it.");
                    break;
                }
                currentNode = currentNode.Next;
            }
            if (!found) Console.WriteLine($"{target} was not found and {value} was not added to the list.");
        }

        /// <summary>
        /// Insert before takes in a value and a value to search for. It creates a new node to hold the first value and searches the list for the second value. If the second value is found it will place the new node in the list in front of the node it was searching for. If the second value is not found a message will be displayed to the user and the node will not be added.
        /// Usage: list.InsertBefore(newValue, valueToSearch)
        /// </summary>
        /// <param name="value"></param>
        /// <param name="target"></param>
        public void InsertBefore(T value, T target)
        {
            Node<T> newNode = new Node<T>(value);
            Node<T> currentNode = Head;
         
            if(Head == null)
            {
                Console.WriteLine("List was empty, Try using a regular insert");
            }
            else 
            {
                bool found = false;
                if (Head.Next == null && Head.Value.Equals(target))
                {
                    newNode.Next = Head;
                    Head = newNode;
                    found = true;
                    Console.WriteLine($"{target} was found and the new value was added in front of it.");
                }
                while (currentNode.Next != null)
                {
                    if(target.Equals(currentNode.Next.Value))
                    {
                        newNode.Next = currentNode.Next;
                        currentNode.Next = newNode;
                        found = true;
                        Console.WriteLine($"{target} was found and the new value was added in front of it.");
                        break;
                    }
                    currentNode = currentNode.Next;
                }
                if (!found) Console.WriteLine($"Did not find {target}, new value was not added to the list.");
            }
        }

        /// <summary>
        /// Append takes in a value and creates a new node. Then it steps through the linked list until the next node is null. Once it find that next node is null it points the next node to the newly created node.
        /// Usage: list.Append(value)
        /// </summary>
        /// <param name="value"></param>
        public void Append(T value)
        {
            Node<T> newNode = new Node<T>(value);
            if (Head == null)
            {
                Head = newNode;
            }
            else
            {
                Node<T> curentNode = Head;
                while (curentNode.Next != null) curentNode = curentNode.Next;
                curentNode.Next = newNode;
            }
        }

        /// <summary>
        /// This method takes in the head of a linked list and reverses the order of the nodes.
        /// Usage: list.ReverseList()
        /// </summary>
        /// <param name="head"></param>
        /// Algorithm: grab the head node and head.next and hold them in vars
        /// point the head.next to null and 
        public void ReverseList()
        {
            if (Head == null)
            {
                Console.WriteLine("List is empty");
            }
            else if (Head.Next == null)
            {
                Console.WriteLine("There is only 1 node in this list");
            }
            else
            {
                Node<T> n1 = null;
                Node<T> n2 = Head;
                Node<T> n3 = Head.Next;

                while(n3.Next != null)
                {
                    n2.Next = n1;
                    n1 = n2;
                    n2 = n3;
                    n3 = n2.Next;
                }
                n2.Next = n1;
                n3.Next = n2;
                Head = n3;
            }
        }

        /// <summary>
        /// Checks to see if a value is found in the linked list returning true/false
        /// Usage: list.In
        /// </summary>
        /// <param name="val"></param>
        /// <returns></returns>
        public bool Includes(T val)
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
            Node<T> node = new Node<T>(value){ Next = Head};
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
