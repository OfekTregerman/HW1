public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j)
        {
            return 0;
        }

        int n = m.length;

        int[] distances = new int[n];
        for (int k = 0; k < n; k++)
        {
            distances[k] = -1;
        }
        distances[i] = 0;

        int[] queue = new int[n];
        int head = 0;
        int tail = 0;
        queue[tail] = i;
        tail++;

        while (head < tail)
        {
            int current = queue[head];
            head++;

            for (int v = 0; v < n; v++)
            {
                if (m[current][v] == 1 && distances[v] == -1)
                {
                    distances[v] = distances[current] + 1; 

                    if (v == j)
                    {
                        return distances[v];
                    }

                    queue[tail] = v;
                    tail++;
                }
            }
            }
            
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}