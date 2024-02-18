class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        l=[]
        v=list(set(nums))
        for i in v:
            if nums.count(i)>len(nums)/3:
                if i not in l:
                    l.append(i)
        return l
        