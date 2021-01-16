using System;
using Xunit;
using DataStructures;

namespace DataStructuresTest
{
    public class LinkedListTest
    {
        [Fact]
        public void LinkedListHasHeadTest()
        {
            int val = 2;
            LinkedList<int> testList = new LinkedList<int>(val);

            Assert.Equal(val, testList.Head.Value);
        }

        [Fact]
        public void InsertTest()
        {
            LinkedList<int> test = new LinkedList<int>(5);

            test.Insert(10);
            Assert.Equal(10, test.Head.Value);

            Assert.Equal(5, test.Head.Next.Value);
            Console.WriteLine(test.toString());
        }

        [Fact]
        public void IncludesTest()
        {
            LinkedList<int> test = new LinkedList<int>();
            test.Insert(1);
            test.Insert(2);
            test.Insert(3);
            test.Insert(4);
            test.Insert(5);

            Assert.False(test.includes(10));
            Assert.True(test.includes(1));
        }
    }
}
