using System;
using System.Collections.Generic;
using Implementations;

namespace LeftJoin
{
  public class Program
  {
    static void Main(string[] args)
    {
      HashMap synonym = new HashMap(20);
      synonym.Add("fond", "enamored");
      synonym.Add("wrath", "anger");
      synonym.Add("diligent", "employed");
      synonym.Add("outfit", "garb"); 
      synonym.Add("guide", "usher");

      HashMap antonym = new HashMap(20);
      antonym.Add("fond", "averse");
      antonym.Add("wrath", "delight");
      antonym.Add("diligent", "idle");
      antonym.Add("guide", "follow");
      antonym.Add("flow", "jam");

      string[][] test = LeftJoin(synonym, antonym);

      foreach(string [] strArr in test)
      { 
        if(strArr != null)
        {
           Console.WriteLine( strArr[0] + " " + strArr[1] + " " + strArr[2]);
        }
      }
    }

    public static string[][] LeftJoin(HashMap mapA, HashMap mapB)
    {
      string[][] returnArr = new string[mapA.Map.Length][];
      
      for(int i = 0; i< mapA.Map.Length; i++)
      {
        if(mapA.Map[i] != null)
        {
          LinkedListNode<KeyValuePair<string, string>> current = mapA.Map[i].First;
          returnArr[i] = new string[3];
          returnArr[i][0] = current.Value.Key;
          returnArr[i][1] = current.Value.Value;

          if (mapB.Contains(current.Value.Key))
          {
            LinkedListNode<KeyValuePair<string, string>> currentB = mapB.Map[i].First;
            returnArr[i][2] = currentB.Value.Value;
          }
          else
          {
            returnArr[i][2] = "NULL";
          }
        }
      }
      return returnArr;
    }
  }
}
