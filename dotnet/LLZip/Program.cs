using System;
using DataStructures;

namespace LLZip.CodeChallenges
{
    public class Program
    {
        static void Main(string[] args)
        {
            LinkedList<int> evens = new LinkedList<int>();
            evens.Append(2);
            //evens.Append(4);
            //evens.Append(6);
            //evens.Append(8);

            Console.WriteLine(evens.toString());
            LinkedList<int> odds = new LinkedList<int>();
            odds.Append(1);
            odds.Append(3);
            //odds.Append(5);
            //odds.Append(7);

            Console.WriteLine(odds.toString());
            LLZip(odds, evens);
        }

        public static Node<int> LLZip(LinkedList<int> listA, LinkedList<int> listB)
        {
            // listA 2 -> listB 1 -> 3
            // TODO: Check that listA.Head has a next 
            if (listA.Head == null) return listB.Head;
            if (listB.Head == null) return listA.Head;
            Console.WriteLine(listB.toString());
            if(listA.Head.Next == null) 
            {
                listA.Head.Next = listB.Head.Next;
                listB.Head.Next = listA.Head;
                Console.WriteLine("A.next " + listB.toString());
                return listB.Head;
            }
            LinkedList<int> newList = new LinkedList<int>{ Head = listA.Head};
            Node<int> nodeA = listA.Head.Next, nodeB = listB.Head, nodeC = newList.Head;

            while(nodeA != null && nodeB != null)
            {
                if(nodeA == null && nodeB != null)
                {
                    nodeC.Next = nodeB;
                    Console.WriteLine("First if " + newList.toString());

                    break;
                }
                if (nodeB == null && nodeA != null)
                {
                    nodeC.Next = nodeA;
                    Console.WriteLine("second if " + newList.toString());

                    break;
                }

                nodeC.Next = nodeB;
                nodeB = nodeB.Next;
                nodeC = nodeC.Next;

                nodeC.Next = nodeA;
                nodeA = nodeA.Next;
                nodeC = nodeC.Next;
                Console.WriteLine(newList.toString());

            }
            Console.WriteLine("Final " + newList.toString());

            return newList.Head;

        }
    }
}
