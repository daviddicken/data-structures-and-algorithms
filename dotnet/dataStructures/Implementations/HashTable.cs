using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Implementations
{
  public class HashBucket<K, V>
  {
    public K Key { get; set; }
    public V Value { get; set; }

    public HashBucket(K newKey, V newValue)
    {
      Key = newKey;
      Value = newValue;
    }
  }

  public class HashTable<K, V>
  {
    public HashBucket<K, V>[] buckets { get; set; }
    int elements { get; set; }
    int Size { get; set; }
    int SizeIncrease { get; set; }

    public HashTable(int size = 100)
    {
      buckets = new HashBucket<K, V>[size];
      SizeIncrease = 100;
    }

    public void SetSizeInc(int NewSizeInc)
    {
      SizeIncrease = NewSizeInc;
    }

    public int Hash(K key)
    {
      if (key.Equals(typeof(object))) 
        return key.GetHashCode();

      if (!key.Equals(typeof(string))) 
        return DoTheHash(key.ToString());

      return DoTheHash(key.ToString());


    }
    private int DoTheHash(string key)
    {
      int hashValue = 0;
      char[] letters = key.ToCharArray();
      for (int i = 0; i < letters.Length; i++)
      {
        hashValue += letters[i];
      }
      hashValue = (hashValue * 599) % buckets.Length;
      return hashValue;
    }

    public bool Contains(K key)
    {
      int hashKey = Hash(key);
      if (buckets[hashKey] != null) 
        return true;

      return false;
    }

    public void Add(K key, V value)
    {
      while (Contains(key)) 
      {
        IncreaseSize();
      }
      int hashKey = Hash(key);

      buckets[hashKey] = new HashBucket<K, V>(key, value);

    }
  

    public void IncreaseSize()
    {
      Size += SizeIncrease;
      HashTable<K,V> newBuckets = new HashTable<K,V>(Size);
      for(int i = 0; i < buckets.Length; i++)
      {
        // create temp buckets
        // replace buckets with new buckets
        // call add function for each item in temp buckets

        if (buckets[i] != null)
        {
          //newBuckets.Add;
        }
      }
      
    }
  }// end of hashtable class
}// end of namespace
