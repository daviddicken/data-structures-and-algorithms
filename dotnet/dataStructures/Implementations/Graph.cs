using System;
using System.Collections.Generic;
using System.Text;

namespace Implementations
{
  public class Graph<T>
  {
    public Dictionary<Vertex<T>, List<Edge<T>>> AdjacencyList { get; set; }
    public int counter = 0;

    public Graph()
    {
      AdjacencyList = new Dictionary<Vertex<T>, List<Edge<T>>>();
    }

    public Vertex<T> AddVertex(T value)
    {
      Vertex<T> node = new Vertex<T>(value);
      AdjacencyList.Add(node, new List<Edge<T>>());
      counter++;
      return node;
    }

    public void AddDirectedEdge(Vertex<T> a, Vertex<T> b, int weight = 0)
    {
      AdjacencyList[a].Add(
          new Edge<T>
          {
            Weight = weight,
            Vertex = b
          });
    }

    public void AddUndirectedEdge(Vertex<T> a, Vertex<T> b, int weight = 0)
    {
      AddDirectedEdge(a, b, weight);
      AddDirectedEdge(b, a, weight);
    }

    public List<Edge<T>> GetNeighbors(Vertex<T> home) => AdjacencyList[home];

    public int Size() => counter;

    public HashSet<Vertex<T>> GetNodes()
    {
      HashSet<Vertex<T>> nodes = new HashSet<Vertex<T>>();

      foreach(Vertex<T> item in AdjacencyList.Keys)
      {
        nodes.Add(item);
      }

      return nodes;
    }
    
    public void PrintGraph()
    {
      foreach (var item in AdjacencyList)
      {
        Console.Write($"{item.Key.Value}: ");
        foreach (var edge in item.Value)
        {
          Console.Write($"{edge.Vertex.Value} ->");
        }
        Console.WriteLine("");
      }
    }

    public void BreadthFirst()
    {
      
    }
  }
}
