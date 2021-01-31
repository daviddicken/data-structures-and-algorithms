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
        
        }
        [Fact]
        public void BSTAddTwo()
        {
          
        }
        [Fact]
        public void BSTAddThree()
        {
           
        }
        [Fact]
        public void EmptyBST()
        {

        }
        [Fact]
        public void CreateBSTOneNode()
        {

        }
        [Fact]
        public void BSTPreOrder()
        {

        }
        [Fact]
        public void BSTInOrder()
        {

        }
        [Fact]
        public void BSTPostOrder()
        {

        }
    }
}
