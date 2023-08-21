import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void repeatedSubstringPatternTest1(){
        String s = "abab";
        Assert.assertTrue(new Solution().repeatedSubstringPattern(s));
    }

    @Test
    public void repeatedSubstringPatternTest2(){
        String s = "aba";
        Assert.assertFalse(new Solution().repeatedSubstringPattern(s));
    }

    @Test
    public void repeatedSubstringPatternTest3(){
        String s = "abcabcabcabc";
        Assert.assertTrue(new Solution().repeatedSubstringPattern(s));
    }
    @Test
    public void repeatedSubstringPatternTest4(){
        String s = "abac";
        Assert.assertFalse(new Solution().repeatedSubstringPattern(s));
    }
}
