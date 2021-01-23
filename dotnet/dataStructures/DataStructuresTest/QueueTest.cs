using System;
using Xunit;
using DataStructures;

namespace DataStructuresTest
{
    public class QueueTest
    {
       [Fact]
       public void EnQueueTest()
        {
            Queue<int> testQ = new Queue<int>();
            testQ.EnQueue(1);
            Assert.Equal(1, testQ.Front.Value);
        }

        // using multiple asserts to prove that multiple nodes were enQueued
        [Fact]
        public void EnQueueManyTest()
        {
            Queue<int> testQ = new Queue<int>();
            testQ.EnQueue(1);
            testQ.EnQueue(2);
            testQ.EnQueue(3);
            
            Assert.Equal(1, testQ.DeQueue());
            Assert.Equal(2, testQ.DeQueue());
            Assert.Equal(3, testQ.DeQueue());
        }

        [Fact]
        public void DeQueueTest()
        {
            Queue<int> testQ = new Queue<int>();
            testQ.EnQueue(1);

            Assert.Equal(1, testQ.DeQueue());
        }

        [Fact]
        public void PeekTest()
        {
            Queue<int> testQ = new Queue<int>();
            testQ.EnQueue(1);
            testQ.EnQueue(2);
            testQ.EnQueue(3);

            Assert.Equal(1, testQ.Peek());
        }

        [Fact]
        public void EmptyAQueueTest()
        {
            Queue<int> testQ = new Queue<int>();
            testQ.EnQueue(1);
            testQ.EnQueue(2);
            testQ.EnQueue(3);

            testQ.DeQueue();
            testQ.DeQueue();
            testQ.DeQueue();

            Assert.True(testQ.IsEmpty());
        }

        [Fact]
        public void InstantiateQueueTest()
        {
            Queue<int> testQ = new Queue<int>();
            Assert.True(testQ.IsEmpty());
        }

        [Fact]
        public void PeekExceptionTest()
        {
            Queue<int> testQ = new Queue<int>();
            Assert.Throws<NullReferenceException>(() => testQ.Peek());
        }

        [Fact]
        public void DeQueueExceptionTest()
        {
            Queue<int> testQ = new Queue<int>();
            Assert.Throws<NullReferenceException>(() => testQ.DeQueue());
        }
    }
}
