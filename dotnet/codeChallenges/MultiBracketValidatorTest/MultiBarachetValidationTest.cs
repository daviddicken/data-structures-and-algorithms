using System;
using Xunit;
using MultiBracketValidation;


namespace MultiBracketValidatorTest
{
    public class MultiBracketValidationTest
    {
        [Fact]
        public void HappyPath()
        {
            string test = "()[]{}";

            Assert.True(MultiBracket.MultiBracketValidation(test));
        }

        [Fact]
        public void ShouldFail()
        {
            string str = "(})";
            Assert.False(MultiBracket.MultiBracketValidation(str));
        }

        [Fact]
        public void LongString()
        {
            string str = "(abcd(cfrt)({{[o]}})hjvghjkkopoht)";
            Assert.True(MultiBracket.MultiBracketValidation(str));
        }
        [Fact]
        public void SmallString()
        {
            string str = "(";
            Assert.False(MultiBracket.MultiBracketValidation(str));
        }
        [Fact]
        public void NoBrackets()
        {
            string str = "Askjbhj";
            Assert.True(MultiBracket.MultiBracketValidation(str));
        }
        [Fact]
        public void OneChar()
        {
            string str = "a";
            Assert.True(MultiBracket.MultiBracketValidation(str));
        }
        [Fact]
        public void ExtraOpen()
        {
            string str = "((abc)";
            Assert.False(MultiBracket.MultiBracketValidation(str));
        }
        [Fact]
        public void ExtraClose()
        {
            string str = "(abc))";
            Assert.False(MultiBracket.MultiBracketValidation(str));
        }
        [Fact]
        public void EmptyString()
        {
            string str = "";
            Assert.Throws<NullReferenceException>(() => MultiBracket.MultiBracketValidation(str));
        }
    }
}
