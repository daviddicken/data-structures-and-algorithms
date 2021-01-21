using LLZip;
using System;
using Xunit;
using DataStructures;

namespace CodeChallengeTests
{
    public class UnitTest1
    {
        [Fact]
        public void ZipListTest()
        {
            LinkedList<int> evens = new LinkedList<int>();
            evens.Append(2);
            evens.Append(4);
            evens.Append(6);
            evens.Append(8);

            LinkedList<int> odds = new LinkedList<int>();
            evens.Append(1);
            evens.Append(3);
            evens.Append(5);
            evens.Append(7);

            Program.LLZip(odds, evens);
        }
    }
}
