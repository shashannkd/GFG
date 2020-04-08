t = int(input())
for i in range(t):
    n = int(input())
    _list = set(range(1,n+1))
    _input = set(map(int,input().split()))
    print(str(list(_list-_input)[0]))