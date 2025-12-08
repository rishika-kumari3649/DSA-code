s="hello world"
char_hash={}
for ch in s:
    char_hash[ch]=char_hash.get(ch,0)+1
print(char_hash)