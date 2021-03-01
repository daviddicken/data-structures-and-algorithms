using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Implementations
{
  class HashTable<K, V>
  {
    List<KeyValuePair<K, V>>[] buckets { get; set; }
    int size { get; set; }

    public HashTable() 
    {
      buckets = new List<KeyValuePair<K, V>>[1024];
    }

    public int Hash(K key)
    {
      //if(key.GetType() == string)
      //{

      //}
      return 0;
    }
    public bool Contains(K key)
    {


      return false;
    }

  }
}
