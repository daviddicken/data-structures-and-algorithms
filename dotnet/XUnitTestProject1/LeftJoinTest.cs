using System;
using Xunit;
using Implementations;
using LeftJoin;

namespace XUnitTestProject1
{
  public class LeftJoinTest
  {
    [Fact]
    public void Test1()
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

      string [] 

      string[][] test = Program.LeftJoin(synonym, antonym);

      foreach (string[] strArr in test)
      {
        if (strArr != null)
        {

          Console.WriteLine(strArr[0] + " " + strArr[1] + " " + strArr[2]);
        }
      }
    }
  }
}
