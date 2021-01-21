using System;
using DataStructures;
using LinkedList;

namespace AddTwoNumbers

{/// <summary>
/// Algorithm 
/// </summary>
 
    class Program
    {
        static void Main(string[] args)
        {
            LinkedList<int> list = new LinkedList<int>(5);
            list.Insert(4);
            list.Insert(3);
            //Console.WriteLine(getNumStr(list.Head));
            int num1 = Int32.Parse(getNumStr(list.Head));
            num1 += 100;
            Console.WriteLine($"Total: {num1}");

            LinkedList<int> testList = new LinkedList<int>();

            while(num1 > 0)
            {
                testList.Insert(num1 % 10);
                num1 /= 10;
            }
            Console.WriteLine(testList.toString());
            testList.ReverseList();
            Console.WriteLine(testList.toString());
        }

        public static String str = "";
        public static String getNumStr(Node<int> head)
        {
            if (head == null) return str;
            getNumStr(head.Next);
            return str += head.Value.ToString();

        }
    }
}
