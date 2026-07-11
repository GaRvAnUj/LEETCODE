class Solution(object):
    def duplicateZeros(self, arr):
        """
        :type arr: List[int]
        :rtype: None Do not return anything, modify arr in-place instead.
        """
        possible_dups=0
        length=len(arr)-1
        i=0
        while i<=length-possible_dups:
            if arr[i]==0:
                if i==length-possible_dups:
                    arr[length]=0
                    length-=1
                    break
                possible_dups+=1
            i+=1
        last=length-possible_dups
        for j in range(last,-1,-1):
            if arr[j]==0:
                arr[j+possible_dups]=0
                possible_dups-=1
                arr[j+possible_dups]=0
            else:
                arr[j+possible_dups]=arr[j]
        