class Solution:
    def reverseWords(self, s: str) -> str:
        strip=s.strip()
        words=strip.split()
        reversed_words=words[::-1]

        return ' '.join(reversed_words)