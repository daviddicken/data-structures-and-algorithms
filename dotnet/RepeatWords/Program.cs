using System;
using System.Collections.Generic;
using System.Text.RegularExpressions;

namespace RepeatWord
{
  public class Program
  {
    static void Main(string[] args)
    {
      string input = "!23 Hello my name is not hello!!!!!***";
      Console.WriteLine(RepeatWord(input));
    }

    //https://www.geeksforgeeks.org/removing-punctuations-given-string/
    //by 29AjayKumar
    public static string RepeatWord(string str)
    {
      HashSet<string> set = new HashSet<string>();

      str = Regex.Replace(str, @"[^\w\d\s]","").ToLower();

      string[] words = str.Split(' ');

      foreach (string word in words)
      {
        if (set.Contains(word)) return word;
        set.Add(word);
      }
      return "No Duplicates found";
    }
 
  }
}
