using System;
using Xunit;
using RepeatWord;

namespace RepeatWordTest
{
  public class RepeatWordTest
  {
    [Fact]
    public void HappyPath()
    {
      string input = "!23 Hello my name is not hello!!!!!***";
      Assert.Equal("hello", Program.RepeatWord(input));
    }

    [Fact]
    public void NoRepeat()
    {
      string input = "!23 Hello my name is not!!!!!***";
      Assert.Equal("No Duplicates found", Program.RepeatWord(input));
    }
  }
}
