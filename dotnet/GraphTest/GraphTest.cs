using System;
using Xunit;
using Implementations;
using System.Collections.Generic;

namespace GraphTest
{
  public class GraphTest
  {
    [Fact]
    public void AddNode()
    {
      Graph<int> testGraph = new Graph<int>();

      Assert.Equal(0, testGraph.Size());
      testGraph.AddVertex(10);
      Assert.Equal(1, testGraph.Size());

    }

    [Fact]
    public void AddEdge()
    {
      Graph<string> testGraph = new Graph<string>();
      Vertex<string> vertA = testGraph.AddVertex("A");
      Vertex<string> vertB = testGraph.AddVertex("B");

      testGraph.AddUndirectedEdge(vertA, vertB);
      //List<Edge<string>> edges = testGraph.GetNeighbors(vertA);
      
      foreach(Vertex<string> vert in testGraph.AdjacencyList.Keys)
      {
        List<Edge<string>> edges = testGraph.GetNeighbors(vert);
        foreach(Edge<string> edge in edges)
        {
          if(vert.Value == "A")
          {
            Assert.Equal("B", edge.Vertex.Value);
          }
          else
          {
            Assert.Equal("A", edge.Vertex.Value);

          }
        }

      }





    }
  }
}
