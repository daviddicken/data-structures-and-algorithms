using System;
using Xunit;
using Implementations;
using LeftJoin;

namespace XUnitTestProject1
{
  public class LeftJoinTest
  {
    [Fact]
    public void HappyPath()
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

      string[][] test = Program.LeftJoin(synonym, antonym);
      string[][] expected = new string[5][];
      expected[0] = new string[] { "wrath", "anger", "delight" };
      expected[1] = new string[] { "diligent", "employed", "idle" };
      expected[2] = new string[] { "outfit", "garb", "NULL" };
      expected[3] = new string[] { "guide", "usher", "follow" };
      expected[4] = new string[] { "fond", "enamored", "averse" };
      
      int counter = 0;
      
      foreach (string[] strArr in test)
      {
        if (strArr != null)
        {
          for(int i = 0; i < strArr.Length; i++)
          {
            Assert.Equal(strArr[i], expected[counter][i]);
          }
          counter++;
        }
      }
    }

  }
}
