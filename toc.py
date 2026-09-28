import re

pattern = r'^[ab]*abb$'

strings = ["abb", "aabb", "ababb", "abab", "aaa", "bba"]

for s in strings:
    if re.fullmatch(pattern, s):
        print(s, "-> Accepted")
    else:
        print(s, "-> Rejected")