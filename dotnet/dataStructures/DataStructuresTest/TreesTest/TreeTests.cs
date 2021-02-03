using System;
using Xunit;
using Trees;
using System.Collections;

namespace TreesTest
{
    public class TreeTests
    {
        [Fact]
        public void BinaryTreeAddOne()
        {
            Tree<int> tree = new Tree<int>();
            tree.addNode(1);
            Assert.Equal(1, tree.Root.Value);
        }
        [Fact]
        public void BinaryTreeAddTwo()
        {
            Tree<int> tree = new Tree<int>();
            tree.addNode(1);
            tree.addNode(2);
            Assert.Equal(2, tree.Root.LeftChild.Value);
        }
        [Fact]
        public void BinaryTreeAddThree()
        {
            Tree<int> tree = new Tree<int>();
            tree.addNode(1);
            tree.addNode(2);
            tree.addNode(3);
            Assert.Equal(3, tree.Root.RightChild.Value);
        }
        [Fact]
        public void EmptyBinaryTree()
        {
            Tree<int> tree = new Tree<int>();
            Assert.Null(tree.Root);
        }
        [Fact]
        public void CreateBinaryTreeOneNode()
        {
            Tree<int> tree = new Tree<int>(1);
            Assert.Equal(1, tree.Root.Value);
        }
       [Fact]
       public void BinaryTreePreOrder()
        {
            Tree<int> tree = new Tree<int>();
            tree.addNode(0);
            tree.addNode(1);
            tree.addNode(2);
            tree.addNode(3);
            tree.addNode(4);
            int[] expected = new int[] { 0, 3, 1, 4, 2 };
            Assert.Equal(expected, tree.PreOrder());
        }
        [Fact]
        public void BinaryTreeInOrder()
        {
            Tree<int> tree = new Tree<int>();
            tree.addNode(1);
            tree.addNode(2);
            tree.addNode(3);
            tree.addNode(4);
            tree.addNode(5);
            int[] expected = new int[] { 4, 2, 5, 1, 3 };
            Assert.Equal(expected, tree.InOrder());
        }
        [Fact]
        public void BinaryTreePostOrder()
        {
            Tree<int> tree = new Tree<int>();
            tree.addNode(1);
            tree.addNode(2);
            tree.addNode(3);
            tree.addNode(4);
            tree.addNode(5);
            int[] expected = new int[] { 4, 5, 2, 3, 1 };
            Assert.Equal(expected, tree.PostOrder());
        }

        //=================== Binary Search tree test's =============
        [Fact]
        public void BSTAddOne()
        {
            BST tree = new BST();
            tree.Add(1);
            Assert.Equal(1, tree.Root.Value);        
        }
        [Fact]
        public void BSTAddTwo()
        {
            BST tree = new BST();
            tree.Add(5);
            tree.Add(1);
            Assert.Equal(1, tree.Root.LeftChild.Value);
          
        }
        [Fact]
        public void BSTAddThree()
        {
            BST tree = new BST();
            tree.Add(5);
            tree.Add(1);
            tree.Add(10);
            Assert.Equal(10, tree.Root.RightChild.Value);
        }
        [Fact]
        public void EmptyBST()
        {
            BST tree = new BST();
            Assert.Null(tree.Root);
        }
        [Fact]
        public void CreateBSTOneNode()
        {
            BST tree = new BST(1);
            Assert.Equal(1, tree.Root.Value);
        }
       [Fact]
       public void ContainsTestLow()
        {
            BST tree = new BST();
            tree.Add(10);
            tree.Add(5);
            tree.Add(2);
            tree.Add(15);
            tree.Add(20);
            tree.Add(1);
            tree.Add(19);
            Assert.True(tree.Contains(1));
        }
        [Fact]
        public void ContainsTestHigh()
        {
            BST tree = new BST();
            tree.Add(10);
            tree.Add(5);
            tree.Add(2);
            tree.Add(15);
            tree.Add(20);
            tree.Add(1);
            tree.Add(19);
            Assert.True(tree.Contains(20));
        }
        [Fact]
        public void NotContainsTest()
        {
            BST tree = new BST();
            tree.Add(10);
            tree.Add(5);
            tree.Add(2);
            tree.Add(15);
            tree.Add(20);
            tree.Add(1);
            tree.Add(19);
            Assert.False(tree.Contains(12));
        }
        //============= Max value binary tree tests============
        [Fact]
        public void MaxValueTest()
        {
            Tree<int> tree = new Tree<int>();
            tree.addNode(10);
            tree.addNode(5);
            tree.addNode(2);
            tree.addNode(15);
            tree.addNode(20);
            tree.addNode(1);
            tree.addNode(19);
            Assert.Equal(20,tree.FindMaximumValue());
        }

        [Fact]
        public void MaxException()
        {
            Tree<int> tree = new Tree<int>();

            Assert.Throws<NullReferenceException>(() => tree.FindMaximumValue());
        }
    }
}
