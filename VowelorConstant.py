def is_vowel(ch):
    if ch.lower() in "aeiou":
        return True
    else:
        return False
    

char=input("Enter the character:")
if is_vowel(char):
    print("It is vowel")
else:
    print("It is constant")