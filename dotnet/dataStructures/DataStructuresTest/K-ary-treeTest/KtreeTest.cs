using System;
using Xunit;
using k_ary_tree;

namespace K_ary_treeTest
{
    public class KtreeTest
    {
        [Fact]
        public void CreateTreeWithValue()
        {
            KTree<int> tree = new KTree<int>(5,6);
            Assert.Equal(6, tree.Root.Value);
        }
        [Fact]
        public void AddChild()
        {
            KTree<int> tree = new KTree<int>(5);
            tree.Add(1);
            Assert.Equal(1, tree.Root.Value);
        }
        [Fact]
        public void AddTwoChildren()
        {
            KTree<int> tree = new KTree<int>(5);
            tree.Add(1);
            tree.Add(2);
      
            Assert.Equal(2,tree.Root.Kids[0].Value);
        }
        [Fact]
        public void KidLimit()
        {
            KTree<int> tree = new KTree<int>(3);
            tree.Add(1);
            tree.Add(2);
            tree.Add(3);
            tree.Add(4);

            Assert.Equal(3, tree.Root.Kids.Count);

        }
    }
}
