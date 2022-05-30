https://leetcode.com/problems/combination-sum-ii/

Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList<Integer>();
        Arrays.sort(candidates);
        helper(result, curr, 0, target, candidates);
        return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> curr, int start, int target, int[] candidates){
    if(target==0){
        result.add(new ArrayList<Integer>(curr));
        return;
    }
    if(target<0){
        return;
    }
 
    int prev=-1;
    for(int i=start; i<candidates.length; i++){
        if(prev!=candidates[i]){ 
            curr.add(candidates[i]);
            helper(result, curr, i+1, target-candidates[i], candidates); 
            curr.remove(curr.size()-1);
            prev=candidates[i];
        }
    }
    }
}