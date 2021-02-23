using System;
using System.Collections.Generic;
using System.Text;

namespace HashTable.Classes
{
  class HashMap
  {
    private LinkedList<KeyValuePair<string, string>>[] Map { get; set; }

    public HashMap(int size)
    {
      Map = new LinkedList<KeyValuePair<string, string>>[size];
    }

    private int Hash(string key)
    {
      int hashValue = 0;
      //char[] letters = key.ToCharArray();
      for (int i = 0; i < key.Length; i++)
      {
        hashValue = hashValue * 100 + key[i];
      }

      hashValue = hashValue % Map.Length;

      hashValue = Math.Abs(hashValue);

      return hashValue;

    }

    public void Add(string key, string value)
    {
      int hash = Hash(key);



    }

    public string Get(string key)
    {

      return "value";
    }

    public bool Contains(string key)
    {

      return false;
    }

  }
}
