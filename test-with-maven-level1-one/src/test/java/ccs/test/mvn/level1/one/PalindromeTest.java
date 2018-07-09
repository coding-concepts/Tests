package ccs.test.mvn.level1.one;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PalindromeTest {

    @Test
    public void testPalindromeEvenTrue(){
        assertThat(Palindrome.isPalindrome("daad")).isTrue();
    }


    @Test
    public void testPalindromeOddTrue(){
        assertThat(Palindrome.isPalindrome("malayalam")).isTrue();
    }

    @Test
    public void testPalindromeEvenMixedCaseTrue(){
        assertThat(Palindrome.isPalindrome("Daad")).isTrue();
    }

    @Test
    public void testPalindromeOddMixedCaseTrue(){
        assertThat(Palindrome.isPalindrome("MalayaLam")).isTrue();
    }


    @Test
    public void testPalindromeEvenFalse(){
        assertThat(Palindrome.isPalindrome("dqgad")).isFalse();
    }


    @Test
    public void testPalindromeOddFalse(){
        assertThat(Palindrome.isPalindrome("pratyushr")).isFalse();
    }

    @Test
    public void testPalindromeEvenMixedCaseFalse(){
        assertThat(Palindrome.isPalindrome("pratyusH")).isFalse();
    }


    @Test
    public void testPalindromeOddMixedCaseFalse(){
        assertThat(Palindrome.isPalindrome("PratyushR")).isFalse();
    }
}
