using System;
using Xunit;
using DataStructures;

namespace DataStructuresTest
{
    public class LinkedListTest
    {
        [Fact]
        // Test that a list can be created with a value at Head
        public void LinkedListHasHeadTest()
        {
            int val = 2;
            LinkedList<int> testList = new LinkedList<int>(val);
            Assert.Equal(val, testList.Head.Value);
        }

        [Fact]
        // Test that a new node can be created and inserted at the Head of the list
        public void InsertTest()
        {
            LinkedList<int> test = new LinkedList<int>(5);

            test.Insert(10);
            Assert.Equal(10, test.Head.Value);

            Assert.Equal(5, test.Head.Next.Value);
            Console.WriteLine(test.toString());
        }

        [Fact]
        // Test to see if we can check if a list contains a value
        // and if a list doesn't contain a value
        public void IncludesTest()
        {
            LinkedList<int> test = new LinkedList<int>();
            test.Insert(1);
            test.Insert(2);
            test.Insert(3);
            test.Insert(4);
            test.Insert(5);

            Assert.False(test.Includes(10));
            Assert.True(test.Includes(1));
        }

        [Fact]
        // Test that toString creates a string that represents the list
        public void ToStringTest()
        {
            LinkedList<int> list = new LinkedList<int>();
            list.Insert(1);
            list.Insert(2);
            list.Insert(3);
            list.Insert(4);
            list.Insert(5);

            String expected = "5 -> 4 -> 3 -> 2 -> 1 -> NULL";
            Assert.Equal(expected, list.toString());    
        }

        [Fact]
        // Test that we can append a new node to the end of the list
        public void AppendTest()
        {
            LinkedList<int> list = new LinkedList<int>();
            list.Append(1);
            list.Append(2);

            String expected = "1 -> 2 -> NULL";
            Assert.Equal(expected, list.toString());

            list.Append(3);
            list.Append(4);

            expected = "1 -> 2 -> 3 -> 4 -> NULL";
            Assert.Equal(expected, list.toString());
        }

        [Fact]
        // Test that a value can be added before a search value
        // Test if search value is located at the head node
        // Test that node is not inserted if search value is not found
        public void InsertBeforeTest()
        {
            //instantiate a list with value 2 in head node
            LinkedList<int> list = new LinkedList<int>(2); 
            string expected = "2 -> NULL";
            Assert.Equal(expected, list.toString());

            // insert node with value of 1 to front of list if search value is found in head.
            list.InsertBefore(1, 2);
            expected = "1 -> 2 -> NULL";
            Assert.Equal(expected, list.toString());

            list.Append(3);
            list.Append(4);
            list.Append(5);
            expected = "1 -> 2 -> 3 -> 4 -> 5 -> NULL";
            Assert.Equal(expected, list.toString());

            // Insert a value into middle of list if search value id found
            list.InsertBefore(8, 4);
            expected = "1 -> 2 -> 3 -> 8 -> 4 -> 5 -> NULL";
            Assert.Equal(expected, list.toString());

            // Test that new node is not inserted if search value is not found
            list.InsertBefore(1000, 10);
            Assert.Equal(expected, list.toString());
        }

        [Fact]
        // test that node will be inserted in middle of list if search value is found
        // test that new node will be inserted at end of list if search value is found at tail 
        // test that a node will not be inserted if the search value is not found
        public void InsertAfterTest()
        {
            LinkedList<int> list = new LinkedList<int>(1);

            list.InsertAfter(2, 1);
            list.InsertAfter(3, 2);
            list.InsertAfter(4, 3);
            list.InsertAfter(5, 4);

            // test that nodes can be added to end of list if search value is found at tail of list.
            string expected = "1 -> 2 -> 3 -> 4 -> 5 -> NULL";
            Assert.Equal(expected, list.toString());

            // test that node can be insert after a search value when found in middle of list.
            list.InsertAfter(10, 2);
            expected = "1 -> 2 -> 10 -> 3 -> 4 -> 5 -> NULL";
            Assert.Equal(expected, list.toString());

            // test that a new node is not added if search value is not found
            list.InsertAfter(1000, 20);
            Assert.Equal(expected, list.toString());
        }

        [Fact]
        public void KthFromEndTest()
        {
            LinkedList<int> test = new LinkedList<int>();
            test.Insert(1);

            //Test where list just have 1 node
            Assert.Equal(1, test.KthFromEnd(0));
            Assert.Equal(1, test.KthFromEnd2(0));

            test.Insert(2);
            test.Insert(3);
            test.Insert(4);
            test.Insert(5);
           
            //Test where k is equal to a node in mid of list
            Assert.Equal(3, test.KthFromEnd(2));
            Assert.Equal(3, test.KthFromEnd2(2));

            //Test where k is greater then list
            //http://dontcodetired.com/blog/post/Testing-for-Thrown-Exceptions-in-xUnitnet
            Assert.Throws<Exception>(() => test.KthFromEnd(10));
            Assert.Throws<Exception>(() => test.KthFromEnd2(10));

            //Test where k is equal to length of list
            Assert.Equal(5, test.KthFromEnd(4));
            Assert.Equal(5, test.KthFromEnd2(4));


            // Test if k is a negative number
            Assert.Throws<Exception>(() => test.KthFromEnd(-4));
            Assert.Throws<Exception>(() => test.KthFromEnd2(-4));
        }

    }
}
