using System;
using System.Collections.Generic;
using System.Text;

namespace Implementations
{
  public class Edge<T>
  {
    public int Weight { get; set; }
    public Vertex<T> Vertex { get; set;}
  }
}
