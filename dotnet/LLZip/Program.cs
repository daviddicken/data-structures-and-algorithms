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

            LLZip(odds, evens);
        }

        public static Node<int> LLZip(LinkedList<int> listA, LinkedList<int> listB)
        { 
            if (listA.Head == null) return listB.Head;
            if (listB.Head == null) return listA.Head;
            if(listA.Head.Next == null) 
            {
                listA.Head.Next = listB.Head.Next;
                listB.Head.Next = listA.Head;
                return listB.Head;
            }
            LinkedList<int> newList = new LinkedList<int>{ Head = listA.Head};
            Node<int> nodeA = listA.Head.Next, nodeB = listB.Head, nodeC = newList.Head;

            while(nodeA != null && nodeB != null)
            {
                if(nodeA == null && nodeB != null)
                {
                    nodeC.Next = nodeB;
                    break;
                }
                if (nodeB == null && nodeA != null)
                {
                    nodeC.Next = nodeA;
                    break;
                }

                nodeC.Next = nodeB;
                nodeB = nodeB.Next;
                nodeC = nodeC.Next;

                nodeC.Next = nodeA;
                nodeA = nodeA.Next;
                nodeC = nodeC.Next;

            }

            return newList.Head;

        }
    }
}
