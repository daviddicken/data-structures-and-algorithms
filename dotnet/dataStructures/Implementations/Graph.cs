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

    /// <summary>
    /// AddVertex takes in a generic value and creates a vertex with the value. A new empty list is created for the edges and both are added as a key value pair to the AdjancencyList Dictionary
    /// </summary>
    /// <param name="value">Generic Value</param>
    /// <returns>Vertex</returns>
    public Vertex<T> AddVertex(T value)
    {
      Vertex<T> node = new Vertex<T>(value);
      AdjacencyList.Add(node, new List<Edge<T>>());
      counter++;
      return node;
    }

    /// <summary>
    /// AddDiretedEdge takes in to vertices and a weigth and creates a edge one way from Vertex A to Vertex B. If a weight is not supplied it will be set to 0.
    /// </summary>
    /// <param name="a">Vertex A</param>
    /// <param name="b">Vertex B</param>
    /// <param name="weight">Integer</param>
    public void AddDirectedEdge(Vertex<T> a, Vertex<T> b, int weight = 0)
    {
      AdjacencyList[a].Add(
          new Edge<T>
          {
            Weight = weight,
            Vertex = b
          });
    }

    /// <summary>
    /// AddUndirectedEdge takes in 2 vertices and a weight. It creates two edges one from Vertex A to Vertex B
    /// </summary>
    /// <param name="a">Vertex A</param>
    /// <param name="b">Vertex B</param>
    /// <param name="weight">Integer</param>
    public void AddUndirectedEdge(Vertex<T> a, Vertex<T> b, int weight = 0)
    {
      AddDirectedEdge(a, b, weight);
      AddDirectedEdge(b, a, weight);
    }

    /// <summary>
    /// GetNeighbors takes in a Vertex and returns a list of all the edges connected to that Vertex
    /// </summary>
    /// <param name="home">Vertex</param>
    /// <returns>List of Edges</returns>
    public List<Edge<T>> GetNeighbors(Vertex<T> home) => AdjacencyList[home];

    /// <summary>
    /// Size returns a Integer representing the count of vertices in the graph
    /// </summary>
    /// <returns>Integer</returns>
    public int Size() => counter;

    /// <summary>
    /// GetNodes returns a hashset of all Vetrices in the graph.
    /// </summary>
    /// <returns>Hahsset</returns>
    public HashSet<Vertex<T>> GetNodes()
    {
      HashSet<Vertex<T>> nodes = new HashSet<Vertex<T>>();

      foreach(Vertex<T> item in AdjacencyList.Keys)
      {
        nodes.Add(item);
      }

      return nodes;
    }
    
    /// <summary>
    /// PrintGraph prints a visual representation of the graph to the console.
    /// </summary>
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
