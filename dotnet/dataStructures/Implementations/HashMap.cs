using System;
using System.Collections.Generic;
using System.Text;

namespace Implementations
{
  public class HashMap
  {
    public LinkedList<KeyValuePair<string, string>>[] Map { get; set; }
    public HashMap(int size)
    {
      Map = new LinkedList<KeyValuePair<string, string>>[size];
    }
    private int Hash(string key)
    {
      if (key.Equals(""))
      {
        return -1;
      }
      int hashValue = 0;
      char[] letters = key.ToCharArray();
      for (int i = 0; i < letters.Length; i++)
      {
        hashValue += letters[i];
      }
      hashValue = (hashValue * 599) % Map.Length;
      return hashValue;
    }
    public void Add(string key, string value)
    {
      int hashKey = Hash(key);
      if (hashKey > -1)
      {
        if (Map[hashKey] == null)
        {
          Map[hashKey] = new LinkedList<KeyValuePair<string, string>>();
        }
        KeyValuePair<string, string> entry = new KeyValuePair<string, string>(key, value);
        Map[hashKey].AddFirst(entry);
      }
    }
    public string Get(string key)
    {
      int hashKey = Hash(key);
      if (Map != null && hashKey > -1)
      {
        if (Map[hashKey] != null)
        {
          LinkedListNode<KeyValuePair<string, string>> current = Map[hashKey].First;
          while (current != null)
          {
            if (current.Value.Key.Equals(key))
            {
              return current.Value.Value;
            }
            current = current.Next;
          }
        }
      }
      return null;
    }
    public bool Contains(string key)
    {
      int hashKey = Hash(key);
      if (Map != null && hashKey > -1)
      {
        if (Map[hashKey] != null)
        {
          LinkedListNode<KeyValuePair<string, string>> current = Map[hashKey].First;
          while (current != null)
          {
            if (current.Value.Key.Equals(key))
            {
              return true;
            }
            current = current.Next;
          }
        }
      }
      return false;
    }
    public void Print()
    {
      for (int i = 0; i < Map.Length; i++)
      {
        if (Map[i] != null)
        {
          Console.Write($"Bucket {i}: ");
          LinkedListNode<KeyValuePair<string, string>> current = Map[i].First;
          while (current != null)
          {
            Console.Write($"[{current.Value.Key} : {current.Value.Value}] => ");
            current = current.Next;
          }
          Console.WriteLine("Null");
        }
      }
    }
  }
}
