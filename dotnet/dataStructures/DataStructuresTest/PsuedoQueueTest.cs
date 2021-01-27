using System;
using Xunit;
using DataStructures;

namespace DataStructuresTest
{
    public class PsuedoQueueTest
    {

        [Fact]
        public void EnQueueTest()
        {
            PsuedoQueue<int> test = new PsuedoQueue<int>();
            test.EnQueue(1);

            Assert.Equal(1, test.DeQueue());
        }

        [Theory]
        [InlineData(1)]
        public void EnQueueManyTest(int val)
        {
            PsuedoQueue<int> test = new PsuedoQueue<int>();
            test.EnQueue(1);
            test.EnQueue(2);
            test.EnQueue(3);

            while (val < 4)
                Assert.Equal(val++, test.DeQueue());
        }

        [Theory]
        [InlineData(20)]
        [InlineData(10)]
        [InlineData(5)]

        public void DeQueueTest(int val)
        {
            PsuedoQueue<int> test = new PsuedoQueue<int>();
            test.EnQueue(val);
            Assert.Equal(val, test.DeQueue());
        }

        [Fact]
        public void DeQueueManyTest()
        {
            PsuedoQueue<int> test = new PsuedoQueue<int>();
            test.EnQueue(1);
            test.EnQueue(2);
            test.EnQueue(3);
            test.EnQueue(4);
            test.DeQueue();
            test.DeQueue();
            test.DeQueue();

            Assert.Equal(4, test.DeQueue());
        }

        [Fact]
        public void DeQueueTooManyTest()
        {
            PsuedoQueue<int> test = new PsuedoQueue<int>();
            Assert.Throws<NullReferenceException>(() => test.DeQueue());
        }
    }

}
