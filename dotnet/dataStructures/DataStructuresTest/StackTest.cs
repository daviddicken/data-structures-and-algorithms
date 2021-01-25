using System;
using Xunit;
using DataStructures;

namespace DataStructuresTest
{
    public class StackTest
    {
        // test to push one node & test that Peek returns the top value
        [Fact]
        public void PushTest()
        {
            Stack<int> testStack = new Stack<int>();
            testStack.Push(2);
            Assert.Equal(2, testStack.Peek());
        }

        [Theory]
        [InlineData(4)]
        public void PushManyTest(int value)
        {
            Stack<int> testStack = new Stack<int>();
            testStack.Push(2);
            testStack.Push(3);
            testStack.Push(4);

            while(value > 1)
                Assert.Equal(value--, testStack.Pop());
        }
        
        [Fact]
        public void IsEmptyTest()
        {
            Stack<int> testStack = new Stack<int>();
            testStack.Push(2);
            testStack.Push(3);
            testStack.Push(4);
            testStack.Pop();
            testStack.Pop();
            testStack.Pop();

            Assert.True(testStack.IsEmpty());
        }

        // Another peek test
        [Fact]
        public void PeekTest()
        {
            Stack<int> testStack = new Stack<int>();
            testStack.Push(2);
            testStack.Push(3);
            testStack.Push(4);
            Assert.Equal(4, testStack.Peek());
        }

        // instantiate empty stack test
        [Fact]
        public void NewStackTest()
        {
            Stack<int> testStack = new Stack<int>();
            Assert.True(testStack.IsEmpty());
        }

        [Fact]
        public void PeekExceptionTest()
        {
            Stack<int> testStack = new Stack<int>();
            Assert.Throws<NullReferenceException>(() => testStack.Peek());
        }

        [Fact]
        public void PopExceptionTest()
        {
            Stack<int> test = new Stack<int>();
            Assert.Throws<NullReferenceException>(() => test.Pop());
        }
    }
}

