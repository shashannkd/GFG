t = int(input())

for i in range(t):
    words = input().split()
    if(sorted(list(words[0])) == sorted(list(words[1]))):
        print("YES")
    else:
        print("NO")