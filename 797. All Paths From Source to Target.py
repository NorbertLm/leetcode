class Solution:
    def allPathsSourceTarget(self, graph):
        """
        :type graph: List[List[int]]
        :rtype: List[List[int]]
        """        
        def findPath(graph, curr, path, output):
            new_path = path[:]
            new_path.append(curr)
            
            if not graph[curr]:
                output.append(new_path[:])
            
            for nums in graph[curr]:
                findPath(graph, nums, new_path, output)
        
        output = []
        findPath(graph, 0, [], output)
        
        return output
