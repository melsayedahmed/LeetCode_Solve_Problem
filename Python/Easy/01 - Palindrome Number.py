#  Link in Leetcode
#  https://leetcode.com/problems/palindrome-number/


#  (----------------------------- THE ANSWER -----------------------------)


class Solution:
    def isPalindrome(self, x):
        if x > 0:
            temp = x
            rev_int_elements = []
            while temp > 0:
                digit = temp % 10
                rev_int_elements.append(digit)
                temp = temp // 10
            org_int_elements = rev_int_elements[::-1]
            return rev_int_elements == org_int_elements
        elif x == 0:
            return True
        else:
            return False